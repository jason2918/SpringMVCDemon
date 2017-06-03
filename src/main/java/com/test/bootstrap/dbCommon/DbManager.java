package com.test.bootstrap.dbCommon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.test.bootstrap.utils.PropertiesUtils;

/**
 * 封装apache DbUtils工具
 * @author liangjc
 *
 */
public class DbManager {
	private static final Logger logger = LoggerFactory.getLogger(DbManager.class);
	
	private static final String MYSQL_DRIVER = "com.mysql.jdbc.Driver";
	private static String defDBUrl = "jdbc:mysql://%s:%d/%s?autoReconnect=true&zeroDateTimeBehavior=convertToNull&character_set_server=utf8mb4";
	
	/*
	 * key:完整的dbName
	 */
	private static Map<String, Connection> dbConnctionMap = new ConcurrentHashMap<String, Connection>();
	
	/**
	 * @param dbFlag 对应application.properties中数据源的DB标识
	 * @param dbNamePostFix 对应application.perperties中配置的dbName后缀
	 * @return
	 * @throws Exception 
	 */
	public static Connection getConnection(String dbFlag, Integer dbNamePostFix) throws Exception {
		if (StringUtils.isEmpty(dbFlag)) {
			logger.error("[DbManager.getConnection] param dbFlag is null or empty!");
			return null;
		}
		DbConfigBean dbConfigBean = PropertiesUtils.getDbBeanProperty(dbFlag);
		if (null == dbConfigBean) {
			logger.error("[DbManager.getConnection] get DbConfigBean error!");
			return null;
		}
		
		justDbName(dbConfigBean, dbNamePostFix);
		if (dbConnctionMap.containsKey(dbConfigBean.getDB_NAME())) {
			return dbConnctionMap.get(dbConfigBean.getDB_NAME());
		}
		 
		return getConnection(dbConfigBean);
	}
	
	private static void justDbName(DbConfigBean dbConfigBean, Integer dbNamePostFix) throws Exception {
		if (null == dbNamePostFix && dbConfigBean.getIS_PREFIX_DBNAME().equalsIgnoreCase("NO")) {
			return;
		} else if (null == dbNamePostFix && dbConfigBean.getIS_PREFIX_DBNAME().equalsIgnoreCase("YES")) {
			throw new Exception("application.properties配置错误, 此DB只有一个库，而配置文件 IS_PREFIX_DBNAME只能为NO");
		} else if (null != dbNamePostFix && dbConfigBean.getIS_PREFIX_DBNAME().equalsIgnoreCase("NO")) {
			throw new Exception("application.properties配置错误, 此DB只有多个库，而配置文件 IS_PREFIX_DBNAME只能为YES");
		}
		
		if (null != dbConfigBean.getIS_PREFIX_DBNAME() && dbConfigBean.getIS_PREFIX_DBNAME().equalsIgnoreCase("YES")) {
			//注意：此时配置文件中的DB_NAME需要配置对应该的占位符%d, 而且只能配置一个占位符
			if (!dbConfigBean.getDB_NAME().contains("%")) {
				throw new Exception ("application.properties配置错误, 此时配置文件中的DB_NAME需要配置对应该的占位符%d, 而且只能配置一个占位符!");
			}
			String dbName = String.format(dbConfigBean.getDB_NAME(), dbNamePostFix);
			dbConfigBean.setDB_NAME(dbName);
		} else {
			throw new Exception("application.properties配置错误导致获取连接失败！");
		}
	}
	
	private static synchronized Connection getConnection(DbConfigBean dbBean) {
		Connection conn = null;
		try {
			Class.forName(MYSQL_DRIVER);
			
			String dbUrl = String.format(defDBUrl, dbBean.getIP(), dbBean.getPORT(), dbBean.getDB_NAME());
			
			conn = DriverManager.getConnection(dbUrl, dbBean.getUSER_NAME(), dbBean.getPASSWORD());
			if (!dbConnctionMap.containsKey(dbBean.getDB_NAME())) {
				dbConnctionMap.put(dbBean.getDB_NAME(), conn);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	
}

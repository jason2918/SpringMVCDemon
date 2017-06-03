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
 * ��װapache DbUtils����
 * @author liangjc
 *
 */
public class DbManager {
	private static final Logger logger = LoggerFactory.getLogger(DbManager.class);
	
	private static final String MYSQL_DRIVER = "com.mysql.jdbc.Driver";
	private static String defDBUrl = "jdbc:mysql://%s:%d/%s?autoReconnect=true&zeroDateTimeBehavior=convertToNull&character_set_server=utf8mb4";
	
	/*
	 * key:������dbName
	 */
	private static Map<String, Connection> dbConnctionMap = new ConcurrentHashMap<String, Connection>();
	
	/**
	 * @param dbFlag ��Ӧapplication.properties������Դ��DB��ʶ
	 * @param dbNamePostFix ��Ӧapplication.perperties�����õ�dbName��׺
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
			throw new Exception("application.properties���ô���, ��DBֻ��һ���⣬�������ļ� IS_PREFIX_DBNAMEֻ��ΪNO");
		} else if (null != dbNamePostFix && dbConfigBean.getIS_PREFIX_DBNAME().equalsIgnoreCase("NO")) {
			throw new Exception("application.properties���ô���, ��DBֻ�ж���⣬�������ļ� IS_PREFIX_DBNAMEֻ��ΪYES");
		}
		
		if (null != dbConfigBean.getIS_PREFIX_DBNAME() && dbConfigBean.getIS_PREFIX_DBNAME().equalsIgnoreCase("YES")) {
			//ע�⣺��ʱ�����ļ��е�DB_NAME��Ҫ���ö�Ӧ�õ�ռλ��%d, ����ֻ������һ��ռλ��
			if (!dbConfigBean.getDB_NAME().contains("%")) {
				throw new Exception ("application.properties���ô���, ��ʱ�����ļ��е�DB_NAME��Ҫ���ö�Ӧ�õ�ռλ��%d, ����ֻ������һ��ռλ��!");
			}
			String dbName = String.format(dbConfigBean.getDB_NAME(), dbNamePostFix);
			dbConfigBean.setDB_NAME(dbName);
		} else {
			throw new Exception("application.properties���ô����»�ȡ����ʧ�ܣ�");
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

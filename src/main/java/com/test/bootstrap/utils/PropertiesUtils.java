package com.test.bootstrap.utils;

import java.io.IOException;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import com.alibaba.fastjson.JSON;
import com.test.bootstrap.dbCommon.DbConfigBean;

/**
 * 读取配置文件,封装为数据库连接数据结构体返回
 * @author liangjc
 *
 */
public class PropertiesUtils {
	private static Logger logger = LoggerFactory.getLogger(PropertiesUtils.class);
	private static final String propResource = "application.properties";
	private static Properties props = new Properties();
	
	static {
		try {
			//这三种都可以读到. 其实resouce目录是classPath目录
			props = PropertiesLoaderUtils.loadAllProperties(propResource);
			//2:
//			Resource resource = new ClassPathResource(propResource);
//			props = PropertiesLoaderUtils.loadProperties(resource);
			//3:
//			InputStream is = PropertiesUtils.class.getClassLoader().getResourceAsStream(propResource);
//			props.load(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static DbConfigBean getDbBeanProperty(String key) {
		String value = props.getProperty(key);
		try {
			DbConfigBean dbBean = JSON.parseObject(value, DbConfigBean.class);
			if (null == dbBean) {
				throw new Exception("getDbBeanProperty error, dbBean is null!");
			}
			return dbBean;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static String getProperty(String key) {
		return props.getProperty(key);
	}
	
	public static String getProperty(String key, String defVal) {
		return props.getProperty(key, defVal);
	}
	
}

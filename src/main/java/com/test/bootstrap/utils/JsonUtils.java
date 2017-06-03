package com.test.bootstrap.utils;

import com.alibaba.fastjson.JSON;
import com.test.bootstrap.dbCommon.DbConfigBean;

public class JsonUtils {
	public static void main(String[] args) {
		String str = "{\"IP\":\"127.0.0.1\",\"PORT\":3306,\"DB_NAME\":\"vip_mock\",\"USER_NAME\":\"root\",\"PASSWORD\":\"\",\"IS_PREFIX_DBNAME\":\"NO\"}";
		
		DbConfigBean b = (DbConfigBean)JSON.parseObject(str, DbConfigBean.class);
		System.out.println(JSON.toJSON(b));
	
	}
}

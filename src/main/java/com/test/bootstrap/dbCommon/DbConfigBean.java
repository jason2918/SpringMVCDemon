package com.test.bootstrap.dbCommon;

public class DbConfigBean {

	private String IP;
	private Integer PORT;
	private String DB_NAME;
	private String USER_NAME;
	private String PASSWORD;
	/*
	 * 标识DB_NAME是否为DB前缀配置，若为YES，则调用方需要组合成正确的DB_NAME
	 */
	private String IS_PREFIX_DBNAME = "NO";
	public String getIP() {
		return IP;
	}
	public void setIP(String iP) {
		IP = iP;
	}
	public Integer getPORT() {
		return PORT;
	}
	public void setPORT(Integer pORT) {
		PORT = pORT;
	}
	public String getDB_NAME() {
		return DB_NAME;
	}
	public void setDB_NAME(String dB_NAME) {
		DB_NAME = dB_NAME;
	}
	public String getUSER_NAME() {
		return USER_NAME;
	}
	public void setUSER_NAME(String uSER_NAME) {
		USER_NAME = uSER_NAME;
	}
	public String getPASSWORD() {
		return PASSWORD;
	}
	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}
	public String getIS_PREFIX_DBNAME() {
		return IS_PREFIX_DBNAME;
	}
	public void setIS_PREFIX_DBNAME(String iS_PREFIX_DBNAME) {
		IS_PREFIX_DBNAME = iS_PREFIX_DBNAME;
	}
	
}

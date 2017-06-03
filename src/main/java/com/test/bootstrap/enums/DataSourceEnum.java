package com.test.bootstrap.enums;

/**
 * 定义数据源名称
 * @author liangjc
 *
 */
public enum DataSourceEnum {

	VIP_GOODS("datasource.vipGoods", 1),
	VIP_STOCK("datasource.vipStock", 32),
	VIP_POC("datasource.vipGoods",1);
	
	/*
	 * 对应配置文件application.properties中的数据源key
	 */
	private String dbFlag; 
	private Integer value;
	
	private DataSourceEnum(String dbFlag, Integer value) {
		this.dbFlag = dbFlag;
		this.value = value;
	}

	
	public String getDbFlag() {
		return dbFlag;
	}

	public Integer getValue() {
		return value;
	}

	public String getDbFlag(DataSourceEnum srcEnum) {
		return srcEnum.getDbFlag();
	}
	
	public Integer getValue(DataSourceEnum srcEnum) {
		return srcEnum.getValue();
	}
	
	public DataSourceEnum getEnumByFlag(String dbFlag) {
		for (DataSourceEnum dsEnum : DataSourceEnum.values()) {
			if (dsEnum.getDbFlag().equals(dbFlag)) {
				return dsEnum;
			}
		}
		return null;
	}
}

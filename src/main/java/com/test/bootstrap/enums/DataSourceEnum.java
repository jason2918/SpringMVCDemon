package com.test.bootstrap.enums;

/**
 * ��������Դ����
 * @author liangjc
 *
 */
public enum DataSourceEnum {

	VIP_GOODS("datasource.vipGoods", 1),
	VIP_STOCK("datasource.vipStock", 32),
	VIP_POC("datasource.vipGoods",1);
	
	/*
	 * ��Ӧ�����ļ�application.properties�е�����Դkey
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

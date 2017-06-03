package com.test.bootstrap.entity;

import java.util.Date;


public class MerItemPoc{
	
	private Long merItemNo;
	private Long pocSkuId;
	private Date createTime;
		
	public void setMerItemNo(Long merItemNo){
		this.merItemNo = merItemNo;
	}
	
	public Long getMerItemNo(){
		return this.merItemNo;
	}
		
	public void setPocSkuId(Long pocSkuId){
		this.pocSkuId = pocSkuId;
	}
	
	public Long getPocSkuId(){
		return this.pocSkuId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
		
		
}

















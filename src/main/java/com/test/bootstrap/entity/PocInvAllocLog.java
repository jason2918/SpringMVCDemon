package com.test.bootstrap.entity;

import java.util.Date;

public class PocInvAllocLog{
	
	private Long pocInvAllocLogId;
	private String transactionId;
	private Long pocInvAllocId;
	private Long pocSkuId;
	private Long scheduledSellingId;
	private Byte scheduledType;
	private String warehouse;
	private String barcode;
	private Integer operType;
	private Integer operNum;
	private Date operTime;
	private Byte operResult;
	private String operator;
	private String remark;
	private Date createTime;
		
	public void setPocInvAllocLogId(Long pocInvAllocLogId){
		this.pocInvAllocLogId = pocInvAllocLogId;
	}
	
	public Long getPocInvAllocLogId(){
		return this.pocInvAllocLogId;
	}
		
	public void setTransactionId(String transactionId){
		this.transactionId = transactionId;
	}
	
	public String getTransactionId(){
		return this.transactionId;
	}
		
	public void setPocInvAllocId(Long pocInvAllocId){
		this.pocInvAllocId = pocInvAllocId;
	}
	
	public Long getPocInvAllocId(){
		return this.pocInvAllocId;
	}
		
	public void setPocSkuId(Long pocSkuId){
		this.pocSkuId = pocSkuId;
	}
	
	public Long getPocSkuId(){
		return this.pocSkuId;
	}
		
	public void setScheduledSellingId(Long scheduledSellingId){
		this.scheduledSellingId = scheduledSellingId;
	}
	
	public Long getScheduledSellingId(){
		return this.scheduledSellingId;
	}
		
	public void setScheduledType(Byte scheduledType){
		this.scheduledType = scheduledType;
	}
	
	public Byte getScheduledType(){
		return this.scheduledType;
	}
		
	public void setWarehouse(String warehouse){
		this.warehouse = warehouse;
	}
	
	public String getWarehouse(){
		return this.warehouse;
	}
		
	public void setBarcode(String barcode){
		this.barcode = barcode;
	}
	
	public String getBarcode(){
		return this.barcode;
	}
		
	public void setOperType(Integer operType){
		this.operType = operType;
	}
	
	public Integer getOperType(){
		return this.operType;
	}
		
	public void setOperNum(Integer operNum){
		this.operNum = operNum;
	}
	
	public Integer getOperNum(){
		return this.operNum;
	}
		
	public void setOperTime(Date operTime){
		this.operTime = operTime;
	}
	
	public Date getOperTime(){
		return this.operTime;
	}
		
	public void setOperResult(Byte operResult){
		this.operResult = operResult;
	}
	
	public Byte getOperResult(){
		return this.operResult;
	}
		
	public void setOperator(String operator){
		this.operator = operator;
	}
	
	public String getOperator(){
		return this.operator;
	}
		
	public void setRemark(String remark){
		this.remark = remark;
	}
	
	public String getRemark(){
		return this.remark;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
		
		
}

















package com.test.bootstrap.entity;

import java.util.Date;

public class SalesInvAlloc{
	
	private Long salesInvAllocId;
	private Long salesNo;
	private Long merchandiseNo;
	private Long merItemNo;
	private Long pocInvAllocId;
	private Long pocSkuId;
	private Long scheduledSellingId;
	private Byte scheduledType;
	private String warehouse;
	private String barcode;
	private Long vendorSkuId;
	private Byte warehouseFlag;
	private Date createTime;
		
	public void setSalesInvAllocId(Long salesInvAllocId){
		this.salesInvAllocId = salesInvAllocId;
	}
	
	public Long getSalesInvAllocId(){
		return this.salesInvAllocId;
	}
		
	public void setSalesNo(Long salesNo){
		this.salesNo = salesNo;
	}
	
	public Long getSalesNo(){
		return this.salesNo;
	}
		
	public void setMerchandiseNo(Long merchandiseNo){
		this.merchandiseNo = merchandiseNo;
	}
	
	public Long getMerchandiseNo(){
		return this.merchandiseNo;
	}
		
	public void setMerItemNo(Long merItemNo){
		this.merItemNo = merItemNo;
	}
	
	public Long getMerItemNo(){
		return this.merItemNo;
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
		
	public void setVendorSkuId(Long vendorSkuId){
		this.vendorSkuId = vendorSkuId;
	}
	
	public Long getVendorSkuId(){
		return this.vendorSkuId;
	}

	public Byte getWarehouseFlag() {
		return warehouseFlag;
	}

	public void setWarehouseFlag(Byte warehouseFlag) {
		this.warehouseFlag = warehouseFlag;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
		
		
}

















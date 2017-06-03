package com.test.bootstrap.entity;

import java.util.Date;

public class PocInvAlloc{
	
	private Long pocInvAllocId;
	private Long pocSkuId;
	private Long scheduledSellingId;
	private Byte scheduledType;
	private String warehouse;
	private String barcode;
	private String mimsItemId;
	private Byte occupiedType;
	private Integer totalNum;
	private Integer leavingNum;
	private Integer adjustLeavingNum;
	private Integer soldNum;
	private Integer cartHoldNum;
	private Integer orderHoldNum;
	private Integer odsDeliverNum;
	private Integer backNum;
	private Integer spoilNum;
	private Integer newbieHoldNum;
	private Byte inventoryState;
	private Byte isDeleted;
	private Date createTime;
	private String createFrom;
	private String createBy;
	private Date updateTime;
	private String updateFrom;
	private String updateBy;
	private Date sellTimeFrom;
	private Date sellTimeTo;
	private Byte warehouseFlag;
	private Byte invAllocSequence;
	private Integer waitRestoreNum;
	
	
	public Integer getWaitRestoreNum() {
		return waitRestoreNum;
	}

	public void setWaitRestoreNum(Integer waitRestoreNum) {
		this.waitRestoreNum = waitRestoreNum;
	}

	public void setAdjustLeavingNum(Integer adjustLeavingNum) {
		this.adjustLeavingNum = adjustLeavingNum;
	}
	
	public Integer getAdjustLeavingNum() {
		return adjustLeavingNum;
	}
	
	public void setInvAllocSequence(Byte invAllocSequence) {
		this.invAllocSequence = invAllocSequence;
	}
	
	public Byte getInvAllocSequence() {
		return invAllocSequence;
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
		
	public void setMimsItemId(String mimsItemId){
		this.mimsItemId = mimsItemId;
	}
	
	public String getMimsItemId(){
		return this.mimsItemId;
	}
		
	public void setOccupiedType(Byte occupiedType){
		this.occupiedType = occupiedType;
	}
	
	public Byte getOccupiedType(){
		return this.occupiedType;
	}
		
	public void setTotalNum(Integer totalNum){
		this.totalNum = totalNum;
	}
	
	public Integer getTotalNum(){
		return this.totalNum;
	}
		
	public void setLeavingNum(Integer leavingNum){
		this.leavingNum = leavingNum;
	}
	
	public Integer getLeavingNum(){
		return this.leavingNum;
	}
		
	public void setSoldNum(Integer soldNum){
		this.soldNum = soldNum;
	}
	
	public Integer getSoldNum(){
		return this.soldNum;
	}
		
	public void setCartHoldNum(Integer cartHoldNum){
		this.cartHoldNum = cartHoldNum;
	}
	
	public Integer getCartHoldNum(){
		return this.cartHoldNum;
	}
		
	public void setOrderHoldNum(Integer orderHoldNum){
		this.orderHoldNum = orderHoldNum;
	}
	
	public Integer getOrderHoldNum(){
		return this.orderHoldNum;
	}
		
	public void setOdsDeliverNum(Integer odsDeliverNum){
		this.odsDeliverNum = odsDeliverNum;
	}
	
	public Integer getOdsDeliverNum(){
		return this.odsDeliverNum;
	}
		
	public void setBackNum(Integer backNum){
		this.backNum = backNum;
	}
	
	public Integer getBackNum(){
		return this.backNum;
	}
		
	public void setSpoilNum(Integer spoilNum){
		this.spoilNum = spoilNum;
	}
	
	public Integer getSpoilNum(){
		return this.spoilNum;
	}
		
	public void setNewbieHoldNum(Integer newbieHoldNum){
		this.newbieHoldNum = newbieHoldNum;
	}
	
	public Integer getNewbieHoldNum(){
		return this.newbieHoldNum;
	}
		
	public void setInventoryState(Byte inventoryState){
		this.inventoryState = inventoryState;
	}
	
	public Byte getInventoryState(){
		return this.inventoryState;
	}
		
	public void setIsDeleted(Byte isDeleted){
		this.isDeleted = isDeleted;
	}
	
	public Byte getIsDeleted(){
		return this.isDeleted;
	}
		
	public void setCreateTime(Date createTime){
		this.createTime = createTime;
	}
	
	public Date getCreateTime(){
		return this.createTime;
	}
		
	public void setCreateFrom(String createFrom){
		this.createFrom = createFrom;
	}
	
	public String getCreateFrom(){
		return this.createFrom;
	}
		
	public void setCreateBy(String createBy){
		this.createBy = createBy;
	}
	
	public String getCreateBy(){
		return this.createBy;
	}
		
	public void setUpdateTime(Date updateTime){
		this.updateTime = updateTime;
	}
	
	public Date getUpdateTime(){
		return this.updateTime;
	}
		
	public void setUpdateFrom(String updateFrom){
		this.updateFrom = updateFrom;
	}
	
	public String getUpdateFrom(){
		return this.updateFrom;
	}
		
	public void setUpdateBy(String updateBy){
		this.updateBy = updateBy;
	}
	
	public String getUpdateBy(){
		return this.updateBy;
	}

	public Date getSellTimeFrom() {
		return sellTimeFrom;
	}

	public void setSellTimeFrom(Date sellTimeFrom) {
		this.sellTimeFrom = sellTimeFrom;
	}

	public Date getSellTimeTo() {
		return sellTimeTo;
	}

	public void setSellTimeTo(Date sellTimeTo) {
		this.sellTimeTo = sellTimeTo;
	}

	public Byte getWarehouseFlag() {
		return warehouseFlag;
	}

	public void setWarehouseFlag(Byte warehouseFlag) {
		this.warehouseFlag = warehouseFlag;
	}
		
		
}

















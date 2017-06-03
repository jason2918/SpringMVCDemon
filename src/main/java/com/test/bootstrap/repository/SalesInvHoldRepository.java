package com.test.bootstrap.repository;

import java.sql.ResultSet;
import java.util.List;

import com.test.bootstrap.entity.SalesInvAlloc;
import com.test.bootstrap.entity.SalesInvHold;
import com.test.bootstrap.enums.DataSourceEnum;

public class SalesInvHoldRepository extends ConnecteRepository<SalesInvHold> {

	public List<SalesInvHold> getSalesInvAllocByPocSkuId(Long pocSkuId) {
		String sql = "select * from sales_inv_hold where poc_sku_id = " + pocSkuId;
		return getTableDataByBizNo(pocSkuId, DataSourceEnum.VIP_STOCK, sql);
	}
	
	@Override
	public SalesInvHold wrapMode(ResultSet rs) throws Exception {
		SalesInvHold mode = new SalesInvHold();
		mode.setSalesInvHoldId(rs.getLong("sales_inv_hold_id"));
		mode.setTradeNo(rs.getString("trade_no"));
		mode.setAssociatedTradeNo(rs.getString("associated_trade_no"));
		mode.setMerItemNo(rs.getLong("mer_item_no"));
		mode.setPocSkuId(rs.getLong("poc_sku_id"));
		mode.setPocInvAllocId(rs.getLong("poc_inv_alloc_id"));
		mode.setScheduledSellingId(rs.getLong("scheduled_selling_id"));
		mode.setScheduledType(rs.getByte("scheduled_type"));
		mode.setWarehouse(rs.getString("warehouse"));
		mode.setWarehouseFlag(rs.getByte("warehouse_flag"));
		mode.setBarcode(rs.getString("barcode"));
		mode.setUserId(rs.getLong("user_id"));
		mode.setIsNewbie(rs.getByte("is_newbie"));
		mode.setUserLocation(rs.getString("user_location"));
		mode.setCartHoldNum(rs.getInt("cart_hold_num"));
		mode.setCartUpdateTime(rs.getDate("cart_update_time"));
		mode.setOrderHoldNum(rs.getInt("order_hold_num"));
		mode.setOrderUpdateTime(rs.getDate("order_update_time"));
		mode.setOdsDeliverNum(rs.getInt("ods_deliver_num"));
		mode.setOdsUpdateTime(rs.getDate("ods_update_time"));
		mode.setWaitRestoreNum(rs.getInt("wait_restore_num"));
		mode.setWaitRestoreUpdateTime(rs.getDate("wait_restore_update_time"));
		mode.setHoldState(rs.getInt("hold_state"));
		mode.setUpdateTime(rs.getDate("update_time"));
		mode.setCreateTime(rs.getDate("create_time"));
		mode.setOrderOptNum(rs.getInt("order_opt_num"));
		return mode;
	}
	
}

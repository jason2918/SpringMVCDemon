package com.test.bootstrap.repository;

import java.sql.ResultSet;
import java.util.List;

import com.test.bootstrap.entity.PocInvAlloc;
import com.test.bootstrap.enums.DataSourceEnum;

public class PocInvAllocRepository extends ConnecteRepository<PocInvAlloc> {

	public List<PocInvAlloc> getPocInvAllocByPocSkuId(Long pocSkuId) {
		String sql = "select * from poc_inv_alloc where poc_sku_id = " + pocSkuId;
		return getTableDataByBizNo(pocSkuId, DataSourceEnum.VIP_STOCK, sql);
	}
	
	@Override
	public PocInvAlloc wrapMode(ResultSet rs) throws Exception {
		PocInvAlloc mode = new PocInvAlloc();
		mode.setPocSkuId(rs.getLong("poc_sku_id"));
		mode.setScheduledSellingId(rs.getLong("scheduled_selling_id"));
		mode.setScheduledType(rs.getByte("scheduled_type"));
		mode.setSellTimeFrom(rs.getDate("sell_time_from"));
		mode.setSellTimeTo(rs.getDate("sell_time_to"));
		mode.setWarehouse(rs.getString("warehouse"));
		mode.setWarehouseFlag(rs.getByte("warehouse_flag"));
		mode.setBarcode(rs.getString("barcode"));
		mode.setMimsItemId(rs.getString("mims_item_id"));
		mode.setOccupiedType(rs.getByte("occupied_type"));
		mode.setTotalNum(rs.getInt("total_num"));
		mode.setLeavingNum(rs.getInt("leaving_num"));
		mode.setSoldNum(rs.getInt("sold_num"));
		mode.setCartHoldNum(rs.getInt("cart_hold_num"));
		mode.setOrderHoldNum(rs.getInt("order_hold_num"));
		mode.setOdsDeliverNum(rs.getInt("ods_deliver_num"));
		mode.setBackNum(rs.getInt("back_num"));
		mode.setSpoilNum(rs.getInt("spoil_num"));
		mode.setNewbieHoldNum(rs.getInt("newbie_hold_num"));
		mode.setInventoryState(rs.getByte("inventory_state"));
		mode.setIsDeleted(rs.getByte("is_deleted"));
		mode.setCreateTime(rs.getDate("create_time"));
		mode.setCreateFrom(rs.getString("create_from"));
		mode.setCreateBy(rs.getString("create_by"));
		mode.setUpdateTime(rs.getDate("update_time"));
		mode.setUpdateFrom(rs.getString("update_from"));
		mode.setUpdateBy(rs.getString("update_by"));
		mode.setInvAllocSequence(rs.getByte("inv_alloc_sequence"));
		mode.setAdjustLeavingNum(rs.getInt("adjust_leaving_num"));
		mode.setWaitRestoreNum(rs.getInt("wait_restore_num"));
		return mode;
	}

}

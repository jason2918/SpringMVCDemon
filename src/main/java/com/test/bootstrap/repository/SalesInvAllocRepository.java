package com.test.bootstrap.repository;

import java.sql.ResultSet;
import java.util.List;

import com.test.bootstrap.entity.SalesInvAlloc;
import com.test.bootstrap.enums.DataSourceEnum;

public class SalesInvAllocRepository extends ConnecteRepository<SalesInvAlloc> {

	public List<SalesInvAlloc> getSalesInvAllocByPocSkuId(Long pocSkuId) {
		String sql = "select * from sales_inv_alloc where poc_sku_id = " + pocSkuId;
		return getTableDataByBizNo(pocSkuId, DataSourceEnum.VIP_STOCK, sql);
	}
	
	@Override
	public SalesInvAlloc wrapMode(ResultSet rs) throws Exception {
		SalesInvAlloc mode = new SalesInvAlloc();
		mode.setSalesInvAllocId(rs.getLong("sales_inv_alloc_id"));
		mode.setSalesNo(rs.getLong("sales_no"));
		mode.setMerchandiseNo(rs.getLong("merchandise_no"));
		mode.setMerItemNo(rs.getLong("mer_item_no"));
		mode.setPocInvAllocId(rs.getLong("poc_inv_alloc_id"));
		mode.setPocSkuId(rs.getLong("poc_sku_id"));
		mode.setScheduledSellingId(rs.getLong("scheduled_selling_id"));
		mode.setScheduledType(rs.getByte("scheduled_type"));
		mode.setWarehouse(rs.getString("warehouse"));
		mode.setWarehouseFlag(rs.getByte("warehouse_flag"));
		mode.setBarcode(rs.getString("barcode"));
		mode.setVendorSkuId(rs.getLong("vendor_sku_id"));
		mode.setCreateTime(rs.getDate("create_time"));
		return mode;
	}
	
}

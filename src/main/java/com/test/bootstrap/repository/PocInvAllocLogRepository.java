package com.test.bootstrap.repository;

import java.sql.ResultSet;
import java.util.List;

import com.test.bootstrap.entity.PocInvAllocLog;
import com.test.bootstrap.enums.DataSourceEnum;

public class PocInvAllocLogRepository extends ConnecteRepository<PocInvAllocLog> {

	public List<PocInvAllocLog> getPocInvAllocLogByPocSkuId(Long pocSkuId) {
		String sql = "select * from poc_inv_alloc_log where poc_sku_id = " + pocSkuId;
		return getTableDataByBizNo(pocSkuId, DataSourceEnum.VIP_STOCK, sql);
	}

	@Override
	public PocInvAllocLog wrapMode(ResultSet rs) throws Exception {
		PocInvAllocLog mode = new PocInvAllocLog();
		mode.setPocInvAllocLogId(rs.getLong("poc_inv_alloc_log_id"));
		mode.setTransactionId(rs.getString("transaction_id"));
		mode.setPocInvAllocId(rs.getLong("poc_inv_alloc_id"));
		mode.setPocSkuId(rs.getLong("poc_sku_id"));
		mode.setScheduledSellingId(rs.getLong("scheduled_selling_id"));
		mode.setScheduledType(rs.getByte("scheduled_type"));
		mode.setWarehouse(rs.getString("warehouse"));
		mode.setBarcode(rs.getString("barcode"));
		mode.setOperType(rs.getInt("oper_type"));
		mode.setOperNum(rs.getInt("oper_num"));
		mode.setOperTime(rs.getDate("oper_time"));
		mode.setOperResult(rs.getByte("oper_result"));
		mode.setOperator(rs.getString("operator"));
		mode.setCreateTime(rs.getDate("create_time"));
		mode.setRemark(rs.getString("remark"));
		return mode;
	}
	
}

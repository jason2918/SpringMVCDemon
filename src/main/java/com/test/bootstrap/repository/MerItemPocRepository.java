package com.test.bootstrap.repository;

import java.sql.ResultSet;
import java.util.List;

import com.test.bootstrap.entity.MerItemPoc;
import com.test.bootstrap.enums.DataSourceEnum;

public class MerItemPocRepository extends ConnecteRepository<MerItemPoc> {

	public List<MerItemPoc> getMerItemPocByMerItemNo(Long merItemNo) {
		String sql = "select * from mer_item_poc where mer_item_no = " + merItemNo;
		return getTableDataByBizNo(merItemNo, DataSourceEnum.VIP_STOCK, sql);
	}
	
	public static void main(String[] args) {
		new MerItemPocRepository().getMerItemPocByMerItemNo(331852928L);
	}

	@Override
	public MerItemPoc wrapMode(ResultSet rs) throws Exception {
		MerItemPoc merItemPoc = new MerItemPoc();
		merItemPoc.setMerItemNo(rs.getLong("mer_item_no"));
		merItemPoc.setPocSkuId(rs.getLong("poc_sku_id"));
		merItemPoc.setCreateTime(rs.getDate("create_time"));
		return merItemPoc;
	}
}

package com.test.bootstrap.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;

import com.test.bootstrap.dbCommon.DbManager;
import com.test.bootstrap.enums.DataSourceEnum;

public abstract class ConnecteRepository<T> {

	private QueryRunner qr = new QueryRunner();
	
	/**
	 * @param bizNo DB_NAMEºó×º±êÊ¶
	 * @param dataSourceEnum
	 * @return
	 */
	public Connection getConnection(Integer bizNo, DataSourceEnum dataSourceEnum) {
		Integer dbPost = null;
		if (dataSourceEnum.getValue(dataSourceEnum).intValue() > 1) {
			dbPost = bizNo % dataSourceEnum.getValue(dataSourceEnum);
		}
		
		try {
			return DbManager.getConnection(dataSourceEnum.getDbFlag(dataSourceEnum), dbPost);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public List<T> getTableDataByBizNo(Long bizNo, DataSourceEnum dataSourceEnum, String sql) {
		List<T> datalist = null;
		Connection conn = getConnection(bizNo.intValue(), dataSourceEnum);
		try {
			datalist = qr.query(conn, sql, new ResultSetHandler<List<T>>() {

				@Override
				public List<T> handle(ResultSet rs) throws SQLException {
					List<T>  list = new ArrayList<T>();
					while (rs.next()) {
						T mode = null;
						try {
							mode = wrapMode(rs);
						} catch (Exception e) {
							e.printStackTrace();
						}
						list.add(mode);
					}
					return list;
				}
				
			});
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return datalist;
	}
	
	public abstract T wrapMode(ResultSet rs) throws Exception;
}

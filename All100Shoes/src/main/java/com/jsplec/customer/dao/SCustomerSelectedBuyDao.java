package com.jsplec.customer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class SCustomerSelectedBuyDao {

	DataSource dataSource;
	
	public SCustomerSelectedBuyDao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/mvc");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void selectedBuy(String[] orderid) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection();
			
			for(int i = 0; i < orderid.length; i++) {
				
				String query = "update orders set orderstatus = '구매', orderdate = now() where orderid = ?";
				preparedStatement = connection.prepareStatement(query);
				
				preparedStatement.setString(1, orderid[i]);
	
				preparedStatement.executeUpdate();
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	} // selectedBuy() --

	public void buyProductStockUpdate(String productmodel, String productsize, int orderquantity) {
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection();
			
				
				String query = "update product set productstock = productstock - ? where productmodel = ? and productsize = ?";
				preparedStatement = connection.prepareStatement(query);
				
				preparedStatement.setInt(1, orderquantity);
				preparedStatement.setString(2, productmodel);
				preparedStatement.setString(3, productsize);
				
				preparedStatement.executeUpdate();
			
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	} // selectedBuy() --
	
}

package com.jsplec.customer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class SCustomerCartListDeleteDao {

	DataSource dataSource;
	
	public SCustomerCartListDeleteDao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/mvc");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void cartListDelete(String[] orderid) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		int i = 0;
		
		try {
			connection = dataSource.getConnection();
			if(orderid.length == 1) {
				i = 0;
			} else {
				i = 1;
			}
			
			for(; i < orderid.length; i++) {
				String query = "delete from orders where orderid = ?";
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
	} // cartListDelete() --
	
}

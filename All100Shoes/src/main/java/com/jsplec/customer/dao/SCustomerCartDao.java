package com.jsplec.customer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import com.jsplec.customer.dto.SCustomerDetailDto;

public class SCustomerCartDao {

	DataSource dataSource;
	
	public SCustomerCartDao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/mvc");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public int selectProductId(int productsize, String productmodel) {
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;
		int productid = 0;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "select productid from product where productsize = " + productsize + " and productmodel = '" + productmodel + "'";
			
			preparedStatement = connection.prepareStatement(query);
			rs = preparedStatement.executeQuery();
			
			if(rs.next()) {
				
				productid = rs.getInt(1);
				
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		return productid;
	} // productDetailModel() --
	
	public void cartInsert(int productid, int ordersaleprice, int orderquantity, HttpServletRequest request) {
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		HttpSession session = request.getSession();
		
		try {
			connection = dataSource.getConnection();
			
			String query = "insert into orders (customerid, productid, orderquantity, ordersaleprice, orderstatus) values (?, ?, ?, ?, '장바구니')";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, (String)session.getAttribute("CUSTOMERID"));
			preparedStatement.setInt(2, productid);
			preparedStatement.setInt(3, orderquantity);
			preparedStatement.setInt(4, ordersaleprice);

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
	} // cartInsert() --
	
	public void cartUpdate(int productid, int orderquantity, HttpServletRequest request) {
		System.out.println(productid);
		System.out.println(orderquantity);
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		HttpSession session = request.getSession();
		System.out.println(session.getAttribute("CUSTOMERID"));
		
		try {
			connection = dataSource.getConnection();
			
			String query = "update orders set orderquantity = orderquantity + ? where productid = ? and customerid = ?";
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setInt(1, orderquantity);
			preparedStatement.setInt(2, productid);
			preparedStatement.setString(3, (String)session.getAttribute("CUSTOMERID"));
			
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
	} // cartInsert() --
	
	public ArrayList<SCustomerDetailDto> selectProduct(HttpServletRequest request) {
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;
		HttpSession session = request.getSession();
		ArrayList<SCustomerDetailDto> dtos = new ArrayList<SCustomerDetailDto>();
		
		try {
			connection = dataSource.getConnection();
			
			String query = "select productid from orders where orderstatus = '장바구니' and customerid = '" + session.getAttribute("CUSTOMERID") + "'";
			preparedStatement = connection.prepareStatement(query);
			rs = preparedStatement.executeQuery();
			
			while(rs.next()) {
				
				int productid = rs.getInt(1);
				
				SCustomerDetailDto dto = new SCustomerDetailDto(productid);
				dtos.add(dto);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		return dtos;
	} // productDetailModel() --
	
}

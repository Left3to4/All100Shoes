package com.jsplec.customer.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import com.jsplec.customer.dto.SCustomerBuyListDto;

public class SCustomerBuyListDao {

	DataSource dataSource;
	
	public SCustomerBuyListDao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/mvc");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<SCustomerBuyListDto> buyList(HttpServletRequest request) {
		
		ArrayList<SCustomerBuyListDto> dtos = new ArrayList<SCustomerBuyListDto>();
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;
		HttpSession session = request.getSession();
		
		try {
			connection = dataSource.getConnection();
			
//			String query1 = "select * from ";
//			String query2 = "(select rownum rnum, p.productbrand, p.productmodel, p.productsize, o.orderquantity, o.ordersaleprice * o.orderquantity, date_format(o.orderdate, '%Y-%m-%d') ";
//			String query3 = "from (select * from product p, orders o p.productid = o.productid order by o.orderdate desc)) ";
//			String query4 = "where rnum >= ? and rnum <= ? and ";
			
			String query1 = "select p.productbrand, p.productmodel, p.productsize, o.orderquantity, o.ordersaleprice * o.orderquantity, date_format(o.orderdate, '%Y-%m-%d') ";
			String query2 = "from product p, orders o ";
			String query3 = "where o.customerid = '" + session.getAttribute("CUSTOMERID") + "' and o.orderstatus = '구매' and orderdate is not null and p.productid = o.productid";
			
			preparedStatement = connection.prepareStatement(query1 + query2 + query3);
			
			rs = preparedStatement.executeQuery();
			
			while(rs.next()) {

				String produdctbrand = rs.getString(1);
				String productmodel = rs.getString(2);
				String productsize = rs.getString(3);
				int orderquantity = rs.getInt(4);
				int orderprice = rs.getInt(5);
				Date orderdate = rs.getDate(6);
				
				
				SCustomerBuyListDto dto = new SCustomerBuyListDto(produdctbrand, productmodel, productsize, orderquantity,  orderprice, orderdate);
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
	} // productDetailSize() --
	
	public int buyListCount(HttpServletRequest request) {
		int listCount = 0;
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;
		HttpSession session = request.getSession();
		
		try {
			connection = dataSource.getConnection();
			
			String query1 = "select count(*) from product p, orders o ";
			String query2 = "where o.customerid = '" + session.getAttribute("CUSTOMERID") + "' and o.orderstatus = '구매' and orderdate is not null and p.productid = o.productid";

			preparedStatement = connection.prepareStatement(query1 + query2);
			
			rs = preparedStatement.executeQuery();
			
			while(rs.next()) {
				
				listCount = rs.getInt(1);
				
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
		return listCount;
	} // productDetailSize() --
	
}

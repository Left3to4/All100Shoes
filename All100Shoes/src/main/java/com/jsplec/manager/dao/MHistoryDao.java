package com.jsplec.manager.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.jsplec.manager.dto.MHistoryDto;
import com.jsplec.manager.dto.MProductDto;

public class MHistoryDao {

	// F
	DataSource dataSource;
	
	// C
	public MHistoryDao() {
		// TODO Auto-generated constructor stub
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/mvc");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// M
	public ArrayList<MHistoryDto> historyList(String select, String content){
		ArrayList<MHistoryDto> dtos = new ArrayList<>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			int i = 0;
			
			String query = "select p.productmodel, p.productsize, b.buyquantity, b.buyprice, b.buyorderdate from product p, buy b ";
			String query1 = "where " + select + " like '%" + content + "%' and p.productid = b.productid order by b.buyorderdate desc";
			preparedStatement = connection.prepareStatement(query+query1);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				i += 1;
				int buyid = i;
				String productmodel = resultSet.getString("p.productmodel");
				String productsize = resultSet.getString("p.productsize");
				int buyquantity = resultSet.getInt("b.buyquantity");
				int buyprice = resultSet.getInt("b.buyprice");
				Timestamp buyorderdate = resultSet.getTimestamp("b.buyorderdate");
				
				MHistoryDto dto = new MHistoryDto(buyid, productmodel, productsize, buyquantity, buyprice, buyorderdate);
						
				dtos.add(dto);
				}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return dtos;
		
	}
	
	
	
}// End 11222

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
	public ArrayList<MHistoryDto> historyList(){
		ArrayList<MHistoryDto> dtos = new ArrayList<>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "select b.buyid p.productmodel, p.productsize, b.buyquantity, b.buyprice, b.buyorderdate from product p, buy b ";
			String query1 = "where p.productid = b.productid";
			preparedStatement = connection.prepareStatement(query+query1);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				int buyid = resultSet.getInt("b.buyid");
				String productmodel = resultSet.getString("p.productmodel");
				String productsize = resultSet.getString("p.productsize");
				int buyquantity = resultSet.getInt("b.buyquantity");
				int buyprice = resultSet.getInt("b.buyprice");
				Timestamp buyorderdate = resultSet.getTimestamp("b.buyorderdate");
				
				MHistoryDto dto = new MHistoryDto(buyid, productmodel, productsize, buyprice, buyorderdate, buyquantity);
						
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
	
	
	
}// End 11

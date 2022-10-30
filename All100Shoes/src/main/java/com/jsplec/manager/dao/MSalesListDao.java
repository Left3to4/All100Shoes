package com.jsplec.manager.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.jsplec.manager.dto.MHistoryDto;
import com.jsplec.manager.dto.MSalesDto;

public class MSalesListDao {

	// F
	DataSource dataSource;
	
	// C
	public MSalesListDao() {
		// TODO Auto-generated constructor stub
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/mvc");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// M
	public ArrayList<MSalesDto> salesList(){
		ArrayList<MSalesDto> dtos = new ArrayList<>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "select sum(ordersaleprice), date_format(orderdate, '%Y-%m-%d') as orderdate from orders where orderstatus = '구매' ";
//			String query1 = "where between orderdate = to ";
			String query1 = "group by orderdate order by orderdate desc";
			preparedStatement = connection.prepareStatement(query+query1);
			resultSet = preparedStatement.executeQuery();
			int i = 0;
			
			while(resultSet.next()) {
				i += 1;
				int seq = i;
				int sales = resultSet.getInt("sum(ordersaleprice)");
				Date orderdate = resultSet.getDate("orderdate");
				
				MSalesDto dto = new MSalesDto(seq, sales, orderdate);
						
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
	
	
	
	
} // End

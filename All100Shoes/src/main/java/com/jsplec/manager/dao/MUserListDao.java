package com.jsplec.manager.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.jsplec.manager.dto.MUserDto;

public class MUserListDao {

	// F
	DataSource dataSource;
	
	// C
	public MUserListDao() {
		// TODO Auto-generated constructor stub
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/mvc");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// M
	public ArrayList<MUserDto> userList(){
		ArrayList<MUserDto> dtos = new ArrayList<>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		int i = 0;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "select customerid, customername, customerphone, customeraddress, customerinitdate, customerupdatedate, customerdeletedate ";
			String query1 =	"from customer order by customerinitdate desc";
			preparedStatement = connection.prepareStatement(query+query1);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				i += 1;
				int customerseq = i;
				String customerid = resultSet.getString("customerid");
				String customername = resultSet.getString("customername");
				String customerphone = resultSet.getString("customerphone");
				String customeraddress = resultSet.getString("customeraddress");
				Date customerinitdate = resultSet.getDate("customerinitdate");
				Date customerupdatedate = resultSet.getDate("customerupdatedate");
				Date customerdeletedate = resultSet.getDate("customerdeletedate");
				
				MUserDto dto = new MUserDto(customerseq, customerid, customername, customerid, customeraddress, customerinitdate, customerupdatedate, customerdeletedate);
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

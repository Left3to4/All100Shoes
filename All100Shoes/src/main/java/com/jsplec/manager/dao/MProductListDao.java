package com.jsplec.manager.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.jsplec.manager.dto.MProductDto;
import com.jsplec.manager.dto.MUserDto;

public class MProductListDao {

	// F
	DataSource dataSource;
	
	// C
	public MProductListDao() {
		// TODO Auto-generated constructor stub
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/mvc");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// M
	public ArrayList<MProductDto> productList(){
		ArrayList<MProductDto> dtos = new ArrayList<>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "select productid, productbrand, productmodel, productsize, productprice, productstock, productstatus from product";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				int productseq = resultSet.getInt("productid");
				String productbrand = resultSet.getString("productbrand");
				String productmodel = resultSet.getString("productmodel");
				String productsize = resultSet.getString("productsize");
				int productprice = resultSet.getInt("productprice");
				int productstock = resultSet.getInt("productstock");
				String productstatus = resultSet.getString("productstatus");
				
				MProductDto dto = new MProductDto(productseq, productbrand, productmodel, productsize, productprice, productstock, productstatus);
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
	
	// 검색조건에 맞는 상품 리스트 출력
			public ArrayList<MProductDto> search(String select, String content) {
				ArrayList<MProductDto> dtos = new ArrayList<MProductDto>();
				Connection connection = null;
				PreparedStatement preparedStatement = null;
				ResultSet resultSet = null;
				int i = 0;

				try {
					connection = dataSource.getConnection();

					String query1 = "select productid, productbrand, productmodel, productsize, productprice, productstock, productstatus from product ";
					String query2 = "where " + select + " like '%" + content + "%'";

					preparedStatement = connection.prepareStatement(query1 + query2);
					resultSet = preparedStatement.executeQuery();

					while(resultSet.next()) {
						int productseq = resultSet.getInt("productid");
						String productbrand = resultSet.getString("productbrand");
						String productmodel = resultSet.getString("productmodel");
						String productsize = resultSet.getString("productsize");
						int productprice = resultSet.getInt("productprice");
						int productstock = resultSet.getInt("productstock");
						String productstatus = resultSet.getString("productstatus");
						
						MProductDto dto = new MProductDto(productseq, productbrand, productmodel, productsize, productprice, productstock, productstatus);
						dtos.add(dto);
						}

				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						if (resultSet != null)
							resultSet.close();
						if (preparedStatement != null)
							preparedStatement.close();
						if (connection != null)
							connection.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				return dtos;

			} // list
		
	
	
	
} // End

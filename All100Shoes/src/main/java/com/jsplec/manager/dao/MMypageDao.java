package com.jsplec.manager.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.jsplec.manager.dto.MMypageDto;

public class MMypageDao {
	
	DataSource dataSource;
	
	public MMypageDao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/mvc"); // 데이터베이스 연결 끝
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public MMypageDto showInfo(String managerid) {
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		MMypageDto dto=null;
		
		String managerpw;
		String managername;
		String managerphone;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "select managerpw, managername, managerphone from manager where managerid=?";
			ps = connection.prepareStatement(query);
			ps.setString(1, managerid);
			rs = ps.executeQuery();
			
			if (rs.next()) {
				managerpw=rs.getString(1);
				managername=rs.getString(2);
				managerphone=rs.getString(3);
				dto=new MMypageDto(managerid, managername, managerpw, managerphone);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs!=null) rs.close();
				if(ps!=null)ps.close();
				if (connection!=null) connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dto;
	}
	
	public void deleteAction(String managerid) {
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int count=0;

		try {
			connection = dataSource.getConnection();

			String query = "update manager set managerdeletedate=now() where managerid=?";
			ps = connection.prepareStatement(query);
			ps.setString(1, managerid);
			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs!=null) rs.close();
				if(ps!=null)ps.close();
				if (connection!=null) connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void updateAction(String managerid, String managername, String managerpw) {
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			connection = dataSource.getConnection();

			String query = "update manager set managerpw=?, managername=? where managerid=?";
			ps = connection.prepareStatement(query);
			ps.setString(1, managerpw);
			ps.setString(2, managername);
			ps.setString(3, managerid);
			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs!=null) rs.close();
				if(ps!=null)ps.close();
				if (connection!=null) connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}

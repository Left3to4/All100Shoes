package com.jsplec.manager.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MAddDao {
	
	DataSource dataSource;

	public MAddDao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/mvc"); // 데이터베이스 연결 끝
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean idCheck(String managerid) {
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int count=0;

		try {
			connection = dataSource.getConnection();

			String query = "select count(*) from manager where managerid=? and managerdeletedate is null";
			ps = connection.prepareStatement(query);
			ps.setString(1, managerid);
			rs = ps.executeQuery();

			if (rs.next()) {
				count=rs.getInt(1);
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
		
		if (count==1) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean comebackCheck(String managerid) {
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int count=0;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "select count(*) from manager where managerid=?";
			ps = connection.prepareStatement(query);
			ps.setString(1, managerid);
			rs = ps.executeQuery();
			
			if (rs.next()) {
				count=rs.getInt(1);
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
		
		if (count==1) {
			return true;
		} else {
			return false;
		}
	}
	
	public void insertAction(String managerid, String managerpw, String managername, String managerphone) {
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			connection = dataSource.getConnection();

			String query = "insert into manager (managerid, managerpw, managername, managerphone, managerinitdate) values (?, ?, ?, ?, now())";
			ps = connection.prepareStatement(query);
			ps.setString(1, managerid);
			ps.setString(2, managerpw);
			ps.setString(3, managername);
			ps.setString(4, managerphone);
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
	
	public void comebackAction(String managerid, String managerpw, String managername, String managerphone) {
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			connection = dataSource.getConnection();

			String query = "update manager set managerpw=?, managername=?, managerphone=?, managerdeletedate=null where managerid=?";
			ps = connection.prepareStatement(query);
			ps.setString(1, managerpw);
			ps.setString(2, managername);
			ps.setString(3, managerphone);
			ps.setString(4, managerid);
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
	
	public void addAction(String managerid, String managerpw, String managername, String managerphone) {
		boolean check=comebackCheck(managerid);
		
		if (check==true) {
			comebackAction(managerid, managerpw, managername, managerphone);
		} else {
			insertAction(managerid, managerpw, managername, managerphone);
		}
	}
}

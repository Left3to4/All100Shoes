package com.jsplec.manager.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

public class MLoginDao {

	DataSource dataSource;
	
	public MLoginDao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/mvc"); // 데이터베이스 연결 끝
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean managerCheck(String managerid, String managerpw) {
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int count=0;

		try {
			connection = dataSource.getConnection();

			String query = "select count(*) from manager where managerid=? and managerpw=? and managerdeletedate is null";
			ps = connection.prepareStatement(query);
			ps.setString(1, managerid);
			ps.setString(2, managerpw);
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
	
	public String checkName(String managerid, String managerpw) {
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String managername=null;
		boolean check=managerCheck(managerid, managerpw);
		
		if (check==true) {
			try {
				connection = dataSource.getConnection();

				String query = "select managername from manager where managerid=? and managerdeletedate is null";
				ps = connection.prepareStatement(query);
				ps.setString(1, managerid);
				rs = ps.executeQuery();

				if (rs.next()) {
					managername=rs.getString(1);
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
		} else {
			managername=null;
		}
		
		return managername;
		
	}
	
	public String managerFindId(String managername, String managerphone) {
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String managerid=null;

		try {
			connection = dataSource.getConnection();

			String query = "select managerid from manager where managername=? and managerphone=? and managerdeletedate is null";
			ps = connection.prepareStatement(query);
			ps.setString(1, managername);
			ps.setString(2, managerphone);
			rs = ps.executeQuery();

			if (rs.next()) {
				managerid=rs.getString(1);
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
		
		return managerid;
	}
	
	public String managerFindPw(String managername, String managerphone, String managerid) {
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String managerpw=null;

		try {
			connection = dataSource.getConnection();

			String query = "select managerpw from manager where managername=? and managerphone=? and managerid=? and managerdeletedate is null";
			ps = connection.prepareStatement(query);
			ps.setString(1, managername);
			ps.setString(2, managerphone);
			ps.setString(3, managerid);
			rs = ps.executeQuery();

			if (rs.next()) {
				managerpw=rs.getString(1);
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
		
		return managerpw;
	}
}

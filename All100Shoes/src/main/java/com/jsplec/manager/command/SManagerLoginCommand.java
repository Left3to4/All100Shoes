package com.jsplec.manager.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsplec.manager.dao.MLoginDao;

public class SManagerLoginCommand implements SManagerCommand {
	
	
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
	}

	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String managerid = request.getParameter("managerid");
		String managerpw = request.getParameter("managerpw");
		HttpSession session=request.getSession();

		MLoginDao dao = new MLoginDao();
		boolean logincheck = dao.managerCheck(managerid, managerpw);
		String managername=dao.checkName(managerid, managerpw);
		session.setAttribute("MANAGERID", managerid);
		session.setAttribute("MANAGERNAME", managername);
		return logincheck;
	}

}

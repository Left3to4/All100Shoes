package com.jsplec.manager.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.manager.dao.MAddDao;

public class SManagerAddCommand implements SManagerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String managerid=request.getParameter("managerid");
		String managerpw=request.getParameter("managerpw");
		String managername=request.getParameter("managername");
		String managerphone=request.getParameter("managerphone");
		
		MAddDao dao=new MAddDao();
		dao.addAction(managerid, managerpw, managername, managerphone);
	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

}

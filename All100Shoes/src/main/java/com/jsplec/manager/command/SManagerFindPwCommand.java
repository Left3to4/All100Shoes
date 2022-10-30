package com.jsplec.manager.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.manager.dao.MLoginDao;

public class SManagerFindPwCommand implements SManagerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String managername=request.getParameter("managername");
		String managerphone=request.getParameter("managerphone");
		String managerid=request.getParameter("managerid");
		
		
		MLoginDao dao=new MLoginDao();
		String managerpw=dao.managerFindPw(managername, managerphone, managerid);
		request.setAttribute("MANAGERPW", managerpw);
	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String managername=request.getParameter("managername");
		String managerphone=request.getParameter("managerphone");
		String managerid=request.getParameter("managerid");
		
		
		MLoginDao dao=new MLoginDao();
		String managerpw=dao.managerFindPw(managername, managerphone, managerid);
		
		if(managerpw!=null) {
			return true;
		} else {
			return false;
		}
	}

}

package com.jsplec.manager.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.manager.dao.MLoginDao;

public class SManagerFindIdCommand implements SManagerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String managername=request.getParameter("managername");
		String managerphone=request.getParameter("managerphone");
		
		
		MLoginDao dao=new MLoginDao();
		String managerid=dao.managerFindId(managername, managerphone);
		request.setAttribute("MANAGERID", managerid);
		
	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String managername=request.getParameter("managername");
		String managerphone=request.getParameter("managerphone");
		
		
		MLoginDao dao=new MLoginDao();
		String managerid=dao.managerFindId(managername, managerphone);
		
		if(managerid!=null) {
			return true;
		} else {
			return false;
		}
	}

}

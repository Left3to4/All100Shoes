package com.jsplec.manager.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.manager.dao.MAddDao;

public class SManagerIdCheckCommand implements SManagerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String managerid=request.getParameter("managerid");
		String managerpw=request.getParameter("managerpw");
		String managerpwcheck=request.getParameter("managerpwchecktxt");
		String managername=request.getParameter("managername");
		String managerphone=request.getParameter("managerphone");
		MAddDao dao=new MAddDao();
		boolean check=dao.idCheck(managerid);
		
		request.setAttribute("CHECK", check);
		request.setAttribute("CHECKID", managerid);
		request.setAttribute("MANAGERPW", managerpw);
		request.setAttribute("MANAGERPWCHECK", managerpwcheck);
		request.setAttribute("MANAGERNAME2", managername);
		request.setAttribute("MANAGERPHONE", managerphone);
	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

}

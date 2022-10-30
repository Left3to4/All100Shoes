package com.jsplec.manager.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsplec.manager.dao.MMypageDao;

public class SManagerMypageUpdateCommand implements SManagerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		String managerid=(String)session.getAttribute("MANAGERID");
		String managername=(String)request.getAttribute("managername");
		String managerpw=(String)request.getAttribute("managerpw");
		
		MMypageDao dao=new MMypageDao();
		dao.updateAction(managerid, managername, managerpw);
	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

}

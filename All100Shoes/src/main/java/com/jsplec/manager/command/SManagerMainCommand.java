package com.jsplec.manager.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.manager.dao.MMainDao;

public class SManagerMainCommand implements SManagerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		MMainDao dao = new MMainDao();
		int user = dao.signToday();
		request.setAttribute("SIGNTODAY", user);
		
		int order = dao.ordersToday();
		request.setAttribute("ORDERSTODAY", order);

		int sales = dao.salesToday();
		request.setAttribute("SALESTODAY", sales);
		
	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

}

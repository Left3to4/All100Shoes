package com.jsplec.manager.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.manager.dao.MMainDao;

public class SManagerMainCommand implements SManagerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		MMainDao dao = new MMainDao();
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		int user = dao.signToday();
		request.setAttribute("SIGNTODAY", user);
		System.out.println(user);
		
		int order = dao.ordersToday();
		request.setAttribute("ORDERSTODAY", order);
		System.out.println(order);

		int sales = dao.salesToday();
		request.setAttribute("SALESTODAY", sales);
		System.out.println(sales);
		
	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

}

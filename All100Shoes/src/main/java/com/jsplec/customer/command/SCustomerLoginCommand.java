package com.jsplec.customer.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsplec.customer.dao.SCDaoLogin;
import com.jsplec.manager.dao.MLoginDao;

public class SCustomerLoginCommand implements SCustomerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
	}
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		String customerid = request.getParameter("customerid");
		String customerpw = request.getParameter("customerpw");
		HttpSession session=request.getSession();
		
		SCDaoLogin dao = new SCDaoLogin();
		boolean logincheck = dao.customerCheck(customerid, customerpw);
		String customername=dao.checkName(customerid, customerpw);
		session.setAttribute("CUSTOMERID", customerid);
		session.setAttribute("CUSTOMERNAME", customername);
		return logincheck;

	}

}

package com.jsplec.customer.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsplec.customer.dao.SCDaoLogin;

public class SCustomerFindpw implements SCustomerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		String customerid = request.getParameter("customerid");
		String customerphone = request.getParameter("customerphone");
		HttpSession session=request.getSession();
		SCDaoLogin dao = new SCDaoLogin();
		dao.customerFindPw(customerid, customerphone);
		String customerpw = dao.customerFindPw(customerid, customerphone);
		session.setAttribute("PW", customerpw);

	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

}

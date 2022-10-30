package com.jsplec.customer.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsplec.customer.dao.SCDaoLogin;
import com.mysql.cj.Session;

public class SCustomerFindid implements SCustomerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String customername = request.getParameter("customername");
		String customerphone = request.getParameter("customerphone");
		HttpSession session=request.getSession();
		SCDaoLogin dao = new SCDaoLogin();
		dao.customerFindid(customername, customerphone);
		String customerid = dao.customerFindid(customername, customerphone);
		session.setAttribute("ID", customerid);
		

	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

}

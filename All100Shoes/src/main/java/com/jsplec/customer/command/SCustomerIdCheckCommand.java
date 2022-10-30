package com.jsplec.customer.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.customer.dao.DaoSighup;

public class SCustomerIdCheckCommand implements SCustomerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String customerid=request.getParameter("customerid");
		DaoSighup dao=new DaoSighup();
		boolean check=dao.checkId(customerid);
		System.out.println(check);
		request.setAttribute("CHECK", check);
		request.setAttribute("CHECKID", customerid);
		
	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
	
		return false;
	}

}

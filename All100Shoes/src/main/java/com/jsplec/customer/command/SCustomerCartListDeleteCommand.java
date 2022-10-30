package com.jsplec.customer.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.customer.dao.SCustomerCartListDeleteDao;

public class SCustomerCartListDeleteCommand implements SCustomerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		String[] orderid = request.getParameterValues("orderid");
		
		SCustomerCartListDeleteDao dao = new SCustomerCartListDeleteDao();
		
		dao.cartListDelete(orderid);
		
	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

}

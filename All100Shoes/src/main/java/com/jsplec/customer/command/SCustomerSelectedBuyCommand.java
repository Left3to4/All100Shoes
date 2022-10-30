package com.jsplec.customer.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.customer.dao.SCustomerSelectedBuyDao;

public class SCustomerSelectedBuyCommand implements SCustomerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String orderid[] = request.getParameterValues("orderid");

		SCustomerSelectedBuyDao dao = new SCustomerSelectedBuyDao();
		dao.selectedBuy(orderid);
		
	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

}

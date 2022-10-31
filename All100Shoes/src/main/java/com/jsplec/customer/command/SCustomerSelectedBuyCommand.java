package com.jsplec.customer.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.customer.dao.SCustomerSelectedBuyDao;

public class SCustomerSelectedBuyCommand implements SCustomerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String orderid[] = request.getParameterValues("orderid");
		String productmodel = request.getParameter("productmodel");
		String productsize = request.getParameter("productsize");
		int orderquantity = Integer.parseInt(request.getParameter("orderquantity"));
		
		SCustomerSelectedBuyDao dao = new SCustomerSelectedBuyDao();
		dao.selectedBuy(orderid);
		dao.buyProductStockUpdate(productmodel, productsize, orderquantity);
		
	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

}

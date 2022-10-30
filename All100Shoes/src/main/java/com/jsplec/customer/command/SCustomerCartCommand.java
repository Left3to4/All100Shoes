package com.jsplec.customer.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.customer.dao.SCustomerCartDao;
import com.jsplec.customer.dto.SCustomerDetailDto;

public class SCustomerCartCommand implements SCustomerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		SCustomerCartDao dao = new SCustomerCartDao();

		int productsize = Integer.parseInt(request.getParameter("productsize"));
		int productprice = Integer.parseInt(request.getParameter("productprice"));
		int productstock = Integer.parseInt(request.getParameter("productstock"));
		String productmodel = request.getParameter("productmodel");
		
		int index = 0;
		
		int productid = dao.selectProductId(productsize, productmodel);
		
		ArrayList<SCustomerDetailDto> dtos = dao.selectProduct(request);
		
		int productidSize = dtos.size();
		
		for(int i = 0; i < productidSize; i++) {
			
			if(productid == dtos.get(i).getProductid()) {
				index++;
			}
		}
		
		if(index > 0) {
			dao.cartUpdate(productid, productstock, request);
		} else {
			dao.cartInsert(productid, productprice, productstock, request);
			
		}
		
	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}


}
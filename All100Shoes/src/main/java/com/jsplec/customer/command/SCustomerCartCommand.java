package com.jsplec.customer.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsplec.customer.dao.SCustomerCartDao;
import com.jsplec.customer.dto.SCustomerDetailDto;

public class SCustomerCartCommand implements SCustomerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		HttpSession session = request.getSession();
		SCustomerCartDao dao = new SCustomerCartDao();

		int productsize = Integer.parseInt(request.getParameter("productsize"));
		int productprice = Integer.parseInt(request.getParameter("productprice"));
		int productstock = Integer.parseInt(request.getParameter("productstock"));
		String productmodel = request.getParameter("productmodel");
		
		int productid = dao.selectProductId(productsize, productmodel);
		int index = 0;
		
		ArrayList<SCustomerDetailDto> dtos = dao.selectProduct(request);
		
		int productidSize = dtos.size();
		
		for(int i = 0; i < productidSize; i++) {
			
			if(productid == dtos.get(i).getProductid()) {
				index++;
			} else {
				
			}
		}
		if(index > 0) {
			System.out.println("hi");
			dao.cartUpdate(productid, productstock, request);
		} else {
			System.out.println("HELLO");
			dao.cartInsert(productid, productprice, productstock, request);
			
		}
		
	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}


}

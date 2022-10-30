package com.jsplec.customer.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.customer.dao.SCustomerDetailDao;
import com.jsplec.customer.dto.SCustomerDetailDto;

public class SCustomerDetailCommand implements SCustomerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		SCustomerDetailDao dao = new SCustomerDetailDao();
		String productmodel = request.getParameter("productmodel");
		
		SCustomerDetailDto dto = dao.productDetailModel(productmodel);
		
		request.setAttribute("productmodel", productmodel);
		request.setAttribute("detail", dto);
		
	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

}

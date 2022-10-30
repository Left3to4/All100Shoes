package com.jsplec.customer.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.customer.dao.SCustomerDetailDao;
import com.jsplec.customer.dto.SCustomerDetailDto;

public class SCustomerProductClickCommand implements SCustomerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		SCustomerDetailDao dao = new SCustomerDetailDao();
		
		String productmodel = (String) request.getAttribute("productmodel");
		ArrayList<SCustomerDetailDto> dtos = dao.productDetailSize(productmodel);
		
		request.setAttribute("list", dtos);
		
	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}
	
}

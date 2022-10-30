package com.jsplec.customer.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.customer.dao.SCustomerBrandListDao;
import com.jsplec.customer.dto.SCustomerBrandListDto;

public class SCustomerBrandListCommand implements SCustomerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		SCustomerBrandListDao dao = new SCustomerBrandListDao();
		ArrayList<SCustomerBrandListDto> dtos = dao.brandList();
		request.setAttribute("brandList", dtos);
	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

}

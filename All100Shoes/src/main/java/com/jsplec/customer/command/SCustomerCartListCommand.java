package com.jsplec.customer.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.customer.dao.SCustomerCartListDao;
import com.jsplec.customer.dto.SCustomerCartListDto;

public class SCustomerCartListCommand implements SCustomerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		SCustomerCartListDao dao = new SCustomerCartListDao();
		ArrayList<SCustomerCartListDto> dtos1 = dao.cartList(request);
		ArrayList<SCustomerCartListDto> dtos2 = dao.cartTotalPrice(request);
		int listCount = dao.cartListCount(request);
		
		int totalPrice = 0;
		
		for(int i = 0; i < dtos2.size(); i++) {
			totalPrice += dtos2.get(i).getOrderquantity() * dtos2.get(i).getOrdersaleprice();
		}
		
		request.setAttribute("list", dtos1);
		request.setAttribute("totalPrice", totalPrice);
		request.setAttribute("listCount", listCount);
	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

}

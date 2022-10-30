package com.jsplec.customer.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.customer.dao.SCustomerProductListDao;
import com.jsplec.customer.dto.SCustomerProductListDto;

public class SCustomerProductListCategoryCommand implements SCustomerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		String pbrand = request.getParameter("pbrand");
		String pcategory = request.getParameter("pcategory");

		if (pbrand == null) {
			pbrand = "";
			pcategory = "";
		}

		SCustomerProductListDao dao = new SCustomerProductListDao();
		ArrayList<SCustomerProductListDto> dtoss = dao.cProductList(pbrand, pcategory);
		request.setAttribute("productListCategory", dtoss);

	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

}

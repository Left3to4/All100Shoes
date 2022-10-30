package com.jsplec.manager.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.manager.dao.MSalesListDao;
import com.jsplec.manager.dto.MSalesDto;

public class SManagerSalesListCommand implements SManagerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		MSalesListDao dao = new MSalesListDao();
		ArrayList<MSalesDto> dtos = dao.salesList();
		request.setAttribute("SALESLIST", dtos);
	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

}

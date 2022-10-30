package com.jsplec.manager.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.manager.dao.MProductListDao;
import com.jsplec.manager.dto.MProductDto;

public class SManagerProductListCommand implements SManagerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String select = request.getParameter("select");
		String content = request.getParameter("content");
		
		if (select == null) {
			select = "productmodel";
			content = "";
		}
		
		MProductListDao dao = new MProductListDao();
		ArrayList<MProductDto> dtos = dao.search(select, content);
		request.setAttribute("PRODUCTLIST", dtos);
	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

}

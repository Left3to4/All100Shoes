package com.jsplec.manager.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.manager.dao.MUserListDao;
import com.jsplec.manager.dto.MUserDto;

public class SManagerUserSearchListCommand implements SManagerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String select = request.getParameter("select");
		String content = request.getParameter("content");
		
		MUserListDao dao = new MUserListDao();
		ArrayList<MUserDto> dtos = dao.search(select, content);
		request.setAttribute("USERLIST", dtos);
	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

}

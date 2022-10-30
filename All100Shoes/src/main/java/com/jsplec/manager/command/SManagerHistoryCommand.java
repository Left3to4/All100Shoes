package com.jsplec.manager.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.manager.dao.MHistoryDao;
import com.jsplec.manager.dto.MHistoryDto;

public class SManagerHistoryCommand implements SManagerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		MHistoryDao dao = new MHistoryDao();
		ArrayList<MHistoryDto> dtos = dao.historyList();
		request.setAttribute("HISTORYLIST", dtos);
	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

}

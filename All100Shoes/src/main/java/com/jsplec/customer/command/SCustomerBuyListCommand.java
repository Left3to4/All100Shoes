package com.jsplec.customer.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.customer.dao.SCustomerBuyListDao;
import com.jsplec.customer.dto.SCustomerBuyListDto;

public class SCustomerBuyListCommand implements SCustomerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		SCustomerBuyListDao dao = new SCustomerBuyListDao();
		ArrayList<SCustomerBuyListDto> dtos =  dao.buyList(request);
		
		int page = 1; //처음에는 무조건 1페이지가 실행되도록
		int limit = 10; //한 페이지에 보이는 최대 게시글 개수
		
		//값이 넘어오면 null이 아니고, 값을 선택한 적이 없으면 null → 여기 정해둔 대로 page값이 1.
		if(request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
			
		//페이징을 위해 전체 레코드(글) 개수를 조회해줄 메소드를 DAO에서 가져와 사용할 것
		int listcount = dao.buyListCount(request);
		
//		int maxpage = (int)((double)listcount / 10 + 0.95);
//		int startpage = (((int)((double)page / 10 + 0.9)) -1) * 10 + 1;
//		//startpage와 startrow 같게 써도 됨.. startrow가 훨씬 간단..
//		int endpage = startpage + 10 - 1;
		
		int maxpage = (listcount %  limit) != 0 ? (listcount/limit) + 1 : (listcount/limit);
	      int startpage = ((int)((double)page/limit + 0.9)-1)*limit+1;
	      int endpage = startpage + limit -1;

		
		if(endpage > maxpage) {                                                                            
		    endpage = maxpage;                                                                               
		} 
		
		request.setAttribute("buyList", dtos);
//		request.setAttribute("boardList", boardList);

		request.setAttribute("maxpage", maxpage);
		request.setAttribute("startpage", startpage);
		request.setAttribute("endpage", endpage);
		request.setAttribute("listcount", listcount);
		request.setAttribute("page", page);
		
		
	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

}

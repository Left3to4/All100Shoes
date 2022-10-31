package com.jsplec.common.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsplec.customer.command.SCustomerBuyListCommand;
import com.jsplec.customer.command.SCustomerCartCommand;
import com.jsplec.customer.command.SCustomerCartListCommand;
import com.jsplec.customer.command.SCustomerCartListDeleteCommand;
import com.jsplec.customer.command.SCustomerCommand;
import com.jsplec.customer.command.SCustomerDetailCommand;
import com.jsplec.customer.command.SCustomerFindid;
import com.jsplec.customer.command.SCustomerFindpw;
import com.jsplec.customer.command.SCustomerIdCheckCommand;
import com.jsplec.customer.command.SCustomerLoginCommand;
import com.jsplec.customer.command.SCustomerProductClickCommand;
import com.jsplec.customer.command.SCustomerProductListCategoryCommand;
import com.jsplec.customer.command.SCustomerProductListCommand;
import com.jsplec.customer.command.SCustomerSelectedBuyCommand;
import com.jsplec.manager.command.MMypageShowInfoCommand;
import com.jsplec.manager.command.SManagerAddCommand;
import com.jsplec.manager.command.SManagerCommand;
import com.jsplec.manager.command.SManagerFindIdCommand;
import com.jsplec.manager.command.SManagerFindPwCommand;
import com.jsplec.manager.command.SManagerHistoryCommand;
import com.jsplec.manager.command.SManagerIdCheckCommand;
import com.jsplec.manager.command.SManagerLoginCommand;
import com.jsplec.manager.command.SManagerMainCommand;
import com.jsplec.manager.command.SManagerMypageDeleteCommand;
import com.jsplec.manager.command.SManagerMypageUpdateCommand;
import com.jsplec.manager.command.SManagerProductListCommand;
import com.jsplec.manager.command.SManagerSalesListCommand;
import com.jsplec.manager.command.SManagerUserListCommand;


/**
 * Servlet implementation class Controller
 */
@WebServlet("*.do")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Controller() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		actionDo(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		actionDo(request, response);
	}

	private void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String viewPage = null;
		SManagerCommand managercommand = null;
		SCustomerCommand customercommand = null;
		
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());
		
		switch(com) {

//		-------------- 유승 --------------------------
		case("/Manager/login.do"):
			managercommand = new SManagerLoginCommand();
			boolean check = managercommand.execute2(request, response);
			
			if (check == false) {
				request.setAttribute("CHECK", check);
				viewPage = "managerlogin.jsp";
			} else {
				viewPage = "managermain.do";
			}
			break;
		case("/Manager/idcheck.do"):
	         managercommand=new SManagerIdCheckCommand();
	         managercommand.execute(request, response);
	         
	         viewPage="managerAdd.jsp";
	         break;
	         
	      case("/Manager/delete.do"):
	         managercommand=new SManagerMypageDeleteCommand();
	         managercommand.execute(request, response);
	         viewPage="managermain.do";
	         break;
	         
	      case("/Manager/update.do"):
	         managercommand=new SManagerMypageUpdateCommand();
	         managercommand.execute(request, response);
	         viewPage="managermain.do";
	         break;
	      
	      case("/Manager/manageradd.do"):
	         managercommand=new SManagerAddCommand();
	         managercommand.execute(request, response);
	         viewPage="managerlogin.jsp";
	         break;
	        
	      case ("/Manager/mypage.do"):
	    	   managercommand=new MMypageShowInfoCommand();
	    	   managercommand.execute(request, response);
	    	   viewPage="managerMypage.jsp";
	    	   break;
	    	   
	      case("/Manager/managerfindid.do"):
	    	   managercommand=new SManagerFindIdCommand();
	    	   managercommand.execute(request, response);
	    	   viewPage="managerShowId.jsp";
	    	   break;

	    	case("/Manager/managerfindpw.do"):
	    	   managercommand=new SManagerFindPwCommand();
	    	   managercommand.execute(request, response);
	    	   viewPage="managerShowPw.jsp";
	    	   break;
	         
//			-------------- 예진 --------------------------
    	case("/Manager/managermain.do"):
			managercommand = new SManagerMainCommand();
			managercommand.execute(request, response);
			viewPage = "managerMain.jsp";
			break;
			
    	case("/Manager/userlist.do"):
			managercommand = new SManagerUserListCommand();
			managercommand.execute(request, response);
			viewPage = "managerUserList.jsp";
			break;
			
    	case("/Manager/productlist.do"):
    		managercommand = new SManagerProductListCommand();
	    	managercommand.execute(request, response);
	    	viewPage = "managerProductList.jsp";
	    	break;
    	
    	case("/Manager/sales.do"):
    		managercommand = new SManagerSalesListCommand();
	    	managercommand.execute(request, response);
	    	viewPage = "managerSales.jsp";
	    	break;
	    	
    	case("/Manager/history.do"):
    		managercommand = new SManagerHistoryCommand();
	    	managercommand.execute(request, response);
	    	viewPage = "managerHistory.jsp";
	    	break;
	    	
//			-------------- 오수 --------------------------
		case("/Customer/customerProductList.do"):
			customercommand = new SCustomerProductListCommand();
			customercommand.execute(request, response);
			viewPage = "customerProductList.jsp";
			break;
			
		case("/Customer/customerProductListCategory.do"):
			customercommand = new SCustomerProductListCategoryCommand();
			customercommand.execute(request, response);
			viewPage = "customerProductList.jsp";
			break;
			
//			-------------- 태권 --------------------------
		case("/Customer/login.do"):
			customercommand = new SCustomerLoginCommand();
			boolean check1 = customercommand.execute2(request, response);
			
			if (check1 == false) {
				request.setAttribute("CHECK1", check1);
				viewPage = "login.jsp";
			} else {
				viewPage = "customerProductList.do";
			}
			break;
			
		case("/Customer/idcheck.do"):
			customercommand=new SCustomerIdCheckCommand();
			customercommand.execute(request, response);
	        viewPage="customerSighup.jsp";
	        break;
	        
		case("/Customer/customerfindid.do"):
			customercommand = new SCustomerFindid();
			customercommand.execute(request, response);
			viewPage = "customerFindid.jsp";
			break;
			
		case("/Customer/findpw.do"):
			customercommand = new SCustomerFindpw();
			customercommand.execute(request, response);
			viewPage = "customerFindpw.jsp";
			break;
			
		
			
//			-------------- 한별 --------------------------
		
        // 상품 상세정보 리스트
  		case("/Customer/productDetail.do"):
  			customercommand = new SCustomerDetailCommand();
  			customercommand.execute(request, response);
  			viewPage = "productClick.do";
  			break;
	         
		// 상품 상세정보 리스트
		case("/Customer/productClick.do"):
			customercommand = new SCustomerProductClickCommand();
			customercommand.execute(request, response);
			viewPage = "productDetail.jsp";
			break;
		
		// 장바구니 담기
		case("/Customer/productCart.do"):
			customercommand = new SCustomerCartCommand();
			customercommand.execute(request, response);
			viewPage = "customerCartPage.do";
			break;
		
		// 장바구니 리스트 출력
		case("/Customer/customerCartPage.do"):
			customercommand = new SCustomerCartListCommand();
			customercommand.execute(request, response);
			viewPage = "customerCartPage.jsp";
			break;
			
		// 장바구니 상품 구매하기
		case("/Customer/selectedProductBuy.do"):
			customercommand = new SCustomerSelectedBuyCommand();
			customercommand.execute(request, response);
			viewPage = "main.jsp";
			break;
		
//		// 장바구니 상품 삭제
//		case("/Customer/cartListDelete.do"):
//			customercommand = new SCustomerCartListDeleteCommand();
//			customercommand.execute(request, response);
//			viewPage = "customerCartPage.do";
//			break;
		
		// 장바구니 선택 상품 삭제하기
		case("/Customer/selectedProductDelete.do"):
			customercommand = new SCustomerCartListDeleteCommand();
			customercommand.execute(request, response);
			viewPage = "customerCartPage.do";
			break;
			
		// 구매 리스트 출력
		case("/Customer/customerBuyList.do"):
			customercommand = new SCustomerBuyListCommand();
			customercommand.execute(request, response);
			viewPage = "customerBuyList.jsp";
			break;
		
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
		
	}
}

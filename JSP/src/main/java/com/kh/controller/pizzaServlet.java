package com.kh.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class pizzaServlet
 */
public class pizzaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public pizzaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1)인코딩처리
		request.setCharacterEncoding("UTF-8");
		
		//2) 요청시 전달값 추출, 데이터가공처리 -> 변수나 객체에 넘겨받은 값을 기록한다.
		String name = request.getParameter("userName");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		String message = request.getParameter("message");
		
		String pizza = request.getParameter("pizza");
		String[] toppings = request.getParameterValues("toppings");
		String[] side = request.getParameterValues("side");
		String payment = request.getParameter("payment");
		
		//3)요청처리(db에 sql문 실행 > service > dao)
		
		int price = 0;
		switch(pizza) {
		case "콤비네이션" : price += 5000;break;
		case "치즈" :
		case "포테이토" : price += 6000;break;
		default: price += 7000;
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

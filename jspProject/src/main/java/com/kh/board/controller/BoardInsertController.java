package com.kh.board.controller;

import java.io.IOException;

import org.apache.commons.fileupload2.jakarta.JakartaServletFileUpload;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BoardInsertController
 */
public class BoardInsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**	
     * @see HttpServlet#HttpServlet()
     */
    public BoardInsertController() {
        super();
        // TODO Auto-generated constructor stub
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		//일반방식이 아닌 multipart/form-date로 전송하는 경우 request로부터 값 추출 불가
		//String boardTitle = request.getParameter("title");
		//System.out.println(boardTitle);
		

		//enctype이 multipart/form-data로 전송이 되었는지 체크
		System.out.println(JakartaServletFileUpload.isMultipartContent(request));
		if(JakartaServletFileUpload.isMultipartContent(request)) {
			
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

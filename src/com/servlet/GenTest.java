package com.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/GenTest")
public class GenTest extends HttpServlet {
	ArrayList<Gen> veriler;
	String[] baslik;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String genName=request.getParameter("genName");
		gengönder(genName);
		request.setAttribute("genbilgisi", veriler); 
		request.setAttribute("baslikbilgisi", baslik); 
		request.getRequestDispatcher("gengoster.jsp").forward(request, response);
		System.out.println(genName);
	}
	
	public void gengönder(String genList) throws IOException{
		//String genStr = gen;
		
//		ArrayList<Gen> genListTest = genList;
		
		CSVclass csv = new CSVclass();
		baslik=csv.baslýkgonder();
		
		veriler = csv.bilgigonder(genList);
		System.out.println(genList);
		
	}

}

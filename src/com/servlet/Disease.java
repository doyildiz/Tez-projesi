package com.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Disease")
public class Disease extends HttpServlet {
	private static final long serialVersionUID = 1L;

ArrayList<Gen> veriler;
String[] baslik;


public Disease() {
   super();
  
}


protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doPost(request, response);
}


protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String hastalýk_adý=(String)request.getParameter("hastalik");//ÞÝMDÝLÝK hastalýk geldi
//	System.out.print(hastalýk_adý);
	//String gen_adý;
	ArrayList<String> genList;
	
	JsonClass js = new JsonClass();
	genList = js.geneList(hastalýk_adý);
	
	gengönder(genList);
	request.setAttribute("genbilgisi", veriler); 
	request.setAttribute("baslikbilgisi", baslik); 
	request.setAttribute("hastalik_adi", hastalýk_adý);
	request.getRequestDispatcher("gen.jsp").forward(request, response);
//	System.out.print(hastalýk_adý);
	
}
public void gengönder(ArrayList<String> genList) throws IOException{
	//String genStr = gen;
	
//	ArrayList<Gen> genListTest = genList;
	
	CSVclass csv = new CSVclass();
	baslik=csv.baslýkgonder();
	
	veriler = csv.verigonder(genList);
	
}
}

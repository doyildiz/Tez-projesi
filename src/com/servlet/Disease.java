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
	String hastal�k_ad�=(String)request.getParameter("hastalik");//��MD�L�K hastal�k geldi
//	System.out.print(hastal�k_ad�);
	//String gen_ad�;
	ArrayList<String> genList;
	
	JsonClass js = new JsonClass();
	genList = js.geneList(hastal�k_ad�);
	
	geng�nder(genList);
	request.setAttribute("genbilgisi", veriler); 
	request.setAttribute("baslikbilgisi", baslik); 
	request.setAttribute("hastalik_adi", hastal�k_ad�);
	request.getRequestDispatcher("gen.jsp").forward(request, response);
//	System.out.print(hastal�k_ad�);
	
}
public void geng�nder(ArrayList<String> genList) throws IOException{
	//String genStr = gen;
	
//	ArrayList<Gen> genListTest = genList;
	
	CSVclass csv = new CSVclass();
	baslik=csv.basl�kgonder();
	
	veriler = csv.verigonder(genList);
	
}
}

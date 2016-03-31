
package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DiseaseTest")
public class DiseaseTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	String hast ;


public DiseaseTest() {
 super();
 // TODO Auto-generated constructor stub
}


protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doPost(request, response);
}


protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
	
	
	String selectedValue=request.getParameter("value");
	
	hast=selectedValue;
	
	String desc;
	desc = Ac�klamaAl(hast);
	
	request.setAttribute("hastalik", hast); 
	request.setAttribute("aciklama", desc); 
	
	request.getRequestDispatcher("ikinci.jsp").forward(request, response);

}

public String Ac�klamaAl(String hastal�k){//public String Ac�klamaAl(String hastal�k)
	JsonClass json = new JsonClass();
	String ac�klama;//String ac�klama
	ac�klama = json.desc(hastal�k);
	return ac�klama;
}

}

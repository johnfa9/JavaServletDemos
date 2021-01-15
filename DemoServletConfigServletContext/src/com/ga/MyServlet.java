package com.ga;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Practical implementation of ServletConfig and ServletContext
//
//They both are interface.
//ServletConfig and ServletContext both are used to get initial value of servlet or an application.
//The values are stored in key value pair.
//context-param and context-name tags are used to store the values.
//In ServletContext values are shared by all the servlets  Can be used to supply username and password
//Whereas in ServletConfig values each servlet can have independent values.

//start tomcat and run this class

public class MyServlet extends HttpServlet{

	public MyServlet() {
		// TODO Auto-generated constructor stub
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		PrintWriter out = response.getWriter();
		out.print("Hi ");
		
		ServletContext ctx =   getServletContext();  //method from HttpServlet
		String str =ctx.getInitParameter("phone");
				out.println(str);
		
		ServletConfig cg = getServletConfig();  //will get from servlet definition area in web.xml
		String str2= cg.getInitParameter("name");
		out.println(str2);
	}

}

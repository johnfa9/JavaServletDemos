package com.ga;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/addAlien")
public class AddServlet extends HttpServlet{


	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		System.out.println("In Servlet");
		PrintWriter out = res.getWriter();
		int aid = Integer.parseInt(req.getParameter("aid"));
		String aname =  req.getParameter("aname");
		out.println("welcome " + aname);
	}

}

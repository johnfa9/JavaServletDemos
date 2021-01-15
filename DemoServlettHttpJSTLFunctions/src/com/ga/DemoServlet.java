package com.ga;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DemoServlet extends HttpServlet{

	public DemoServlet() {
		// TODO Auto-generated constructor stub
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String name = "Navin";
		List<Student> studs= Arrays.asList(new Student(1,"john"),new Student(2,"Mike"));
		Student s = new Student(1,"Navin");
		request.setAttribute("student", s); //jsp will access properties of student
		request.setAttribute("students", studs);
		request.setAttribute("label", name);
		RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
		rd.forward(request, response);
		
	}
}

package com.ga;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class idFilter
 */
@WebFilter("/addAlien")
public class idFilter implements Filter {  //name of the filter is idFilter, implements interface

  

	
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//order 1. page, filter, servlet
		
		PrintWriter out = response.getWriter();
		System.out.println("In Filter");
		//convert ServletRequest into HttpServletRequest
		HttpServletRequest req = (HttpServletRequest)request;
		
		int aid = Integer.parseInt(req.getParameter("aid"));
		
		if (aid>1) {
			chain.doFilter(request, response);  //call next filter, is no more filters it will call servlet
		}
		else
			out.print("invalid Input");
		
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// To initialize values
	}

}

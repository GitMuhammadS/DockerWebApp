package com.shahbaz.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/dateurl")
public class DateServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//get print writer
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		Date d=new Date();
		pw.println("<h1 style='color:red'>Date and Time "+d+"</h1>");
		pw.println("<br><a href='index.jsp'>home</a>");
		pw.close();
		
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req,res);
	}
	
}

package com.Tech.pro;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/app")
public class Tech extends HttpServlet
{
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		String fullName=req.getParameter("fullName");
		int number=Integer.parseInt(req.getParameter("number"));
		String source=req.getParameter("source");
		String destination=req.getParameter("destination");
		String vehicle=req.getParameter("vehicle");
		int kms=Integer.parseInt(req.getParameter("distance"));
		int price=Integer.parseInt(req.getParameter("price"));
		int amount=kms*price;
		req.setAttribute("am", amount);
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
//		out.println(fullName);
//		out.println(number);
//		out.println(source);
//		out.println(destination);
//		out.println(vehicle);
//		out.println(amount);
//		out.println("<HTML>"
//				+ "FullName : " + fullName +"<BR>"
//				+ "Mobile : " + number +"<BR>"
//				+ "Source : " + source +"<BR>"
//				+ "Destination : " + destination +"<BR>"
//				+ "Vehicle : " + vehicle +"<BR>"
//				+ "The total Amount is : " + amount +"<BR>"
//				+ "</HTML>");
//		out.println("Thank you for using Our Service");
		DBDemo DB=new DBDemo();
		try
		{
			int rows=DB.getDB(fullName, number, source, destination, vehicle, amount, price);
			if(rows>0)
			{
				
				out.println("Succesfully Submitted");
				
				RequestDispatcher request=req.getRequestDispatcher("Configjsp.jsp");
				request.include(req, res);
			}
			else
				out.println("please try again");
		}
		catch (ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
	}
}

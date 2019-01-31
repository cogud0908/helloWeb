package com.douzon.helloweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class tableServlet
 */
@WebServlet({"/table", "/t", "/tbl"})
public class tableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			String row=request.getParameter("r");
			String col=request.getParameter("c");
		 
			int nRow=(row!=null)?nRow=	Integer.parseInt(row):1;
			int nCol=(col!=null)?nCol=Integer.parseInt(col):1;
			
			//응답
			PrintWriter pw=response.getWriter();
			pw.write("<table border=\"2px\" padding=\"0px\" cellspacing=0 cellpadding=\"5px\">");
			for(int i=0;i<nRow;i++) {
				pw.write("<tr>");
				for(int j=0;j<nCol;j++) {
					pw.write("<td> cell("+i+", "+j+")</td>");
				}
				pw.write("</tr>");
			}
			pw.write("</table>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

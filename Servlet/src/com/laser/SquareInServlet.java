package com.laser;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareInServlet extends HttpServlet {
public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
{

	
	int k=(int)req.getAttribute("k");
	k=k*k;
	PrintWriter out=res.getWriter();
	out.println("Square is "+k);
}
}

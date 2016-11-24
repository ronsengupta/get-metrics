package com.redhat;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MetricsServlet
 */
@WebServlet("/")
public class MetricsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String COUNT_VAR_NAME = "count";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MetricsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int count = (null == request.getParameter(COUNT_VAR_NAME))? 0: Integer.parseInt(request.getParameter(COUNT_VAR_NAME));
		response.getWriter().append(""+count);
	}

}

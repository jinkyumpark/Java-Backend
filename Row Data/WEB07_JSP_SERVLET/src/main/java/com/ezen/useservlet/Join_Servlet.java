package com.ezen.useservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Join_Servlet
 */
@WebServlet("/Join_Servlet")
public class Join_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Join_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String gender = request.getParameter("gender");
		
		
		if(gender.equals("1")) request.setAttribute("gender", "male");
		else request.setAttribute("gender", "female");
		
		
		
		String[] inter = new String[interest.length];
		for(int i = 0; i < inter.length; i++) {
			switch(interest[i]) {
			case "1" : inter[i] = "에스프레소"; break;
			case "2" : inter[i] = "로스팅"; break;
			case "3" : inter[i] = "생두"; break;
			case "4" : inter[i] = "원두"; break;
			case "5" : inter[i] = "핸드드립"; break;
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

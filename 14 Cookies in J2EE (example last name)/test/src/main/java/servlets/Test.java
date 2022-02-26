package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Test() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Read the cookies
		Cookie[] cookies = request.getCookies();
		this.getServletContext().getRequestDispatcher("/WEB-INF/Hello.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String lastName = request.getParameter("lastName");
		
		// Store a cookie on the visitor's side that expire in 1 month
		Cookie cookie = new Cookie("lastName", lastName);
		cookie.setMaxAge(3600*24*30);
		response.addCookie(cookie);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/Hello.jsp").forward(request, response);
	}

}

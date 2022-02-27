package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import bdd.Persons;
import beans.PersonBean;

public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Test() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Persons persons= new Persons();
		request.setAttribute("persons", persons.getPersons());
		this.getServletContext().getRequestDispatcher("/WEB-INF/Hello.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		PersonBean person = new PersonBean(firstName, lastName);
		Persons persons= new Persons();
		persons.insertPerson(person);
		request.setAttribute("persons", persons.getPersons());
		this.getServletContext().getRequestDispatcher("/WEB-INF/Hello.jsp").forward(request, response);
	}

}

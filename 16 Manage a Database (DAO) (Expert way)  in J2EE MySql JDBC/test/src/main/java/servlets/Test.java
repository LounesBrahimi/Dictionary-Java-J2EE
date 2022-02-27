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
import dao.DaoFactory;
import dao.PersonDao;

public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PersonDao personDao;
	
    public void init() throws ServletException {
        DaoFactory daoFactory = DaoFactory.getInstance();
        this.personDao = daoFactory.getPersonDao();
    }
    
    public Test() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("persons", this.personDao.listAll());
		this.getServletContext().getRequestDispatcher("/WEB-INF/Hello.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		PersonBean person = new PersonBean(firstName, lastName);
		this.personDao.insert(person);
		request.setAttribute("persons", this.personDao.listAll());
		this.getServletContext().getRequestDispatcher("/WEB-INF/Hello.jsp").forward(request, response);
	}

}

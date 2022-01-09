package app.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AccueilServlet extends HttpServlet {

    // ATTRIBUTS



    //

    // CONSTRUCTEUR



    //

    // GETTER / SETTER



    //

    // PROCEDURES

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("get");
		
		// Connexion du Servlet au jsp
        this.getServletContext().getRequestDispatcher("/views/accueil.jsp").include(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("post");
    }


    //
}

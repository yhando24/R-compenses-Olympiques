package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Listener.AppliListener;
import bean.Athletes;
import bean.Medaille;
import enums.CategorieMedaille;
import enums.Epreuves;

/**
 * Servlet implementation class manipMedailleServlet
 */
@WebServlet(urlPatterns = {"/AddMedaille", "/ShowRecompense"})
public class manipMedailleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public manipMedailleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    HttpSession session = request.getSession();
		
		
		
			// si on veux rajouter une medaille a un athlete
	    if(request.getRequestURI().substring(request.getRequestURI().lastIndexOf("/")+1).equals("AddMedaille")) {
	    	
	    	// on verifie si la medaille n'a pas ete deja attribué
	    	boolean exist = false;
	    	
	    for (Athletes athletes2 : AppliListener.getAthletes()) {
	    	for (Medaille medaille : athletes2.getMedailles()) {
	    			if(medaille.getCategorieMedaille().equals(CategorieMedaille.valueOf(request.getParameter("medaille")))){
	    				if(medaille.getEpreuve().equals(Epreuves.valueOf(request.getParameter("epreuve")))) {
	    					exist = true;
	    				}
	    			}
				
			}
	    }
	    	// si la medaille n'a pas deja ete attribué on la donne 
        if(exist == false){
        	 for (Athletes athletes2 : AppliListener.getAthletes()) {
				if(athletes2.getNom().equals(request.getParameter("athlete"))) {
					athletes2.addMedaille(new Medaille(CategorieMedaille.valueOf(request.getParameter("medaille")), (Epreuves.valueOf(request.getParameter("epreuve")))));
					session.setAttribute("errorAddMedaille", null);
				}
			}
        	 
        }else {
        	session.setAttribute("errorAddMedaille", "Medaille deja attribué dans cette epreuve");
        }
        System.out.println(request.getRequestURL().substring(0, request.getRequestURL().lastIndexOf("/")+1));
        	 session.setAttribute("athletes", AppliListener.getAthletes());
        	 response.sendRedirect("http://localhost:8484/RECOMPENSES_OLYMPIQUES/connection");
    	}
	    
	    
	    //affichage des recompenses
	    
	    if(request.getRequestURI().substring(request.getRequestURI().lastIndexOf("/")+1).equals("ShowRecompense")) {
	    	System.out.println("laaaaaaa");
			RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/show_recompense.jsp");
			dispatcher.forward(request, response);
	    }
	    
	    
	    
	    
	    
	}

}

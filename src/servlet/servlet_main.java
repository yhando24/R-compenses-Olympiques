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

import bean.Athletes;
import bean.Medaille;
import enums.CategorieMedaille;
import enums.Epreuves;



/**
 * Servlet implementation class servlet_main
 */
@WebServlet(urlPatterns = {"/connection"})
public class servlet_main extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static ArrayList <Athletes> athletes;
	static {
    	
		athletes = new ArrayList<Athletes>();
    	
    	athletes.add(new Athletes("Samir","BEN"));
    	athletes.add(new Athletes("Youcef","THEBOSS"));
    	athletes.add(new Athletes("RACHID","CALI"));
    	athletes.add(new Athletes("YOHAN","BENBOUDAOUD"));
    	athletes.add(new Athletes("NICOLA","PERSINET"));
    
	}
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servlet_main() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    HttpSession session = request.getSession();
	   	session.setAttribute("athletes", athletes);
		if(session.getAttribute("pseudo") == null) {
			RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/Connection.jsp");
			dispatcher.forward(request, response);
		}else {
	  		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/connecter.jsp");
	  		dispatcher.forward(request, response);
		}


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		// TODO Auto-generated method stub
	    HttpSession session = request.getSession();
        System.out.println(request.getRequestURI().substring(request.getRequestURI().lastIndexOf("/")+1));
//	    		si la session existe ou si il se connect avec les bonne valeurs
   
        
        
	    if( request.getParameter("userName").equals("admin") &&  request.getParameter("password").equals("password")) {
	    	
	   
		    	session.setAttribute("pseudo", request.getParameter("userName"));
		    	session.setAttribute("password", request.getParameter("password"));
		    	

		 
		    	
		    	
		    	Epreuves[] yourEnums = Epreuves.values();
		    	session.setAttribute("Epreuves", yourEnums);
		    	
		    	CategorieMedaille[] medailles = CategorieMedaille.values();
		    	session.setAttribute("medailles", medailles);
		    	
		    	session.setAttribute("erreur", null);
	  		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/connecter.jsp");
	  		dispatcher.forward(request, response);

      
	    }
	    else if(request.getRequestURI().substring(request.getRequestURI().lastIndexOf("/")+1).equals("AddMedaille")) {
	    		
	    	}
	    else {
	      	session.setAttribute("erreur", "Mot de passe ou utilisateur inconnue");
	    	response.sendRedirect("http://localhost:8484/RECOMPENSES_OLYMPIQUES/connection");
	  
	    }
	    
	    
	}

}

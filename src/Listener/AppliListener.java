package Listener;

import java.util.ArrayList;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import bean.Athletes;

/**
 * Application Lifecycle Listener implementation class AppliListener
 *
 */
@WebListener
public class AppliListener implements ServletContextListener {

	static ArrayList <Athletes> athletes;
	static {
    	
		athletes = new ArrayList<Athletes>();
    	
    	athletes.add(new Athletes("Samir","BEN"));
    	athletes.add(new Athletes("Youcef","THEBOSS"));
    	athletes.add(new Athletes("RACHID","CALI"));
    	athletes.add(new Athletes("YOHAN","BENBOUDAOUD"));
    	athletes.add(new Athletes("NICOLAS","PERSINET"));
    
	}
    public AppliListener() {
     System.out.println("Demarrage de l'application");
    }
    
    public static  ArrayList <Athletes> getAthletes() {
		return athletes;
    	
    }
	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }
	
}

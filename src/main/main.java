package main;
import bean.Athletes;
import bean.Medaille;
import enums.CategorieMedaille;
import enums.Epreuves;

public class main {

	public static void main(String[] args) {
			
		// Creation de nos Champions
		Athletes a1 = new Athletes("James","Bond");
		Athletes a2 = new Athletes("Harry","Potter");
		
		// a1 remporte une medaille d'or au cent metres 
		a1.addMedaille(new Medaille(CategorieMedaille.OR, Epreuves.CENTMETRES  ));
		
		
		// a1 remporte une medaille de Bronze au lancer de poids 
		a1.addMedaille(new Medaille(CategorieMedaille.BRONZE, Epreuves.LANCERDEPOIDS  ));
		System.out.println(a1.toString());
		
		
		
		// a2 participe a l'epreuves de saut en hauteur mais il ne remporte pas de medaille
		a2.addEpreuve(Epreuves.SAUTHAUTEUR);
		System.out.println(a2.toString());
		
	}

}

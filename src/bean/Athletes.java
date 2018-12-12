package bean;
import java.util.ArrayList;
import java.util.List;

import enums.Epreuves;

public class Athletes {
	private String nom;
	private String prenom;
	
	// un Athletes est inscrit a 0 epreuves de base
	private List<Epreuves> epreuves = new ArrayList<>();
	// et il possede 0 medailles de base
	private List <Medaille> medailles = new ArrayList<Medaille>();
	
	
	public Athletes() {
		
	}
	
	
	public Athletes(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public Athletes(String nom, String prenom, List<Epreuves> epreuves, List<Medaille> medaille) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.epreuves = epreuves;
		this.medailles = medaille;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public List<Epreuves> getEpreuves() {
		return epreuves;
	}


	public void setEpreuves(List<Epreuves> epreuves) {
		this.epreuves = epreuves;
	}


	public List<Medaille> getMedailles() {
		return medailles;
	}


	public void setMedailles(List<Medaille> medaille) {
		this.medailles = medaille;
	}
	
	// si on ajoute une medaille a un athletes on lui ajoute aussi l'epreuves ou il a gagné cette medaille
	public void addMedaille(Medaille medaille) {
		this.medailles.add(medaille);
		this.epreuves.add(medaille.getEpreuve());
	}
	
	public void addEpreuve(Epreuves epreuve) {
		this.epreuves.add(epreuve);
	}
	

	/**
	 * on parcours la liste des epreuves et on regarde les medailles gagner a cette epreuves
	 * des que le nom de l'epreuve de la medaille gagner correspond au nom de l'epreuve on affiche son resultat et on passe le boolean win a true
	 * si le boolean est a false sur cette epreuve sa signifie que l'athlete a participe a cette epreuve mais qu'il na rien gagner
	 */
	@Override
	public String toString() {
	String message = "L' athlete " + nom + " " + prenom + " a participés aux épreuves suivantes : \r\n  ";
	for (Epreuves epreuve : epreuves) {
		Boolean win = false;
		message += "- "	+ epreuve.getNom() + " (qui consiste a un " + epreuve.getDescription() + ")" ;

		for (Medaille medaille : medailles) {
			if(epreuve.getNom().equals(medaille.getEpreuve().getNom())){
				win = true;
				message +=  " et a remporté la " + medaille.getCategorieMedaille().getCategorie() + " :) \r\n  ";
			}
		}
		if(!win) {
			message += " et n'a pas remporté de medaille :( \r\n  ";
		}
		
	}
	return message;
				
	}


	
	
	
	
	
	
	
	
}

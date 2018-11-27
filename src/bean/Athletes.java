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
	


	@Override
	public String toString() {
	String message = "L' athlete " + nom + " " + prenom + " a participés aux épreuves suivantes : \r\n  ";
	for (Epreuves epreuve : epreuves) {
		message += "- "	+ epreuve.getNom() + " (qui consiste a un " + epreuve.getDescription() + ")" ;
		Boolean win = false;
		for (Medaille medaille : medailles) {
			if(epreuve.getNom().equals(medaille.getEpreuve().getNom())){
				 win = true;
				message +=  " et a remporté la " + medaille.getCategorieMedaille().getCategories() + " :) \r\n  ";
			}
		}
		if(medailles.isEmpty()) {
			message += " et n'a pas remporté de medaille :( \r\n  ";
		}
		
	}
	return message;
				
	}


	
	
	
	
	
	
	
	
}

package enums;

public enum Epreuves {
	
	CENTMETRES("100 Metres", "Course de 100 metres en exterieur"),
	DEUXCENTMETRE("200 Metres", "Course de 200 metres en exterieur"),
	LANCERDEPOIDS("lancer de poids", "Concours de lancer de poids de 30 kilos en exterieur"),
	SAUTHAUTEUR("Saut en hauteur", "Concours de saut en hauter en exterieur"),
	TRIPLESAUT("Saut en longeur", "Concours de saut en longeurs avec la possibilite de faire 3 saut en exterieur");
	
	private final String nom;
	private final String description;
	
	
	private Epreuves(String nom, String description) {
		this.nom = nom;
		this.description = description;
	}


	public String getNom() {
		return nom;
	}


	public String getDescription() {
		return description;
	}
	
	
}

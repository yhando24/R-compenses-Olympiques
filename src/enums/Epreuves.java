package enums;

public enum Epreuves {
	
	CENTMETRES("100 Metres", "Course de 100 metres en exterieur", "CENTMETRES"),
	DEUXCENTMETRE("200 Metres", "Course de 200 metres en exterieur" , "DEUXCENTMETRE"),
	LANCERDEPOIDS("lancer de poids", "Concours de lancer de poids de 30 kilos en exterieur" , "LANCERDEPOIDS"),
	SAUTHAUTEUR("Saut en hauteur", "Concours de saut en hauter en exterieur" , "SAUTHAUTEUR"),
	TRIPLESAUT("Saut en longeur", "Concours de saut en longeurs avec la possibilite de faire 3 saut en exterieur", "TRIPLESAUT");
	
	private final String nom;
	private final String description;
	private final String key;
	
	
	private Epreuves(String nom, String description, String key) {
		this.nom = nom;
		this.description = description;
		this.key = key;
	}


	public String getNom() {
		return nom;
	}


	public String getDescription() {
		return description;
	}


	public String getKey() {
		return key;
	}
	
	
}

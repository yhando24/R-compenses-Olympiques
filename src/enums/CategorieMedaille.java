package enums;

public enum CategorieMedaille {

	OR("Medaille d'Or", "OR"),
 	ARGENT("Medaille d'Argent", "ARGENT"),
 	BRONZE("Medaille de Bronze", "BRONZE");
	
	private String categorie;
	
	private String name;

	private CategorieMedaille(String categorie, String name) {
		this.categorie = categorie;
		this.name = name;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
}

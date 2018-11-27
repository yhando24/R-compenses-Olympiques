package enums;

public enum CategorieMedaille {

	OR("Médaille d'Or"),
 	ARGENT("Médaille d'Argent"),
 	BRONZE("Médaille de Bronze");
	
	private String categories;

	private CategorieMedaille(String categories) {
		this.categories = categories;
	}

	public String getCategories() {
		return categories;
	}

	public void setCategories(String categories) {
		this.categories = categories;
	}
	
	
	
}

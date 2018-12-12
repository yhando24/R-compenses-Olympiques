package bean;
import enums.CategorieMedaille;
import enums.Epreuves;

public class Medaille {
	 
	
	
	private CategorieMedaille categorieMedaille;
	private Epreuves epreuve;
	



	


	public Medaille(CategorieMedaille categorieMedaille, Epreuves epreuve) {
		this.categorieMedaille = categorieMedaille;
		this.epreuve = epreuve;
	}




	public CategorieMedaille getCategorieMedaille() {
		return categorieMedaille;
	}



	public void setCategorieMedaille(CategorieMedaille categorieMedaille) {
		this.categorieMedaille = categorieMedaille;
	}



	public Epreuves getEpreuve() {
		return epreuve;
	}



	public void setEpreuve(Epreuves epreuve) {
		this.epreuve = epreuve;
	}
	
	
	
}

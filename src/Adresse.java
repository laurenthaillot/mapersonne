
public class Adresse {
	
	public int numeroDeRue;
	public String NomRue;
	public int CodePostal;
	public String NomVille;
	public String Pays;
	
	
	public int getNumeroDeRue() {
		return numeroDeRue;
	}
	public String getNomRue() {
		return NomRue;
	}
	public int getCodePostal() {
		return CodePostal;
	}
	public String getNomVille() {
		return NomVille;
	}
	public String getPays() {
		return Pays;
	}
	public void setNumeroDeRue(int numeroDeRue) {
		this.numeroDeRue = numeroDeRue;
	}
	public void setNomRue(String nomRue) {
		NomRue = nomRue;
	}
	public void setCodePostal(int codePostal) {
		CodePostal = codePostal;
	}
	public void setNomVille(String nomVille) {
		NomVille = nomVille;
	}
	public void setPays(String pays) {
		Pays = pays;
	}
		
	public Adresse(int numeroDeRue, String nomRue, int codePostal,
			String nomVille, String pays) {
		super();
		this.numeroDeRue = numeroDeRue;
		this.NomRue = nomRue;
		this.CodePostal = codePostal;
		this.NomVille = nomVille;
		this.Pays = pays;
	}
	
		
	@Override
	public String toString() {
		return "Adresse [numeroDeRue=" + numeroDeRue + ", NomRue=" + NomRue
				+ ", CodePostal=" + CodePostal + ", NomVille=" + NomVille
				+ ", Pays=" + Pays + "]";
	}
	public void AffichemonAdresse() {
		System.out.println ("Adresse : "+this.numeroDeRue+" "+this.NomRue+" "+this.CodePostal+" "+this.NomVille+" "+this.Pays);
	}
	
	 
	

}

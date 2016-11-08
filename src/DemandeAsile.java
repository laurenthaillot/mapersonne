
public class DemandeAsile extends Personne {

	public String dateexpirationasile;
	public boolean regularise;
	
	
	public String getDateexpirationasile() {
		return dateexpirationasile;
	}
	public boolean isRegularise() {
		return regularise;
	}
	public void setDateexpirationasile(String dateexpirationasile) {
		this.dateexpirationasile = dateexpirationasile;
	}
	public void setRegularise(boolean regularise) {
		this.regularise = regularise;
	}
		
	public DemandeAsile(String prenom, String adresse, Boolean feminin,
			String nom, int age, Adresse adressepersonne,
			String dateexpirationasile, boolean regularise) {
		
		super(prenom, adresse, feminin, nom, age, adressepersonne);
		
		this.dateexpirationasile = "aujourd'hui";
		this.regularise = false;
	}
	
	public void demandeAsile(Adresse adresserefugie) {
		System.out.println("Je demande l'asile pour l'adresse "+ adresserefugie);
	}
	@Override
	public String toString() {
		return "DemandeAsile [dateexpirationasile=" + dateexpirationasile
				+ ", regularise=" + regularise + ", prenom=" + prenom
				 + ", feminin=" + feminin +
				 " , adressepersonne=" + adressepersonne + "]";
	}
		
}



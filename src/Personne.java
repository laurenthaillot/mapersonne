
public class Personne {
	
	public String prenom;
	public String adresse;
	public Boolean feminin;
	
	private String nom;
	private int age;
	public Adresse adressepersonne;

	
	public Adresse getAdressepersonne() {
		return adressepersonne ;
	}
	public void setAdressepersonne(Adresse Adressepersonne) {
		this.adressepersonne = Adressepersonne;
	}
	
	public String getPrenom() {
		return prenom;
	}

	public String getNom() {
		return nom;
	}
			
	public String getAdresse() {
		return adresse;
	}

	public Boolean getfeminin() {
		return feminin;
	}

	public int getAge() {
		return age;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}	

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public void setfeminin(Boolean feminin) {
		this.feminin = feminin;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public Personne(String prenom, String adresse, Boolean feminin, String nom,
			int age, Adresse adressepersonne) {
		super();
		this.prenom = prenom;
		this.adresse = adresse;
		this.feminin = feminin;
		this.nom = nom;
		this.age = age;
		this.adressepersonne = adressepersonne;
	}

	
	/*public Personne(){
		
	};
		*/
	
	
	@Override
	public String toString() {
		return "Personne [prenom=" + prenom + ", adresse=" + adresse
				+ ", feminin=" + feminin + ", nom=" + nom + ", age=" + age
				+ ", Adressepersonne=" + adressepersonne + "]";
	}
	
	 public void declineTonIdentite() {
		System.out.println ("Je suis " + this.prenom + " " + this.nom);
	}
	 
	 public void feteTonAnniversaire() {	
		 System.out.println ("aujourd'hui j'ai "+ this.age +" ans");
	 }
	
	 public void habite(){ 
		 System.out.println("J'habite " + adresse);
 	 }
	 	 
	  public void demenage(){ 
	 	 this.adresse = "à montreuil 2 semaines par mois";
		 System.out.println("A ce jour j'habite " + adresse);
 
	 }
	 	
}


public class EtatCivil {
    
    public static void main(String[] args) {
    	
    	Adresse adresseRefugie = new Adresse(44,"rue toto",44320,"Frossay","france");
    	
    	DemandeAsile Refugie = new DemandeAsile("Toto", "",false,"Bruneau",40, adresseRefugie, "aujourd'hui", false);
    	
        System.out.println(Refugie);
        
        
    	//Adresse Monadresse = new Adresse (22,"rue du chemin",44000,"Nantes","France");	
       // Personne Laurent = new Personne ("Laurent","Frossay",false,"Haillot", 25,Monadresse);
       
       // System.out.println(Laurent);
       
        
        /*
        Laurent.declineTonIdentite();
        
        Laurent.feteTonAnniversaire();
        
        Laurent.habite();
        
        Laurent.demenage();
        
        Monadresse.AffichemonAdresse();
        
        */
 
        
        
     
        
        
        
    }
    
   

    
}
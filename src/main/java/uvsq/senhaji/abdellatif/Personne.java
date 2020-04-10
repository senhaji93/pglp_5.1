package uvsq.senhaji.abdellatif;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * @author senhaji abdellatif
 *
 */
public class Personne implements Composite, Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Personne(int id, String nom, String fonction, LocalDate date_naissance, String prenom,
			ArrayList<Numero_telephone> num_telephone) {
		super();
		this.id = id;
		this.nom = nom;
		this.fonction = fonction;
		this.date_naissance = date_naissance;
		this.prenom = prenom;
		this.num_telephone = num_telephone;
	}

	private final int id;
	
	private final String nom;
	   private final String fonction;
	     private final LocalDate date_naissance;
	private final String prenom;
  
    
     private final ArrayList<Numero_telephone> num_telephone;
     
     public static class Builder {
    	
         private final int id;
       
    	 private final String nom;
    	
         private final String prenom;
       
         private String fonction;
         
         private LocalDate date_naissance;
      
         private ArrayList<Numero_telephone> num_telephone;
      
       
         public Builder fonction(final String fonction) {
        	 this.fonction = fonction;
        	 return this;
         }
      
         public Builder Date_naissance(final LocalDate date_naissance) {
        	 this.date_naissance = date_naissance;
        	 return this;
         }
         
         public Builder(final int i, final String nom, final String prenom,
        		 final String fonction, final LocalDate date_naissance, final Numero_telephone num) {
        	 this.id = i;
        	 this.nom = nom;
        	 this.prenom = prenom;
        	 this.fonction = fonction;
        	 this.date_naissance = date_naissance;
 			 this.num_telephone = new ArrayList<Numero_telephone>();
 			num_telephone.add(num);
         }
      
      
        
       public Personne build() {
    	   return new Personne(this);
       }
       public Builder Num_telephone(final Numero_telephone num_telephone) {
     	  this.num_telephone = new ArrayList<Numero_telephone>();
           this.num_telephone.add(num_telephone);
     	  return this;
      }

	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	public LocalDate getDate_naissance() {
		return date_naissance;
	}

	public void setDate_naissance(LocalDate date_naissance) {
		this.date_naissance = date_naissance;
	}

	public ArrayList<Numero_telephone> getNum_telephone() {
		return num_telephone;
	}

	@Override
	public String toString() {
		return "Builder [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", fonction=" + fonction
				+ ", date_naissance=" + date_naissance + ", num_telephone=" + num_telephone + ", build()=" + build()
				+ ", getFonction()=" + getFonction() + ", getDate_naissance()=" + getDate_naissance()
				+ ", getNum_telephone()=" + getNum_telephone() + ", getId()=" + getId() + ", getNom()=" + getNom()
				+ ", getPrenom()=" + getPrenom() + "]";
	}

	public void setNum_telephone(ArrayList<Numero_telephone> num_telephone) {
		this.num_telephone = num_telephone;
	}

	public int getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}
     }
     
     private Personne(final Builder builder) {
 		this.id = builder.id;
		nom = builder.nom;
 		prenom = builder.prenom;
 		fonction = builder.fonction;
 		num_telephone = builder.num_telephone;
 		date_naissance = builder.date_naissance;
 	}
    
     public int getId() {
         return id;
     }
   
     public String getNom() {
 		return nom;
 	}
   
 	public String getPrenom() {
 		return prenom;
 	}
 
 	public String getFonction() {
 		return fonction;
 	}
 	
 	public LocalDate getDate_naissance() {
 		return date_naissance;
 	}
 	
 public ArrayList<Numero_telephone> getNumero_telephone() {
 		return num_telephone;
 	}
 	
 	public void print() {
		System.out.println(this.nom + " " + this.prenom + ": fonction: "
		+ this.fonction + "date de naissance: "
		+ this.date_naissance + ""
	    + "nemero telephone"
		+ this.num_telephone);
	}
}

package uvsq.senhaji.abdellatif;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author senhaji abdellatif
 *
 */
public class Groupe implements Composite, Serializable {



   
	private static final long serialVersionUID = 1L;

	public Groupe(int id, ArrayList<Composite> personnes, String nom) {
		super();
		this.id = id;
		this.personnes = personnes;
		this.nom = nom;
	}

	public ArrayList<Composite> getPersonnes() {
		return personnes;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	public void setPersonnes(ArrayList<Composite> personnes) {
		this.personnes = personnes;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	private final int id;
  
	private ArrayList<Composite> personnes = new ArrayList<Composite>();
	
	private String nom;

    public Groupe(final int i, final String nom) {
        this.id = i;
		this.nom = nom;
    }
  
	public void add(final Composite c) {
		personnes.add(c);
	}
	
	public void print() {
		for (Composite composant: personnes) {
			composant.print();
		}
	}
	
	public void remove(final Composite composant) {
		personnes.remove(composant);
	}
    
    public int getId() {
        return id;
    }
   
	 public String getNom() {
	        return this.nom;
	    }
	  
	    public int size() {
	        return personnes.size();
	    }
	   
	    public String toString() {
	       return "Groupe" + this.nom + "(" + this.personnes.size() + ")";
	    }
	  
	 public void hierarchique() {
	        Iterator<Composite> iterator = personnes.iterator();
	        System.out.println(this.getNom() + ":    ");
	        while (iterator.hasNext()) {
	            Composite comp = iterator.next();
	            comp.print();
	        }
	 }
}

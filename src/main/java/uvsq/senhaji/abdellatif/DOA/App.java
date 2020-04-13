package uvsq.senhaji.abdellatif;

import java.io.IOException;
import java.time.LocalDate;
import  uvsq.senhaji.abdellatif.Personne.Builder;
import uvsq.senhaji.abdellatif.DOA.DAO;
import uvsq.senhaji.abdellatif.DOA.DAOFactory;

public enum App {
	
   APPLICATION;

	public void run(final String[] args) {
		}


    public static void main(final String[] args) throws IOException {
    	
    	DAO<Personne> DAOPersonne = DAOFactory.getPersonne1DAO();
    	
    	Groupe G = new Groupe(1, "info");
    	Groupe G2 = new Groupe(2, "math");
    	Personne p1 = new Builder(1,
    			"name",
    		    "n",
    			"job1",
    			LocalDate.parse("1980-5-25"),
    			new Numero_telephone(1, Type_tel.fix_perso, "0101234506"))
    			.build();
       	Personne p2 = new Builder(1,
       			"name2",
       			"i",
       			"job2",
       			LocalDate.parse("1977-07-017"),
       			new Numero_telephone(1, Type_tel.fix_perso, "0671234556"))
    			.build();
       	Personne p3 = new Builder(1,
       			"name3",
       			"No",
       			"job3",
       			LocalDate.parse("1969-12-16"),
       			new Numero_telephone(1, Type_tel.fix_perso, "0612345565"))
    			.build();
       	Personne p4 = new Builder(1,
       			"name4",
       			"kf",
       			"job4",
       			LocalDate.parse("1981-06-19"),
       			new Numero_telephone(1, Type_tel.fix_perso, "0751234567"))
    			.build();
       	
       	
       	Personne p5 = null;
    	G.add(p1);
    	G.add(p2);
    	System.out.println(G.size());
    	p5 = DAOPersonne.create(p2);
    	System.out.println("personne 5: " + p5.getNom());
    	System.out.println("personne 2 :" + p2.getNom());
    	System.out.println("personne 4 :" + p4.getId());
    	System.out.println("personne 3 :" + p3.getId());
    	System.out.println("sizeof G2 est : " + G2.size());
    	}

}
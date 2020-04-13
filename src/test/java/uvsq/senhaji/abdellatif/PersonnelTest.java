package uvsq.senhaji.abdellatif;







import static org.junit.Assert.*;

import java.io.IOException;
import java.time.LocalDate;


import org.junit.Test;

import uvsq.senhaji.abdellatif.DOA.DAO;
import uvsq.senhaji.abdellatif.DOA.DAOFactory;
import uvsq.senhaji.abdellatif.Personne.Builder;

public class PersonnelTest {


	  @Test
	    public void getnomTest() {
	    	Personne pers = new Builder(2,
	       			"name",
	       			"pre", 
	       			"j", 
	       			LocalDate.parse("1993-2-26"),
	       			new Numero_telephone( 3, Type_tel.fix_perso, "0101234506"))
	    			.build();
	        assertEquals("name", pers.getNom());
	    }

	   
	  
	  
	  @Test
	    public void getPrenomTest() {
		  Personne pers = new Builder(2,
	       			"name",
	       			"pre", 
	       			"j", 
	       			LocalDate.parse("1993-2-26"),
	       			new Numero_telephone( 3, Type_tel.fix_perso, "0101234506"))
	    			.build();
	        assertEquals("pre", pers.getPrenom());
	     
	    }
	  @Test
	    public void getFonctionTest() {
		  Personne pers = new Builder(2,
	       			"name",
	       			"pre", 
	       			"j", 
	       			LocalDate.parse("1993-2-26"),
	       			new Numero_telephone( 3, Type_tel.fix_perso, "0101234506"))
	    			.build();
	     
	        assertEquals("j", pers.getFonction());

	    
	       
	    }
	 
		



}

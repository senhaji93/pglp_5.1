package uvsq.senhaji.abdellatif;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.IOException;


import org.junit.Before;
import org.junit.Test;


import uvsq.senhaji.abdellatif.DOA.DAO;
import uvsq.senhaji.abdellatif.DOA.DAOFactory;

public class GroupeTest {

	
	private Personne P1,P2,P3,P4;
	private Groupe G,G2;

		@Before
		public void chargement_group() throws Exception {
	    	 G=new Groupe(1,"A");
	    	 G2=new Groupe(2,"B");
	    	DAO<Personne>personneDao=DAOFactory.getPersonne1DAO ( ) ;
			 P1= personneDao.create (P2);
		}

		@Test
		public void Sizetest() {
			G.add(P1);
			G.add(P2);
			G.add(P4);
			assertTrue(3==G.size());			
		}
	

	
	    @Test
	    public void ajoutTest() {
	   	 Groupe g1 = new Groupe(1, "C");
			g1.add(P2);
		    g1.add(P3);
		    assertEquals(g1.size(), 2);
	    }
	    
	
	
		@Test
		public void testDOACreate() throws IOException  {
			 Groupe g1 = new Groupe(1, "C");
		    DAO<Groupe>groupeDao=DAOFactory.getGroupe ( ) ;
			G= groupeDao.create (g1);
			assertTrue(g1.getNom()==G.getNom());
			
		
		}

		
}

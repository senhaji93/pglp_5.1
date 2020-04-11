package uvsq.senhaji.abdellatif.DOA;

import java.io.IOException;
import uvsq.senhaji.abdellatif.Groupe;
import uvsq.senhaji.abdellatif.Numero_telephone;


public class DAOFactory {
	

	public static DAO<Numero_telephone> getNumero_telephoneDAO()
			throws IOException {
		return new Numero_telephoneDAO(20);
		}
	
	public static Personne1DAO getPersonne1DAO() throws IOException {
			return  new Personne1DAO(20);
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

	public static DAO<Groupe> getGroupe() throws IOException {
		        return new GroupeDAO(20);
 }
}

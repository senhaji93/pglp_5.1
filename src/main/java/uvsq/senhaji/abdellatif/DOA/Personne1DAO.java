package uvsq.senhaji.abdellatif.DOA;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;


import uvsq.senhaji.abdellatif.Personne;

public class Personne1DAO extends DAO<Personne> implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Personne1DAO(final int id) throws IOException {
		super(id);
	}

	
 
	public Personne create(final Personne obj) throws IOException {
		objetout.writeObject(obj);
	return obj;
	}
	   
	
	public void delete(final Personne obj) {
		fichier.delete();
	}
 
	public Personne update(final Personne obj) throws IOException {
		fichier.delete();
		this.create(obj);
		return obj;
	}
	public Personne find(final String id) throws IOException, ClassNotFoundException {
		File s = new File(id + ".txt");
        Object deserializer = null;
        if (s.exists()) {
            byte[] content = Files.readAllBytes(s.toPath());
            deserializer = deserialize(content);
        }
        Personne personne = (Personne) deserializer;
        System.out.println(personne.toString());
        return personne;
	}



	
}

package uvsq.senhaji.abdellatif.DOA;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import uvsq.senhaji.abdellatif.Groupe;

public class GroupeDAO extends DAO<Groupe> {
	
	public GroupeDAO(final int id) throws IOException {
		super(id);
		}
	
	
	public Groupe create(final Groupe obj) throws IOException {
		objetout.writeObject(obj);
		return obj;
	}
	  
	public Groupe find(final String id)
			throws IOException, ClassNotFoundException {
		File s = new File(id + ".txt");
        Object deseri = null;
        if (s.exists()) {
            byte[] content = Files.readAllBytes(s.toPath());
            deseri = deserialize(content);
        }
        Groupe groupe = (Groupe) deseri;
        System.out.println(groupe.toString());
        return groupe;
	}

   
	public Groupe update(final Groupe obj) throws IOException {
		fichier.delete();
		this.create(obj);
		return obj;
	}

   
	public void delete(final Groupe obj) {
		fichier.delete();
	}

}

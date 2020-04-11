package uvsq.senhaji.abdellatif.DOA;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import uvsq.senhaji.abdellatif.Numero_telephone;

public class Numero_telephoneDAO extends DAO<Numero_telephone> {

	public Numero_telephoneDAO(final int id) throws IOException {
		super(id);
	}

	public Numero_telephone create(final Numero_telephone obj)
			throws IOException {
		objetout.writeObject(obj);
		return obj;
	}
	
	public Numero_telephone find(final String id)
			throws IOException, ClassNotFoundException {
		File fichier = new File(id + ".txt");
        Object deserializer = null;
        if (fichier.exists()) {
            byte[] content = Files.readAllBytes(fichier.toPath());
            deserializer = deserialize(content);
        }
        Numero_telephone numero_tel = (Numero_telephone) deserializer;
        System.out.println(numero_tel.toString());
        return numero_tel;
	}

	public Numero_telephone update(final Numero_telephone obj)
			throws IOException {
		fichier.delete();
		this.create(obj);
		return obj;
	}
	
	public void delete(final Numero_telephone obj) {
		fichier.delete();
	}

}

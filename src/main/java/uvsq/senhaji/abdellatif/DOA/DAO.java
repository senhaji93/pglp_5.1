
package uvsq.senhaji.abdellatif.DOA;

import java.io.*;
import java.io.IOException;



public abstract class DAO<T> {

	protected File fichier;

    protected FileOutputStream fichout;
    
    protected ObjectOutputStream objetout;
 
    public DAO(int id) throws IOException {
    	fichier = new File(id + ".txt");
    	fichout = new FileOutputStream(fichier);
    	objetout = new ObjectOutputStream(fichout);
    }
  
	public abstract T create(T obj) throws IOException;

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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public abstract T find(String id) throws IOException, ClassNotFoundException;
	
	public abstract T update(T obj) throws IOException;

	public abstract void delete(T obj);
	
    public Object deserialize(final byte[] bytes)
    		throws ClassNotFoundException, IOException {
	        ByteArrayInputStream arr = new ByteArrayInputStream(bytes);
	        ObjectInputStream ob = new ObjectInputStream(arr);
	        return ob.readObject();
	    }
   
    public byte[] serialize(final Object obj) throws IOException {
	        ByteArrayOutputStream tab = new ByteArrayOutputStream();
	        ObjectOutputStream ob = new ObjectOutputStream(tab);
	        ob.writeObject(obj);
	        return tab.toByteArray();
	    }


}

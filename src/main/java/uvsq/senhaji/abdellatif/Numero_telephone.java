package uvsq.senhaji.abdellatif;


import java.io.Serializable;

/**
 * @author senhaji abdellatif
 *
 */
public class Numero_telephone implements Serializable {
 	
	
	private static final long serialVersionUID = 1L;

	private final int id;
	
	private Type_tel type;
	
	private String numero;
	
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

	public void setType(Type_tel type) {
		this.type = type;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Numero_telephone(final int i, final Type_tel type, final String numero) {
		this.id = i;
		this.type = type;
		this.numero = numero;
	}
	 
    public int getId() {
        return id;
    }
    
	public Type_tel getType() {
		return type;
	}
	
	public String getNumero() {
		return numero;
	}
 
    public String toString() {
        return " le numero de (" + this.type + ") est :" + this.numero;
    }
}

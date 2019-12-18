package is.segrepass.entity;

// devo decidere se farla o meno


public class Docente {
	protected String nome;
	protected String cognome;
	
	public Docente(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}
	
	
	@Override
	public String toString() {
		StringBuffer buf = new StringBuffer(); 
			buf.append("Nome: "+nome+ " Cognome: "+ cognome);
		return buf.toString();
	}

}

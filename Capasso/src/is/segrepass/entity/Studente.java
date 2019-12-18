package is.segrepass.entity;


public class Studente {
	protected String nome;
	protected String cognome;
	
	public Studente(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}
	
	
	
	@Override
	public String toString() {
		StringBuffer buf = new StringBuffer(); 
		buf.append("Nome :" +nome + " Cognome : "+ cognome+"\n");
		return buf.toString();
			}
	
}

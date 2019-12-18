package is.segrepass.entity;

import java.util.ArrayList;

public class Corso {
	protected String nome;
	protected int cfu;
//	protected ArrayList<Appello> lista_appelli = new ArrayList<Appello>();
	// DEVO SOSTITUIRE CON TIPO DOCENTE.
	protected Docente docente;

	
	// CAMBIARE STRING IN DOCENTE NEL MODELLO COMPLETO
	public Corso(String nome, int cfu, Docente docente) {
		this.nome = nome;
		this.cfu = cfu;
		this.docente = docente;
	}
	
	
	@Override
	public String toString() {
		StringBuffer buf = new StringBuffer();
		buf.append("Corso: " +nome+" ,con il docente: "+docente+", ncfu "+ 6+ "\n");
		return buf.toString();
	}
	
	/*public void aggiungiAppello(Appello appello) {
	lista_appelli.add(appello);
	//System.out.print(lista_appelli);
	} */
	
	}

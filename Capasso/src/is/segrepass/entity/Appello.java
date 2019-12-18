package is.segrepass.entity;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;


public class Appello {
	protected Corso corso;
	protected ArrayList<DataEsame> lista_date = new ArrayList<DataEsame>();
	protected ArrayList<Studente> lista_studenti = new ArrayList<Studente>();
	
	
	public Appello(Corso corso, DataEsame data) {
		this.corso = corso;
		lista_date.add(data);
		
	}
	public Corso getCorso() {
		return this.corso;
	}
	
	//Creo una nuova data d'esame e faccio la verifica sulla tipologia per evitare che la stessa tipologia si ripeta piu volte;
	public void creaDataEsame(String luogo,TipoProva tipo, LocalDate date) {
		Boolean giaPresente = false;
		DataEsame data1 =new DataEsame(luogo, tipo, date);
			for( DataEsame data2 : lista_date) {
					if( data2.tipologia == data1.tipologia) {
						System.out.print("Non Puoi Aggiungere questa data perchè gia svolgi questa tipologia d' esame in un altra data");
						giaPresente = true;
					}
			}
			if (giaPresente == false) {
				lista_date.add(data1);
			}
				
			//	lista_date.add(data1);
				//	System.out.print(this.lista_date);
	}
	
	public void prenotaStudente(Studente s) {
		lista_studenti.add(s);
	}
	public ArrayList<Studente> listaPrenotati() {
		return lista_studenti;
	}
	@Override
	public String toString() {
		StringBuffer buf = new StringBuffer();
		buf.append("Appello appartenente al  " +corso+","+ " e si svolgerà nelle date:\n"+ lista_date +"\n");
		return buf.toString();
	}
}

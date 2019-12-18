package is.segrepass.control;

import java.time.LocalDate;
import java.util.ArrayList;

import is.segrepass.entity.Appello;
import is.segrepass.entity.Corso;
import is.segrepass.entity.DataEsame;
import is.segrepass.entity.Studente;
import is.segrepass.entity.TipoProva;

public class appelliControl {
	protected ArrayList<Appello> lista_appelli;
	
	
	public appelliControl() {
		lista_appelli = new ArrayList<Appello>();
		
		
	}
	
	
	public Appello creaAppello(Corso c, DataEsame data ) {
		if (c != null && data != null) {
		Appello appello = new Appello(c, data);
		lista_appelli.add(appello);
		return appello;
		}else {
			System.out.println("Controlla i parametri in ingresso");
			return null;
		}
	}

	
	public void prenotaAppello(Studente s, Appello appello){
		if (appello != null && s != null) {
		for( Appello appello1 : lista_appelli) { 
			if( appello1 == appello) {
				appello1.prenotaStudente(s);
				break;
			}
		}
		} else {
			System.out.println("Controlla i parametri in ingresso");
		}
	}
	
	//Creo una nuova data d'esame e faccio la verifica sulla tipologia per evitare che la stessa tipologia si ripeta piu volte;
	public void creaDataEsame(Appello appello, String luogo,TipoProva tipo, LocalDate date) {
		if (appello != null && luogo != null && tipo != null && date != null) {
		for( Appello appello1 : lista_appelli) { 
			if( appello1 == appello) {
				appello1.creaDataEsame(luogo, tipo, date);
				break;
			}
		}
		}else {
			System.out.println("Controlla i parametri in ingresso");
		}
	}
	
	
	public void stampaAppelli(Corso s) {
		if (s != null) {
		for (Appello a :lista_appelli) {
			if (a.getCorso() == s ) {
			System.out.print(	a.toString());
			}
		}
		}else { System.out.print("se non mi dai in ingresso un corso non posso svolgere il mio compito");

		}
	}
	
	
	public ArrayList<Studente> listaStudentiPrenotati(Appello appello) {
		if (appello != null) {
	return appello.listaPrenotati();
		}
		else {
			System.out.print("se non mi dai in ingresso un appello non posso svolgere il mio compito");
		
			return null;
		}
	}
	
		
	}
	
	
	
	
	
	
		
	


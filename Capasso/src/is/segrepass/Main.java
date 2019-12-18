package is.segrepass;

import java.time.LocalDate;
import java.time.Month;

import is.segrepass.control.*;
import is.segrepass.entity.Appello;
import is.segrepass.entity.Corso;
import is.segrepass.entity.DataEsame;
import is.segrepass.entity.Docente;
import is.segrepass.entity.Studente;
import is.segrepass.entity.TipoProva;


public class Main {

	
	
	
	public static void main(String[] args) {
		
		
		corsoControl corsiControl = new corsoControl();
		appelliControl appelliControl = new appelliControl();
		
		//Creo gli studenti
		Studente mario = new Studente("PIPPO", "PIPPOZZO");
		Studente mario2 = new Studente("A", "B");
		Studente mario3 = new Studente("C","D");
		
		//Creo il docente
		Docente pippo = new Docente("PIPPO", "Lanzafame");
		
		//Creo data esame
		LocalDate data_esame = LocalDate.of(2019, Month.DECEMBER, 20);
		DataEsame data1 = new DataEsame("aula 1", TipoProva.ORALE, data_esame);
		
		//Creo corsi
		Corso LMM = corsiControl.creaCorso("LMM", 6, pippo);
		Corso IS = corsiControl.creaCorso("IS", 5, pippo);
		
		//Creo aappelli
		Appello iappello = appelliControl.creaAppello(IS, data1);
		Appello pappello = appelliControl.creaAppello(LMM, data1);
		Appello sappello = appelliControl.creaAppello(LMM, data1);
		
		//Creo date esame
		data_esame = LocalDate.of(2019, Month.DECEMBER, 21);
		pappello.creaDataEsame("NAPOLI", TipoProva.CALCOLATORE, data_esame );
		data_esame = LocalDate.of(2019, Month.DECEMBER, 22);
		sappello.creaDataEsame("MILANO", TipoProva.SCRITTA,  data_esame);
		
		// prenoto l' appello
		appelliControl.prenotaAppello(mario, pappello);
		appelliControl.prenotaAppello(mario2, pappello);
		appelliControl.prenotaAppello(mario3, sappello);
		System.out.print(pappello);
		//stampo gli studenti prenotati
	System.out.print(	appelliControl.listaStudentiPrenotati(sappello));
	//	appelliControl.stampaAppelli(IS);
		//System.out.print(appello + "\n");*/
		
	}

}

package is.segrepass.control;

import java.util.ArrayList;

import is.segrepass.entity.*;
//Questa classe control al momento è inutile siccome crea solo il corso , ma a progetto finito sarà utile per gestire i corsi (modificarli ed eliminarli).
public class corsoControl {
	
	protected ArrayList<Corso> lista_corsi;
	
	
	
	public corsoControl() {
		lista_corsi = new ArrayList<Corso>();
	}
	
	
	
	
	
	public Corso creaCorso(String nome, int cfu, Docente docente) {
		if (nome != null  && docente != null) {
		Corso corso = new Corso(nome, cfu, docente);
		lista_corsi.add(corso);
		return corso;
		} else {
			System.out.println("Controlla i parametri in ingresso");
			return null;
			
		}
	}
}

package is.segrepass.entity;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import is.segrepass.control.*;


public class AppelloTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {


	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		Docente natella = new Docente("Roberto", "Natella");
		Corso corso = new Corso("IS", 9, natella);
		LocalDate data_esame = LocalDate.of(2019, Month.DECEMBER, 20);
		DataEsame data1 = new DataEsame("aula 1", TipoProva.ORALE, data_esame);
		Appello pappello = new Appello(corso, data1 );
		appelliControl control = new appelliControl();
		control.listaStudentiPrenotati(pappello);
		assertEquals(0, control.listaStudentiPrenotati(pappello).size());
		
	}
	@Test
	public void test2() {
		Docente natella = new Docente("Roberto", "Natella");
		Corso corso = new Corso("IS", 9, natella);
		LocalDate data_esame = LocalDate.of(2019, Month.DECEMBER, 20);
		DataEsame data1 = new DataEsame("aula 1", TipoProva.ORALE, data_esame);
		
		appelliControl control = new appelliControl();
		Appello pappello = control.creaAppello(corso, data1);
		Studente mario = new Studente("PIPPO", "PIPPOZZO");
		control.prenotaAppello(mario, pappello);
		control.listaStudentiPrenotati(pappello);
		assertEquals(1, control.listaStudentiPrenotati(pappello).size());
		
	}
	@Test
	public void test3() {
		Docente natella = new Docente("Roberto", "Natella");
		Corso corso = new Corso("IS", 9, natella);
		LocalDate data_esame = LocalDate.of(2019, Month.DECEMBER, 20);
		DataEsame data1 = new DataEsame("aula 1", TipoProva.ORALE, data_esame);
		appelliControl control = new appelliControl();
		Appello pappello = control.creaAppello(corso, data1);
		Studente mario = new Studente("PIPPO", "PIPPOZZO");
		Studente giacomo = new Studente("Giacomo", "PIPPO");
		control.prenotaAppello(mario, pappello);
		control.prenotaAppello(giacomo, pappello);
		control.listaStudentiPrenotati(pappello);
		assertEquals(2, control.listaStudentiPrenotati(pappello).size());
		
	}
	@Test
	public void test4() {
		Docente natella = new Docente("Roberto", "Natella");
		Corso corso = new Corso("IS", 9, natella);
		LocalDate data_esame = LocalDate.of(2019, Month.DECEMBER, 20);
		DataEsame data1 = new DataEsame("aula 1", TipoProva.ORALE, data_esame);
		appelliControl control = new appelliControl();
		Appello pappello = control.creaAppello(corso, data1);
		Studente mario = new Studente("PIPPO", "PIPPOZZO");
		Studente giacomo = new Studente("Giacomo", "PIPPO");
		control.prenotaAppello(mario, pappello);
		control.prenotaAppello(giacomo, pappello);
		control.listaStudentiPrenotati(pappello);
		assertEquals(null, control.listaStudentiPrenotati(null));
		
	}
	
	

}

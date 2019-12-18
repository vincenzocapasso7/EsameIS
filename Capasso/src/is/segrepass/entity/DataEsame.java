package is.segrepass.entity;

import java.time.LocalDate;

public class DataEsame {
	protected String luogo;
	protected TipoProva tipologia;
	protected LocalDate data;
	//protected Appello appello;
	/*public DataEsame(String luogo, String tipologia, int i, Appello appello) {
		this.appello = appello;
		this.luogo = luogo;
		this.tipologia = tipologia;
		this.data = i;
}*/
	
	
	
	public DataEsame(String luogo, TipoProva prova, LocalDate date) {
		this.luogo = luogo;
		this.tipologia = prova;
		this.data = date;
}
	
	
	
	public String toString() {
		StringBuffer buf = new StringBuffer(); 
		buf.append("L' esame si terrà in data: " +data+", in aula "+ luogo +" e sarà una prova : "+ tipologia+"\n");
		return buf.toString();
	}
}
package dirosa.clemente.videoteca.base;

import java.util.Date;

public class Film {
	private int nGiorni;
	private String titolo;
	private String regista;
	private Date data;
	private Attore attori[];
	
	
	public int costo(){
		return 0;
	}
	
	
	public int getnGiorni() {
		return nGiorni;
	}
	public void setnGiorni(int nGiorni) {
		this.nGiorni = nGiorni;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getRegista() {
		return regista;
	}
	public void setRegista(String regista) {
		this.regista = regista;
	}
	public Date getData() {
		return data;
	}
	public void setData() {
		this.data = new Date();
	}
	public Attore[] getAttori() {
		return attori;
	}
	public void setAttori(Attore[] attori) {
		this.attori = attori;
	}
	
	
}

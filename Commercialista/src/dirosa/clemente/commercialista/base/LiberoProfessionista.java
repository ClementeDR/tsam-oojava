package dirosa.clemente.commercialista.base;

public class LiberoProfessionista extends Cliente{
	
	private String pIva;
	private int fatture;
	
	//per i liberi professionisti c'è una quota fissa di 50 euro
	// a cui si deve aggiungere 50 centesimi a fattura;
	

	public int calcoloParcella(){
		return Math.round(50 + fatture * 0.5f);
	}
	
	public String getpIva() {
		return pIva;
	}



	public void setpIva(String pIva) {
		this.pIva = pIva;
	}



	public int getFatture() {
		return fatture;
	}



	public void setFatture(int fatture) {
		this.fatture = fatture;
	}



}

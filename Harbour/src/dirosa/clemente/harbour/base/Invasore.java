package dirosa.clemente.harbour.base;

public abstract class Invasore {
	//Tutte le categorie di invasori sono caratterizzati da un codice identificativo,
	//da un modello e	da un indice P indicante la potenza di fuoco.
	
	private String id;
	private String modello;
	private int p;
	
	public Invasore() {
		
	}
	
	public Invasore(String i, String mod, int p){
		this.id = i;
		this.modello = mod;
		this.p = p;
	}
	
	public abstract int danno();
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public int getP() {
		return p;
	}
	public void setP(int potenzaFuoco) {
		this.p = potenzaFuoco;
	}
	

	
}

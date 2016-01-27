package dirosa.clemente.harbour.base;

public class PortoNavale {
	/*Il porto navale è caratterizzato da un nome, 
	 * dal numero di imbarcazioni presenti 
	 * e dalla	dimensione in metri quadri
	 */
	
	private String nome;
	private int nImbarcazioni;
	private int dimensione;
	
	public PortoNavale(){
		
	}
	
	public PortoNavale(String n, int im, int d){
		this.nome = n;
		this.nImbarcazioni = im;
		this.dimensione = d;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getnImbarcazioni() {
		return nImbarcazioni;
	}
	public void setnImbarcazioni(int nImbarcazioni) {
		this.nImbarcazioni = nImbarcazioni;
	}
	public int getDimensione() {
		return dimensione;
	}
	public void setDimensione(int dimensione) {
		this.dimensione = dimensione;
	}
	
	
}

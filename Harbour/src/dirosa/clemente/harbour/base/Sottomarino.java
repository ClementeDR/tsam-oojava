package dirosa.clemente.harbour.base;

public class Sottomarino extends Invasore {
	/*
	 * Sottomarino: 
	 * la potenza di fuoco è data dal prodotto tra il numero di armamenti
		presenti nel sottomarino e la stazza espressa in tonnellate.
	 */
	
	private int stazza;
	private int nArmamenti;
	
	public Sottomarino(){
		
	}
	
	public Sottomarino(int s, int arma){
		this.stazza = s;
		this.nArmamenti = arma;
	}
	
	public int danno(){
		return Math.round((this.nArmamenti * this.stazza) * 1.5f);
	}
	
	
	public int getnArmamenti() {
		return nArmamenti;
	}
	public void setnArmamenti(int nArmamenti) {
		this.nArmamenti = nArmamenti;
	}
	public int getStazza() {
		return stazza;
	}
	public void setStazza(int stazza) {
		this.stazza = stazza;
	}
	
	
	
	
}


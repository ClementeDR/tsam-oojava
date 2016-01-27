package dirosa.clemente.harbour.base;

public class Aereo extends Invasore{
	/* Aereo: la potenza di fuoco è data dalla somma del numero di armamenti di tipo Alpha
	e dal numero di armamenti di tipo Beta. Un armamento di tipo Alpha ha una potenza
	di fuoco pari a 10 unità, mentre un armamento di tipo Beta ha una potenza di fuoco
	pari a 25 unità.
	*/
	private int nAlpha;
	private int nBeta;
	
	public Aereo(){
		
	}
	
	
	public Aereo(int alpha, int beta){
		this.nAlpha = alpha * 10;
		this.nBeta = beta * 25;
	}
	
	public int danno(){
		return Math.round((nAlpha + nBeta) * 1.5f);
	}
	
	public int getnAlpha() {
		return nAlpha;
	}
	public void setnAlpha(int nAlpha) {
		this.nAlpha = nAlpha * 10;
	}
	public int getnBeta() {
		return nBeta;
	}
	public void setnBeta(int nBeta) {
		this.nBeta = nBeta * 25;
	}
	
	
	
	
	
}

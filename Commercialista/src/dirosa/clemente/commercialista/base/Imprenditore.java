package dirosa.clemente.commercialista.base;

public class Imprenditore extends Cliente {
	// per gli imprenditori è di 500 euro se vengono registrate meno di 100 fatture.
	// Ogni fattura dalla 101 esima in poi viene calcolata a 1 euro a fattura.


	private Societa soci;
	
	public int calcoloParcella(){
		if(soci.getFatture() <= 100)
			return Math.round(500f);
			else{
				return Math.round(500 + soci.getFatture() - 100);
			}
	}

	public Societa getSoci() {
		return soci;
	}

	public void setSoci(Societa soci) {
		this.soci = soci;
	}
	
}

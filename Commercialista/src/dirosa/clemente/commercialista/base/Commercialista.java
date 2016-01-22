package dirosa.clemente.commercialista.base;

public class Commercialista {
	private Cliente clienti[];
	
	
	public int incasso(){
		int tot = 0;
		for(Cliente c: clienti){
			tot += c.calcoloParcella();
		}
		
		return Math.round(tot);
	}


	public Cliente[] getClienti() {
		return clienti;
	}


	public void setClienti(Cliente[] clienti) {
		this.clienti = clienti;
	}

	
}

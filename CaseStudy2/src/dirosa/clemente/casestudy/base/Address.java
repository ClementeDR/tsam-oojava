package dirosa.clemente.casestudy.base;

public class Address {
	private String via;

	private String nomeVia;
	private String nCivico;
	private String citt = "Milano";
	private String interno;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	
	
	Address(String via, String nomeVia, String nCivico, String interno){
		
		this.via = via;
		this.nomeVia = nomeVia;
		this.nCivico = nCivico;
		this.interno = interno;
	}
	
	
	public String getAll(){
		return this.via + " " + this.nomeVia + " " + this.nCivico + " " + this.citt;
	}
	
	@Override
	public boolean equals(Object o) {	
		if (!(o instanceof Address))
			return false;
		
		Address a = (Address)o;
		
		
					
		return (this.via + this.nomeVia + this.nCivico + this.interno).equals(a.via + a.nomeVia + a.nCivico + a.interno);
	}
	
	// necessario per hash set
	@Override
	public int hashCode() {
		
		return (via + nomeVia + nCivico).hashCode();
	}
	
	
	
	public String getCitt() {
		return citt;
	}


	public String getVia() {
		return via;
	}
	public void setVia(String via) {
		this.via = via;
	}



	public String getNomeVia() {
		return nomeVia;
	}


	public void setNomeVia(String nomeVia) {
		this.nomeVia = nomeVia;
	}


	public String getnCivico() {
		return nCivico;
	}


	public void setnCivico(String nCivico) {
		this.nCivico = nCivico;
	}


	public String getInterno() {
		return interno;
	}


	public void setInterno(String interno) {
		this.interno = interno;
	}


	
	
}

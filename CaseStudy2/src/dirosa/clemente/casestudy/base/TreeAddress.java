package dirosa.clemente.casestudy.base;

public class TreeAddress implements Comparable<TreeAddress>  {
	private String via;

	private String nomeVia;
	private String nCivico;
	private String citt = "Milano";
	private String interno;
	
	public TreeAddress() {
		// TODO Auto-generated constructor stub
	}
	
	
	public TreeAddress(String via, String nomeVia, String nCivico, String interno){
		
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
		if (!(o instanceof TreeAddress))
			return false;
		
		TreeAddress p = (TreeAddress)o;
		
		if (this.getAll() == null)
			return p.getAll() == null;
					
		return getAll().equals(p.getAll());
	}
	
	// necessario per hash set
	
	
	/*
	@Override
	public int compareTo(TreeAddress a) {
		// restituire valore negativo se this < p
		// = 0 se this equals p
		// valore positivo se this > p
		return -1;
		//return (via + nomeVia + nCivico).compareTo(a.getVia() + a.getNomeVia() + a.getnCivico());
	}*/
	

	public int compareTo(TreeAddress o) {
		// TODO Auto-generated method stub
		return (via + nomeVia + nCivico).compareTo(o.getVia() + o.getNomeVia() + o.getnCivico());
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

package main;

/**
 * Classe rappresentante un Cliente.
 * L'univocità di un dipendente è data dal suo CF.
 *
 */
public abstract class Cliente implements Comparable<Cliente> {
	
	private String cf;
	private int parcellaBase;
	private int proveIns;
	
	
	public int getProveIns() {
		return proveIns;
	}




	public void setProveIns(int proveIns) {
		this.proveIns = proveIns;
	}




	public boolean equals(Object o) {	
		if (!(o instanceof Cliente))
			return false;
		
		Cliente p = (Cliente)o;
		
		if (this.getCF() == null)
			return p.getCF() == null;
					
		return getCF().equals(p.getCF());
	}
	

	

	public int compareTo(Cliente o) {
		// TODO Auto-generated method stub
		return (getCF()).compareTo(o.getCF());
	}
	
	public abstract double calcolaParcella();

	/**
	 * Il codice fiscale identifica univocamente un Cliente
	 * @return CF
	 */
	public String getCF() {
		return cf;
	}

	/**
	 * Il codice fiscale identifica univocamente un Cliente
	 * @param cf codice fiscale
	 */
	public void setCF(String cf) {
		this.cf = cf;
	}

	public int getParcellaBase() {
		return parcellaBase;
	}

	public void setParcellaBase(int parcellaBase) {
		this.parcellaBase = parcellaBase;
	}
	
}

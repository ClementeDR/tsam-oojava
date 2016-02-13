package dirosa.clemente.casestudy.base;

import java.util.List;

public class IndirizzoAttivita {
	private Address indirizzo;
	private List<Integer> lista;
	
	public IndirizzoAttivita() {
		// TODO Auto-generated constructor stub
	}
	
	
	public IndirizzoAttivita(Address indirizzo, List<Integer> lista){
		this.indirizzo = indirizzo;
		this.lista = lista;
	
	}

	
	@Override
	public boolean equals(Object o) {	
		if (!(o instanceof TreeAddress))
			return false;
		
		IndirizzoAttivita p = (IndirizzoAttivita)o;
		
		if (this.indirizzo == null)
			return p.getIndirizzo() == null;
					
		return indirizzo.equals(p.getIndirizzo());
	}
	
	@Override
	public int hashCode() {
		
		return indirizzo.hashCode();
	}
	

	public Address getIndirizzo() {
		return indirizzo;
	}


	public void setIndirizzo(Address indirizzo) {
		this.indirizzo = indirizzo;
	}


	public List<Integer> getLista() {
		return lista;
	}


	public void setLista(List<Integer> lista) {
		this.lista = lista;
	}
	
	
	
}

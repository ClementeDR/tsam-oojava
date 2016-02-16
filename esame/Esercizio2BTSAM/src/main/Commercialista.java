package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;



/**
 * Gestisce le parcelle dei propri Clienti.
 *
 */
public class Commercialista {
	
	private Map<Cliente, List<Integer>> clienti = new TreeMap<Cliente,List<Integer>>();
	private int numero;
	
	/**
	 * Calcola il totale delle parcelle di tutti i clienti univoci (ovvero NON
	 * vengono considerati le parcelle di eventuali clienti duplicati). 
	 * @return il totale delle parcelle
	 */
	public int totaleParcelle() {
		double totale = 0;
		for(Cliente cliente : clienti.keySet()){
			totale += cliente.calcolaParcella();
		}
		return  (int)Math.round(totale);
				// TODO: da implementare
	}
	
	/**
	 * Inserisce un nuovo cliente, verificando che
	 * non sia già stato inserito.
	 * @param d dipendente
	 */
	public void addCliente(Cliente d) {
		// TODO: da implementare
		

		List<Integer> t = new ArrayList<Integer>();
		
			if(clienti.containsKey(d)){
				t = clienti.get(d);
				t.add(t.size() + 1);
				d.setProveIns(d.getProveIns() + 1);
				clienti.put(d, t);	
				this.numero++;
			}else{
				
				t.add(1);
				d.setProveIns(d.getProveIns() + 1);
				clienti.put(d, t);
			}

	}


	
	/**
	 * Restituisce il numero di volte che all'atto dell'inserimento di
	 * un cliente, il cliente era già stato inserito. 
	 * @return
	 */
	public int clientiDuplicati() {
		// TODO: da implementare
		return this.numero;
	}
	
	/**
	 * Dato un cliente, restituisce il numero di volte che lo stesso
	 * cliente è stato inserito tramite le funzione addCliente.
	 * Nel caso che un dato cliente sia stato inserito una sola volta,
	 * restituisce il valore 1. 
	 * @param d cliente da verificare
	 * @return numero di ripetizioni.
	 */
	public int numeroRipetizioni(Cliente d) {
		// TODO: da implementare
		
		
		List<Integer> t = new ArrayList<>();
		t = clienti.get(d);
		int max = 0;
		for(Integer integer : t){
			if(max < integer)
				max = integer;
		}
		
		return max;
	}

}

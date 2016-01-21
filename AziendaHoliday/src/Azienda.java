
public class Azienda {
	/*Un’azienda è caratterizzata dalla ragione sociale e contiene l’elenco dei dipendenti. Si vuole
	mettere a disposizione due funzionalità, una per il calcolo della somma degli stipendi da
	erogare e una per avere l’elenco dei dipendenti con lo stipendio massimo.*/
	
	String ragioneSociale;
	Dipendente[] dipendenti;
	
	Azienda(String ragioneSoc, Dipendente[] dip){
		ragioneSociale = ragioneSoc;
		dipendenti = dip;
	}
	
	public void sumStipendi(){
		int sum = 0;
		for (int i = 0; i < dipendenti.length; i++) {
			int a = dipendenti[i].contratto.contratt;
			
			sum += a;
		}
		
		System.out.println("Tot contratti = " + sum / 100);
	}
	
	private static String[] push(String[] array, String push) {
	    String[] longer = new String[array.length + 1];
	    for (int i = 0; i < array.length; i++)
	        longer[i] = array[i];
	    longer[array.length] = push;
	    return longer;
	}
	
	public String[] maxStipendio(){
		int max = 0;
		for(int i = 0; i < dipendenti.length; i++){
			if(max < dipendenti[i].contratto.contratt){
				max = dipendenti[i].contratto.contratt;
			}
			
		}
		
		String[] elenco = new String[0];
		for(Dipendente x: dipendenti){
			
			if(x.contratto.contratt == max){
				
				elenco = push(elenco , x.nome + " " + x.cognome);
			}
					
		}
		return elenco;
	}
}

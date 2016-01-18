
public class Azienda {
	/*Un’azienda è caratterizzata dalla ragione sociale e contiene l’elenco dei dipendenti. Si vuole
	mettere a disposizione due funzionalità, una per il calcolo della somma degli stipendi da
	erogare e una per avere l’elenco dei dipendenti con lo stipendio massimo.*/
	
	private String ragioneSociale;
	private String pIva;
	private Dipendente[] dipendenti;
	Azienda(){
		
	}
	Azienda(String ragioneSoc,String piva, Dipendente[] dip){
		ragioneSociale = ragioneSoc;
		dipendenti = dip;
		pIva = piva;
	}
	

	
	public void sumStipendi(){
		int sum = 0;
		for (int i = 0; i < dipendenti.length; i++) {
			int a = dipendenti[i].getContratto().getContratt();
			
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
			if(max < dipendenti[i].getContratto().getContratt()){
				max = dipendenti[i].getContratto().getContratt();
			}
			
		}
		
		String[] elenco = new String[0];
		for(Dipendente x: dipendenti){
			
			if(x.getContratto().getContratt() == max){
				
				elenco = push(elenco , x.getNome() + " " + x.getCognome());
			}
					
		}
		return elenco;
	}
	
	public String getRagioneSociale(){
		return ragioneSociale;
	}
	public void setRagioneSociale(String rg){
		this.ragioneSociale = rg;
	}
	
	public String getpIva() {
		return pIva;
	}
	public void setpIva(String pIva) {
		this.pIva = pIva;
	}
	public void setDipendenti(Dipendente[] dip){
		this.dipendenti = dip;
	}
	
	public Dipendente[] getDipendenti(){
		return dipendenti;
	}
}

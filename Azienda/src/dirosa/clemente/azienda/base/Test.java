package dirosa.clemente.azienda.base;

public class Test {

	public static void main(String[] args) {
		
		Azienda microsoft = new Azienda();
		microsoft.setPiva("0000000001");
		microsoft.setRagioneSociale("Microsoft snc");
		
		ContrattoLavoro contratto = new ContrattoLavoro();
		contratto.setTipo("Apprendista");
		contratto.setPagaBase(600 * 100);
		
		Dipendente bill = new Dipendente();
		bill.setCognome("Gates");
		bill.setNome("Bill");
		bill.setContratto(contratto);
		
		
		Dipendente steve = new Dipendente();
		steve.setCognome("Gates");
		steve.setNome("Bill");
		steve.setContratto(contratto);
		
		Dipendente[] dips = new Dipendente[]{
			bill, 
			steve
		
		};
		
		microsoft.setDipendenti(dips);
		System.out.println(bill.stipendio());
		System.out.println("Totale: " + microsoft.stipendi()/ 100);
	}

}


public class Test {

	public static void main(String[] args) {
		Contratto contratto1 = new Contratto();
		Contratto contratto2 = new Contratto();
		contratto1.setContratt(100000);
		contratto1.setTipoContratto("part time");
		contratto2.setContratt(500000);
		contratto2.setTipoContratto("full time");
		Dipendente clemy = new Dipendente();
		clemy.setNome("Clemente");
		clemy.setCognome("Di Rosa");
		clemy.setContratto(contratto2);
	
		
		Dipendente cle = new Dipendente();
		cle.setNome("Cleme");
		cle.setCognome("Di Rosa");
		cle.setContratto(contratto1);
	
		Dipendente cle2 = new Dipendente();
		cle2.setNome("Clemente");
		cle2.setCognome("Di Ros");
		cle2.setContratto(contratto2);
	
		Dipendente[] dipe = new Dipendente[] {clemy, cle, cle2};
		System.out.println("----------------------------------------------------------------");
		Azienda ciao = new Azienda();
		ciao.setRagioneSociale("Azienda spa");
		ciao.setpIva("2165138645");
		ciao.setDipendenti(dipe);
		ciao.sumStipendi();
		String[] a = ciao.maxStipendio();
		for(String x: a){
			System.out.println(x);
		}
		System.out.println("----------------------------------------------------------------");
	}

}

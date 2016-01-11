
public class Main {

	public static void main(String[] args) {
		Contratto contratto1 = new Contratto(100000, "pt");
		Contratto contratto2 = new Contratto(500000, "pt");
		
		Dipendente clemy = new Dipendente("clemy", "clemy", 1 , contratto1);
		Dipendente cle = new Dipendente("cle", "cle", 1 , contratto2);
		Dipendente cle2 = new Dipendente("clem", "dr", 10 , contratto2);
	
		Dipendente[] dipe = new Dipendente[] {clemy, cle, cle2};
		System.out.println("----------------------------------------------------------------");
		Azienda ciao = new Azienda("ciao", dipe);
		ciao.sumStipendi();
		String[] a = ciao.maxStipendio();
		for(String x: a){
			System.out.println(x);
		}
		System.out.println("----------------------------------------------------------------");

	}

}

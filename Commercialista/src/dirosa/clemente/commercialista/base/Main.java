package dirosa.clemente.commercialista.base;

public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args){
		Societa soci = new Societa();
		
		soci.setpIva("as514552856");
		soci.setFatture(5500);
		
		Imprenditore im1 = new Imprenditore();
		im1.setNome("Clemente");
		im1.setCognome("Di Rosa");
		im1.setCf("Drkjcbsekgbrd34");
		im1.setSoci(soci);
		//System.out.println(im1.calcoloParcella());
		
		Dipendente dip1 = new Dipendente();
		dip1.setCognome("Matteo");
		dip1.setCognome("Steve");
		dip1.setCf("hjjvfewjvh");
		//System.out.println(dip1.calcoloParcella());
		
		LiberoProfessionista lb = new LiberoProfessionista();
		lb.setFatture(100);
		lb.setpIva("ashgbjadf");
		//System.out.println(lb.calcoloParcella());
		
		
		Commercialista clem = new Commercialista();
		
		Cliente[] clienti = new Cliente[]{
			lb,
			dip1,
			im1
		};
		
		
		clem.setClienti(clienti);
		
		System.out.println(clem.incasso());
		
		
		
	}
}

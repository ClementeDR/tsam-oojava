package dirosa.clemente.commercialista.test.base;

import static org.junit.Assert.*;

import org.junit.Test;

import dirosa.clemente.commercialista.base.Cliente;
import dirosa.clemente.commercialista.base.Commercialista;
import dirosa.clemente.commercialista.base.Dipendente;
import dirosa.clemente.commercialista.base.Imprenditore;
import dirosa.clemente.commercialista.base.LiberoProfessionista;
import dirosa.clemente.commercialista.base.Societa;

public class CommercialistaTest {

	@Test
	public void testIncasso() {
Societa soci = new Societa();
		
		soci.setpIva("as514552856");
		soci.setFatture(5500);
		
		Imprenditore im1 = new Imprenditore();
		im1.setNome("Clemente");
		im1.setCognome("Di Rosa");
		im1.setCf("Drkjcbsekgbrd34");
		im1.setSoci(soci);
		
		Dipendente dip1 = new Dipendente();
		dip1.setCognome("Matteo");
		dip1.setCognome("Steve");
		dip1.setCf("hjjvfewjvh");
		
		LiberoProfessionista lb = new LiberoProfessionista();
		lb.setFatture(100);
		lb.setpIva("ashgbjadf");
		
		
		Commercialista clem = new Commercialista();
		
		Cliente[] clienti = new Cliente[]{
			lb,
			dip1,
			im1
		};
		
		clem.setClienti(clienti);
		
		assertEquals(6050, clem.incasso());
		
	}
	

}

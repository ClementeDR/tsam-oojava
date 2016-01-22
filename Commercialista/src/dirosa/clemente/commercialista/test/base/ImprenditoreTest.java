package dirosa.clemente.commercialista.test.base;

import static org.junit.Assert.*;

import org.junit.Test;

import dirosa.clemente.commercialista.base.Imprenditore;
import dirosa.clemente.commercialista.base.Societa;

public class ImprenditoreTest {

	@Test
	public void testCalcoloParcella() {
Societa soci = new Societa();
		
		soci.setpIva("as514552856");
		soci.setFatture(5500);
		
		Imprenditore im1 = new Imprenditore();
		im1.setNome("Clemente");
		im1.setCognome("Di Rosa");
		im1.setCf("Drkjcbsekgbrd34");
		im1.setSoci(soci);
		
		assertEquals(5900, im1.calcoloParcella());
		
	}

}

package dirosa.clemente.commercialista.test.base;

import static org.junit.Assert.*;

import org.junit.Test;

import dirosa.clemente.commercialista.base.Dipendente;

public class DipendenteTest {

	@Test
	public void testCalcoloParcella() {
		Dipendente dip1 = new Dipendente();
		dip1.setCognome("Matteo");
		dip1.setCognome("Steve");
		dip1.setCf("hjjvfewjvh");
		
		assertEquals(50, dip1.calcoloParcella());
		
		
	}

}

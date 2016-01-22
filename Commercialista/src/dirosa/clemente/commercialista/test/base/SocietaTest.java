package dirosa.clemente.commercialista.test.base;

import static org.junit.Assert.*;

import org.junit.Test;

import dirosa.clemente.commercialista.base.Societa;

public class SocietaTest {

	@Test
	public void testGetFatture() {
		Societa soci = new Societa();
		soci.setFatture(500);
	
		assertEquals(500, soci.getFatture());
	}

	@Test
	public void testGetRagioneSociale() {
		Societa soci = new Societa();
		soci.setRagioneSociale("abc");
		
		assertEquals("abc", soci.getRagioneSociale());
	}

	@Test
	public void testGetpIva() {
		Societa soci = new Societa();
		soci.setpIva("1234");
		
		assertEquals("1234", soci.getpIva());
	}

}

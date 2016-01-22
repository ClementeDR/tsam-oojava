package dirosa.clemente.commercialista.test.base;

import static org.junit.Assert.*;

import org.junit.Test;

import dirosa.clemente.commercialista.base.Cliente;

public class ClienteTest {

	@Test
	public void testCalcoloParcella() {
		Cliente c = new Cliente();
		assertEquals(0,  c.calcoloParcella());
		
		
	}

	@Test
	public void testGetNome() {
		Cliente c = new Cliente();
		c.setNome("Clemente");
		
		assertEquals("Clemente", c.getNome());
	}

	@Test
	public void testGetCognome() {
		Cliente c = new Cliente();
		c.setCognome("Di Rosa");
		
		assertEquals("Di Rosa", c.getCognome());
	}

	@Test
	public void testGetCf() {
		Cliente c = new Cliente();
		c.setCf("aahdhfou3");
		
		assertEquals("aahdhfou3", c.getCf());
	}

}

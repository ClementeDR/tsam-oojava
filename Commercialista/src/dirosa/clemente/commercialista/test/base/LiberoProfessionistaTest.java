package dirosa.clemente.commercialista.test.base;

import static org.junit.Assert.*;

import org.junit.Test;

import dirosa.clemente.commercialista.base.LiberoProfessionista;

public class LiberoProfessionistaTest {

	@Test
	public void testCalcoloParcella() {
		LiberoProfessionista lb = new LiberoProfessionista();
		
		assertEquals(50, lb.calcoloParcella());
	}

	@Test
	public void testGetpIva() {
		LiberoProfessionista lb = new LiberoProfessionista();
		
		lb.setpIva("12345");
		
		assertEquals("12345", lb.getpIva());
	}

	@Test
	public void testGetFatture() {
		LiberoProfessionista lb = new LiberoProfessionista();
		
		lb.setFatture(100);
		
		assertEquals(100, lb.getFatture());
	}

}

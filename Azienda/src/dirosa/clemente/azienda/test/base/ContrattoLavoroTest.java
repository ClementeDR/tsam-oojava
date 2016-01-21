package dirosa.clemente.azienda.test.base;

import static org.junit.Assert.*;

import org.junit.Test;

import dirosa.clemente.azienda.base.ContrattoLavoro;

public class ContrattoLavoroTest {

	@Test
	public void testGetPagaBase() {
		ContrattoLavoro contratto = new ContrattoLavoro();
		contratto.setTipo("Apprendista");
		contratto.setPagaBase(600 * 100);
		assertEquals(600 * 100, contratto.getPagaBase());
	}
	
	@Test
	public void testGetTipo(){
		ContrattoLavoro contratto = new ContrattoLavoro();
		contratto.setTipo("Apprendista");
		contratto.setPagaBase(600 * 100);
		
		assertEquals("Apprendista", contratto.getTipo());
	}

}

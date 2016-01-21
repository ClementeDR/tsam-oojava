package dirosa.clemente.azienda.test.base;

import static org.junit.Assert.*;

import org.junit.Test;

import dirosa.clemente.azienda.base.ContrattoLavoro;
import dirosa.clemente.azienda.base.Dipendente;

public class DipendenteTest {

	@Test
	public void testGetNome(){
		ContrattoLavoro contratto = new ContrattoLavoro();
		contratto.setTipo("Apprendista");
		contratto.setPagaBase(600 * 100);
		
		Dipendente bill = new Dipendente();
		bill.setCognome("Gates");
		bill.setNome("Bill");
		bill.setContratto(contratto);
		
		assertEquals("Bill", bill.getNome());
	}
	
	@Test
	public void testGetCognome(){
		ContrattoLavoro contratto = new ContrattoLavoro();
		contratto.setTipo("Apprendista");
		contratto.setPagaBase(600 * 100);
		
		Dipendente bill = new Dipendente();
		bill.setCognome("Gates");
		bill.setNome("Bill");
		bill.setContratto(contratto);
	
		assertEquals("Gates", bill.getCognome());
	}
	
	@Test
	public void testStipendio(){
		ContrattoLavoro contratto = new ContrattoLavoro();
		contratto.setTipo("Apprendista");
		contratto.setPagaBase(600 * 100);
		
		Dipendente bill = new Dipendente();
		bill.setCognome("Gates");
		bill.setNome("Bill");
		bill.setContratto(contratto);
		
		assertEquals(600 * 100, bill.stipendio());
	}
	
	
	
	
}

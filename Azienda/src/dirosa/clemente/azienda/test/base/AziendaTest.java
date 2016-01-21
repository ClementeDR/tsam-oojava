package dirosa.clemente.azienda.test.base;

import static org.junit.Assert.*;

import org.junit.Test;

import dirosa.clemente.azienda.base.Azienda;
import dirosa.clemente.azienda.base.ContrattoLavoro;
import dirosa.clemente.azienda.base.Dipendente;

public class AziendaTest {

	@Test
	public void testStipendi() {
		Azienda microsoft = new Azienda();
		microsoft.setPiva("0000000001");
		microsoft.setRagioneSociale("Microsoft snc");
		
		ContrattoLavoro contratto = new ContrattoLavoro();
		contratto.setTipo("Apprendista");
		contratto.setPagaBase(600 * 100);
		
		Dipendente bill = new Dipendente();
		bill.setCognome("Gates");
		bill.setNome("Bill");
		bill.setContratto(contratto);
		
		
		Dipendente steve = new Dipendente();
		steve.setCognome("Gates");
		steve.setNome("Bill");
		steve.setContratto(contratto);
		
		Dipendente[] dips = new Dipendente[]{
			bill, 
			steve
		
		};
		
		microsoft.setDipendenti(dips);
		int stipendi =  microsoft.stipendi();
	
		assertEquals(120000, stipendi);
		
	}
	
	@Test
	public void testGetPiva(){
		Azienda microsoft = new Azienda();
		microsoft.setPiva("0000000001");
		microsoft.setRagioneSociale("Microsoft snc");
		
		assertEquals("0000000001", microsoft.getPiva());
	}
	
	@Test
	public void testGetRagioneSociale(){
		Azienda microsoft = new Azienda();
		microsoft.setPiva("0000000001");
		microsoft.setRagioneSociale("Microsoft snc");
		
		assertEquals("Microsoft snc", microsoft.getRagioneSociale());
	}

}

package dirosa.clemente.alieni.test.base;

import static org.junit.Assert.*;

import org.junit.Test;

import dirosa.clemente.alieni.base.Giocatore;

public class GiocatoreTest {

	@Test
	public void testGetSalute() {
		Giocatore player = new Giocatore();
		player.setNome("Clemente");
		player.setSalute(1000000);
		
		assertEquals(1000000, player.getSalute());
	}
	
	@Test
	public void testGetNome(){
		Giocatore player = new Giocatore();
		player.setNome("Clemente");
		player.setSalute(1000000);
		
		assertEquals("Clemente", player.getNome());
	}

}

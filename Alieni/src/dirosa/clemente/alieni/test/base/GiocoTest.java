package dirosa.clemente.alieni.test.base;

import static org.junit.Assert.*;

import org.junit.Test;

import dirosa.clemente.alieni.base.Alieno;
import dirosa.clemente.alieni.base.Giocatore;
import dirosa.clemente.alieni.base.Gioco;

public class GiocoTest {

	@Test
	public void testIsLive() {

		Giocatore player = new Giocatore();
		player.setNome("Clemente");
		player.setSalute(1000000);
		
		Gioco game = new Gioco();
		game.setPlayer(player);
		
		Alieno a1 = new Alieno();
		a1.setId("1");
		a1.setDamage(1000);
		
		Alieno a2 = new Alieno();
		a2.setId("2");
		a2.setDamage(52000);
		
		Alieno a3 = new Alieno();
		a3.setId("3");
		a3.setDamage(50000);
		
		Alieno a4 = new Alieno();
		a4.setId("4");
		a4.setDamage(30000);
		
		Alieno[] alieni = {a1, a2, a3, a4};
		game.damage(alieni);
	
		assertEquals(true, game.isLive());
		
	}
	
	
	@Test
	public void testPlayer(){

		Giocatore player = new Giocatore();
		player.setNome("Clemente");
		player.setSalute(1000000);
		
		Gioco game = new Gioco();
		game.setPlayer(player);
		
		assertEquals(player, game.getPlayer());
		
	}

}

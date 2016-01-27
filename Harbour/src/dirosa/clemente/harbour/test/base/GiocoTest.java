package dirosa.clemente.harbour.test.base;

import static org.junit.Assert.*;

import org.junit.Test;

import dirosa.clemente.harbour.base.Aereo;
import dirosa.clemente.harbour.base.Gioco;
import dirosa.clemente.harbour.base.Invasore;
import dirosa.clemente.harbour.base.PortoNavale;
import dirosa.clemente.harbour.base.Sottomarino;

public class GiocoTest {

	@Test
	public void testDamage() {
		PortoNavale porto = new PortoNavale();
		porto.setNome("Porto Navale");
		porto.setDimensione(100);
		

		Aereo a = new Aereo(10 , 10);
		Aereo b = new Aereo(15, 5);
		
		Sottomarino s1 = new Sottomarino(10 , 10);
		Sottomarino s2 = new Sottomarino(5 , 15);
	
	
		Invasore incursori[] = new Invasore[]{
				a,
				b,
				s1,
				s2
		};
			
		
		Gioco game = new Gioco();
		game.setPorto(porto);
		game.setInvasori(incursori);
		
		assertEquals( 1 , game.damage());
		
	}

	@Test
	public void testLive() {
		PortoNavale porto = new PortoNavale();
		porto.setNome("Porto Navale");
		porto.setDimensione(10000);
		
		Gioco game = new Gioco();
		game.setPorto(porto);
		
		assertEquals(true , game.live());
	}
	

	
}

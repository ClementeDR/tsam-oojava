package dirosa.clemente.videoteca.test.base;

import static org.junit.Assert.*;

import org.junit.Test;

import dirosa.clemente.videoteca.base.BluRay;

public class BluRayTest {

	@Test
	public void testCosto() {
		BluRay film = new BluRay();
		
		
		film.setnGiorni(5);
		//intero
		assertEquals(193, film.costo());
		// valore preciso
		//assertEquals("19.3", film.costo() / 10 + "." + film.costo() % 10);
	}

}

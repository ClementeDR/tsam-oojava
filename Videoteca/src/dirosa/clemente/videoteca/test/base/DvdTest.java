package dirosa.clemente.videoteca.test.base;

import static org.junit.Assert.*;

import org.junit.Test;

import dirosa.clemente.videoteca.base.Dvd;

public class DvdTest {

	@Test
	public void testCosto() {
		Dvd c1 = new Dvd();
		c1.setnGiorni(3);
		
		assertEquals(50,c1.costo());
	}

}

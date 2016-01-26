package dirosa.clemente.videoteca.test.base;

import static org.junit.Assert.*;

import org.junit.Test;

import dirosa.clemente.videoteca.base.Cassetta;

public class CassettaTest {

	@Test
	public void testCosto() {
		Cassetta ca = new Cassetta();
		ca.setnGiorni(2);
		
		assertEquals(3, ca.costo() / 10);
	}

}

package dirosa.clemente.harbour.test.base;

import static org.junit.Assert.*;

import org.junit.Test;

import dirosa.clemente.harbour.base.Aereo;

public class AereoTest {

	@Test
	public void testDanno() {
		Aereo a = new Aereo(10 , 10);
		
		assertEquals(Math.round((10 * 25 + 10 * 10) * 1.5f), a.danno());
		
	}

}

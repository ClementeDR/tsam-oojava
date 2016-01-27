package dirosa.clemente.harbour.test.base;

import static org.junit.Assert.*;

import org.junit.Test;

import dirosa.clemente.harbour.base.Sottomarino;

public class SottomarinoTest {

	@Test
	public void testDanno() {
		Sottomarino s1 = new Sottomarino(10 , 10);
		
		assertEquals(Math.round(10 * 10 * 1.5f)   ,s1.danno());
	}

}

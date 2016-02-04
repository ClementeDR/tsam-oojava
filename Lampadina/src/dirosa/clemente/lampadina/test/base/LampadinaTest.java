package dirosa.clemente.lampadina.test.base;

import static org.junit.Assert.*;

import org.junit.Test;

import dirosa.clemente.lampadina.base.Lampadina;

public class LampadinaTest {

	@Test
	public void testGetDurata() {
		Lampadina lampadina = new Lampadina(50);
		
		
		assertEquals(50, lampadina.getDurata());
		
	}

}

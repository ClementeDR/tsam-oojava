package dirosa.clemente.alieni.test.base;

import static org.junit.Assert.*;

import org.junit.Test;

import dirosa.clemente.alieni.base.Alieno;

public class AlienoTest {

	@Test
	public void testGetId() {
		Alieno a1 = new Alieno();
		a1.setId("1");
		a1.setDamage(1000);
		
		assertEquals("1", a1.getId());
	}

	@Test
	public void testGetDamage(){
		Alieno a1 = new Alieno();
		a1.setId("1");
		a1.setDamage(1000);
		
		assertEquals(1000, a1.getDamage());
	}
}

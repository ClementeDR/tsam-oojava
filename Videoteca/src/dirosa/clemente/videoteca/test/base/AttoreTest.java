package dirosa.clemente.videoteca.test.base;

import static org.junit.Assert.*;

import org.junit.Test;

import dirosa.clemente.videoteca.base.Attore;

public class AttoreTest {

	@Test
	public void testGetNome() {
		Attore tom = new Attore();
		tom.setNome("Tom");
		
		assertEquals("Tom", tom.getNome());
	}

}

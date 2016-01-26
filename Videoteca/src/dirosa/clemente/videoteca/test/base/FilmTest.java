package dirosa.clemente.videoteca.test.base;

import static org.junit.Assert.*;

import org.junit.Test;

import dirosa.clemente.videoteca.base.Film;

public class FilmTest {

	@Test
	public void testCosto() {
		Film film = new Film();
		assertEquals(0, film.costo());
	}

}

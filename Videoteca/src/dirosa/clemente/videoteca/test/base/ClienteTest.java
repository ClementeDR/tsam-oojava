package dirosa.clemente.videoteca.test.base;

import static org.junit.Assert.*;

import org.junit.Test;

import dirosa.clemente.videoteca.base.BluRay;
import dirosa.clemente.videoteca.base.Cassetta;
import dirosa.clemente.videoteca.base.Cliente;
import dirosa.clemente.videoteca.base.Dvd;
import dirosa.clemente.videoteca.base.Film;

public class ClienteTest {



	@Test
	public void testCosto() {
		BluRay film = new BluRay();
		film.setData();
		
		film.setnGiorni(5);
		
		
		Cassetta ca = new Cassetta();
		ca.setnGiorni(2);
		
		
		BluRay f2 = new BluRay();
		f2.setnGiorni(1);
	
		
		BluRay f3 = new BluRay();
		f3.setnGiorni(2);

		
		Dvd c1 = new Dvd();
		c1.setnGiorni(3);
		
	
		
		Cliente c = new Cliente();
		Film films[] = new Film[]{
				f2,
				f3,
				film,
				c1, 
				ca
		};
		c.setFilms(films);
		
		//ritorno la stringa del valore
		assertEquals("30.4", c.costo());
	}

}

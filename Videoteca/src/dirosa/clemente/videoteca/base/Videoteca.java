package dirosa.clemente.videoteca.base;

public class Videoteca {
	
	public static void main(String[] args){
		
		
		
		
		Attore tom = new Attore();
		tom.setNome("Tom");
		
		Attore jesse = new Attore();
		jesse.setNome("Jesse");
		
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
		System.out.println(c.costo());
		
		
		
	}
}

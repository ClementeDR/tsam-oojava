package dirosa.clemente.harbour.base;

public class Harbour {
	public static void main(String[] args){
		PortoNavale porto = new PortoNavale();
		porto.setNome("Porto Navale");
		porto.setDimensione(10000);
		
		Aereo a = new Aereo(10 , 10);
		Aereo b = new Aereo(15, 5);
		
		Sottomarino s1 = new Sottomarino(10 , 10);
		Sottomarino s2 = new Sottomarino(5 , 15);
	
	
		Invasore incursori[] = new Invasore[]{
				a,
				b,
				s1,
				s2
		};
			
		
		Gioco game = new Gioco();
		game.setPorto(porto);
		game.setInvasori(incursori);
		
		
		
		System.out.println("Numero di attacchi :" + game.damage());
		
		
	}
}

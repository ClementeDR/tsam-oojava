
public class Main {

	public static void main(String[] args) {
		// GIOCO ALIENI
		
				Gioco game = new Gioco();
				Giocatore player = new Giocatore("Clemente", 100000);
				game.player = player;
				Alieno a1 = new Alieno("1", 1000);
				Alieno a2 = new Alieno("2", 52000);
				Alieno a3 = new Alieno("3", 50000);
				Alieno a4 = new Alieno("4", 30000);
				Alieno[] alieni = {a1, a2, a3, a4};
				game.damage(alieni);
				
				if(game.isLive())
					System.out.println("Vivo");
				else
					System.out.println("Morto");
				
				
				System.out.println("----------------------------------------------------------------");

	}

}


public class Gioco {
	Giocatore player;
	
	
	
	void damage(Alieno[] alieni){
		for(int i = 0; player.salute > 0 && i < alieni.length ; i++){
			player.salute -= alieni[i].damage;
			if(player.salute < 0){
				player.salute = 0;
			}
		}
	}
	
	boolean isLive(){
		return player.salute != 0;
	}
	
}

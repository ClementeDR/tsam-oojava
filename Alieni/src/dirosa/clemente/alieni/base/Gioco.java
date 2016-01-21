package dirosa.clemente.alieni.base;

public class Gioco  {
	private Giocatore player;
	
	
	
	public Giocatore getPlayer() {
		return player;
	}

	public void setPlayer(Giocatore player) {
		this.player = player;
	}

	public void damage(Alieno[] alieni){
		for(int i = 0; player.getSalute() > 0 && i < alieni.length ; i++){
			player.setSalute(player.getSalute() - alieni[i].getDamage());
			if(player.getSalute() < 0){
				player.setSalute(0);
			}
		}
	}
	
	public boolean isLive(){
		return player.getSalute() != 0;
	}
	
}

package dirosa.clemente.harbour.base;

public class Gioco {
	PortoNavale porto;
	Invasore invasori[];
	
	public Gioco() {
		
	}
	
	public Gioco(PortoNavale porto, Invasore invasori[]){
		this.porto = porto;
		this.invasori = invasori;
	}
	
	public int damage(){
		int attacchi = 0;
		while(this.live()){
			for(Invasore i : invasori){
				if(this.live()){
					porto.setDimensione(porto.getDimensione() - i.danno());
					attacchi++;
					if(porto.getDimensione() < 0){
						
						porto.setDimensione(0);
					}
				}
			}
		}
		return attacchi;
	}
	public boolean live(){
		
		return this.porto.getDimensione() != 0;
	}
	
	public PortoNavale getPorto() {
		return porto;
	}
	public void setPorto(PortoNavale porto) {
		this.porto = porto;
	}
	public Invasore[] getInvasori() {
		return invasori;
	}
	public void setInvasori(Invasore[] invasori) {
		this.invasori = invasori;
	}
	
	
}

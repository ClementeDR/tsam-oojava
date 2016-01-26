package dirosa.clemente.videoteca.base;

public class Dvd extends Film {
	
	public int costo(){
		//dvd: 1.50 euro al giorno per i primi 2 giorni, poi dal terzo giorno 2 euro;
		
		if(super.getnGiorni() <= 2)
			return (super.getnGiorni() * 15);
		else
			return Math.round(super.getnGiorni() * 20 - 10);
		
	}

}

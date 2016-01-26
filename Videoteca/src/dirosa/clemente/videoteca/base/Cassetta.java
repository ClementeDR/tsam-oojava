package dirosa.clemente.videoteca.base;

public class Cassetta extends Film{
	
	
	
	public int costo(){
		return Math.round(super.getnGiorni() * 20 - 10);
	}
}

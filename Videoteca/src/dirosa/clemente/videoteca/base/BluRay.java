package dirosa.clemente.videoteca.base;

public class BluRay extends Film {


	public int costo(){
		// blu-ray: 1 euro il primo giorno,
		// poi c’è una penale del 10% in più per ogni giorno successivo.
		// In questo caso la penale si somma al costo del noleggio del giorno precedente, 
		// ovvero: CostoNoleggiot+1 = CostoNoleggiot + CostoNoleggiot * Penale
		// con t indicante il periodo in giorni.
		if(super.getnGiorni() == 1)
			return 10;
		else{
			int tot = 10;
			int giorni = super.getnGiorni() - 1;
			while(giorni != 0){
				Math.round(tot += (tot * 11 / 10));
				giorni--;
			}
			
			return tot;
		}
	}
}

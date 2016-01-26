package dirosa.clemente.videoteca.base;

public class Cliente {
	private Film films[];

	public Film[] getFilms() {
		return films;
	}

	public void setFilms(Film[] films) {
		this.films = films;
	}
	
	public String costo(){
		int tot = 0;
		for(Film f: films){
			tot += f.costo();
		}
		// ritorno la stringa del valore
		return (tot / 10 + "." + tot % 10);
	}
	
}

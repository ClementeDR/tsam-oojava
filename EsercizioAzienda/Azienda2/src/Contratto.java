
public class Contratto{
	
	
	private int contratt;
	private String tipoContratto;
	Contratto(){
		
	}
	Contratto(int c, String tc){
		contratt = c;
		tipoContratto = tc;
	}
	
	public void setContratt(int contratt) {
		this.contratt = contratt;
	}
	public void setTipoContratto(String tipoContratto) {
		this.tipoContratto = tipoContratto;
	}
	public int getContratt(){
		return contratt;
	}
	public String getTipoContratto(){
		return tipoContratto;
	}
	
}


public class Engine {
	String cilindrata;
	Carburatore carburatore;
	
	String caratteristiche(){
		String caract = "Motore ";
		caract += "Cilindrata: " + cilindrata;
		
		caract += carburatore.caratteristiche();
		return caract;
	}
	
}

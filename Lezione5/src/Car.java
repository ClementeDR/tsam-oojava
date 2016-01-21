
public class Car {
	String model;
	Engine motore;
	Pneumatico[] pneumatici;

	String caratteristiche(){
		String caract = "Modello: " + model + " \n ";
		caract += motore.caratteristiche();  
		
		for(Pneumatico p : pneumatici){
			caract += p.caratteristiche() + "\n";
		}
		return caract;
	}

}

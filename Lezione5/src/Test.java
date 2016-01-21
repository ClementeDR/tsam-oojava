
public class Test {
	public static void main(String[] args){
		Car fiatuno = new Car();
		fiatuno.model = "fiat diesel";
		Carburatore c50 = new Carburatore();
		c50.size = 50;
		Engine v16 = new Engine();
		v16.cilindrata = "2000";
		v16.carburatore = c50;
		fiatuno.motore = v16;
		
		Pneumatico[] pirelli = new Pneumatico[4];
		Pneumatico ansx = new Pneumatico();
		ansx.raggio = 20;
		Pneumatico andx = new Pneumatico();
		ansx.raggio = 20;
		Pneumatico posx = new Pneumatico();
		ansx.raggio = 20;
		Pneumatico podx = new Pneumatico();
		ansx.raggio = 20;
		
		pirelli[0] = ansx;
		pirelli[1] = andx;
		pirelli[2] = posx;
		pirelli[3] = podx;
		
		stampaAuto(fiatuno);
		stampaCaratteristiche(fiatuno);
		
		
	
	}
	static void stampaCaratteristiche(Car c){
		String caract = c.caratteristiche();
		System.out.println(caract);
	}
	
	static void stampaAuto(Car car){
		System.out.println("model " + car.model);
		Engine e = car.motore;
		System.out.println("cilindrata " + e.cilindrata);
	}
}

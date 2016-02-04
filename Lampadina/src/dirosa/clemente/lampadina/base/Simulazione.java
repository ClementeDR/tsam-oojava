package dirosa.clemente.lampadina.base;

public class Simulazione {
	
	public static void control(boolean stato) throws Bruciata{
		if(!stato){
			Bruciata ex = new Bruciata();
			ex.bruciata();
			throw ex;
		}
	}

	public static void main(String[] args) {
		Lampadina lampadina = new Lampadina(50);
		CircuitoElettrico circuitoElettrico = new CircuitoElettrico(lampadina);
		int n = 50;
		try{
			while(n != 0){
				
				circuitoElettrico.SwitchOn();
				if(n - 1 == 0){
					control(circuitoElettrico.stato());
				}
				circuitoElettrico.SwitchOff();
				n--;
			
			}
			if(circuitoElettrico.stato()){
				System.out.println("La lampadina non e' fulminata");
			}
			
		}catch(Bruciata b){
			
		}finally{
			if(circuitoElettrico.stato()){
				circuitoElettrico.SwitchOff();
			}

		}
		

	}
}

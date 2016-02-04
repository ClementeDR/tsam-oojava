package dirosa.clemente.lampadina.base;

public class CircuitoElettrico {
	private Lampadina lampadina;
	
	public CircuitoElettrico(){
		
	}
	
	public CircuitoElettrico(Lampadina lampadina){
		this.lampadina = lampadina;
	}
	
	public boolean stato(){
		return lampadina.getDurata() != 0;
	}
	
	public void SwitchOn(){
		System.out.println("Lampadina accesa");
		lampadina.setDurata(lampadina.getDurata() - 1);
		
	}
	public void SwitchOff(){
		System.out.println("Lampadina spenta");
	}
	
	public Lampadina getLampadina() {
		return lampadina;
	}

	public void setLampadina(Lampadina lampadina) {
		this.lampadina = lampadina;
	}
	
	
	
}

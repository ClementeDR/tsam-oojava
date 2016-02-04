package dirosa.clemente.lampadina.test.base;

import static org.junit.Assert.*;

import org.junit.Test;

import dirosa.clemente.lampadina.base.CircuitoElettrico;
import dirosa.clemente.lampadina.base.Lampadina;

public class CircuitoElettricoTest {

	@Test
	public void testStato() {
		Lampadina lampadina = new Lampadina(50);
		CircuitoElettrico circuitoElettrico = new CircuitoElettrico(lampadina);
		int n = 50;
		while(n != 0){
			
			circuitoElettrico.SwitchOn();
			
			circuitoElettrico.SwitchOff();
			n--;
		
		}
		
		assertEquals(false, circuitoElettrico.stato());
		
		
	}



}

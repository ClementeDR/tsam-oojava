
public class Salute extends Persona {

	
	Salute(int alt, double peso, int et, String activity, char sesso) {
		super(alt, peso, et, activity, sesso);
		
	}

	void BMR(){
		double bmr;
		if(sex == 'f'){
			bmr = 655 + (9.6 * kg) + (1.8 * altezza) - (4.7 * age);
		}else{
			bmr = 655 + (13.8 * kg) + (1.8 * altezza) - (4.7 * age);
		}
		
		switch(typeActivity){
		case "sedentario":
			bmr *= 1.2;
			break;
		case "moderatamente":
			bmr *= 1.3;
			break;
		case "attivo":
			bmr *= 1.4;
			break;
		default :
			bmr *= 1.5;
			break;
		}
		System.out.println("BMR di clemente: " + String.format("%1$,.2f", bmr));
	}
	
	void IMC(){
		double alt = altezza * altezza ;
		double imc = kg / (alt / 10000);
		if(imc < 18.5){
			System.out.println("IMC di clemente: Sottopeso");
		}else if(imc < 25){
			System.out.println("IMC di clemente: Normale");
		}else if(imc < 30){
			System.out.println("IMC di clemente: Sovrappeso");
		}else{
			System.out.println("IMC di clemente: Obeso");
		}
	}
	
	
}

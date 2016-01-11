
public class Main {

	public static void main(String[] args) {
		Salute clem = new Salute(178, 77, 19, "attivo", 'm');
		clem.BMR();
		System.out.println("----------------------------------------------------------------");
		clem.IMC();
		System.out.println("----------------------------------------------------------------");

	}

}

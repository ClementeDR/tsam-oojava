
public class Main {

	public static void main(String[] args) {
		Student luca = new Student();
		luca.name = "Luca";
		luca.surname = "Rossi";
		luca.age = 28;
		luca.marks = new int[] {2,7,6,4};
		System.out.println(luca.marksAverage());

	}

}

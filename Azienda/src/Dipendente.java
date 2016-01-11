//import java.util.Scanner;

public class Dipendente{
	//Ogni dipendente è caratterizzato dal nome, cognome, anzianità e ha associato un contratto
	String nome;
	String cognome;
	int anzianita;
	Contratto contratto;
	
	
	Dipendente(String n, String c, int a,Contratto con ){
		nome = n;
		cognome = c;
		anzianita = a;
		contratto = con;
	}
	
	public int calcoloContratto(){
		 return this.contratto.contratt += ((this.contratto.contratt / 200 ) * this.anzianita);
	}
	/*void addDip(){
		System.out.println("Inserisci il Nome");
		Scanner input1 = new Scanner(System.in);
		nome = input1.nextLine();
		System.out.println("Inserisci il Cognome");
		Scanner input2 = new Scanner(System.in);
		cognome = input2.nextLine();
		System.out.println("Inserisci l'anzianità");
		Scanner input3 = new Scanner(System.in);
		anzianita = Integer.parseInt(input3.nextLine());
		System.out.println("Inserisci il contratto");
		Scanner input4 = new Scanner(System.in);
		contratto = Integer.parseInt(input4.nextLine());
		System.out.println("Inserisci il tipo di contratto");
		Scanner input5 = new Scanner(System.in);
		tipoContratto = input5.nextLine();
	}*/
	
}

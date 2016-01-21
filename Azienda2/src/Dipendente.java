//import java.util.Scanner;

public class Dipendente{
	//Ogni dipendente è caratterizzato dal nome, cognome, anzianità e ha associato un contratto
	private String nome;
	private String cognome;
	private Contratto contratto;
	
	
	Dipendente(){
		
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setCognome(String cognome){
		this.cognome = cognome;
	}
	public void setContratto(Contratto contratto){
		this.contratto = contratto;
	}
	
	public String getNome(){
		return nome;
	}
	public String getCognome(){
		return cognome;
	}
	public Contratto getContratto(){
		return contratto;
	}
	
	public int getStipendio(){
		return contratto.getContratt();
	}
	/*
	public int calcoloContratto(){
		 return this.contratto.contratt += ((this.contratto.contratt / 200 ) * this.anzianita);
	}
	
	*/
	
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

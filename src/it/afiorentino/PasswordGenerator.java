package it.afiorentino;

import java.util.Scanner;

public class PasswordGenerator {
	
public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		int somma;
		System.out.println("Inserisci il nome:");
		String nome = input.nextLine();
		System.out.println("Inserisci il Cognome:");
		String cognome = input.nextLine();
		System.out.println("Inserisci in numeri il giorno di nascita:");
		int giorno = input.nextInt();
		System.out.println("Inserisci in numeri il mese di nascita:");
		int mese = input.nextInt();
		System.out.println("Inserisci in numeri l'anno di nascita:");
		int anno = input.nextInt();
		somma = giorno + mese + anno;
		System.out.print("La password per te generata è: " + nome + "-" + cognome + "-" 
				+ somma);
	}

}

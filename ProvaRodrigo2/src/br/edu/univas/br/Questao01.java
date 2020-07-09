package br.edu.univas.br;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[]args) {
		
		Scanner reading = new Scanner(System.in);
		
		int moradorA[] = new int[12];
		int moradorB[] = new int[12];
		
		for (int i = 0; i < 12; i++) {
			System.out.println("Digite o valor da conta no mes:");
			    moradorA[i] = reading.nextInt();
			    int maiorContaA = 0;
			    int menorContaA = 0; 
			    int mediaA = 0;
			    if (moradorA[i] > maiorContaA) {
			    	maiorContaA = moradorA[i];
			    }
			        if (moradorA[i] < menorContaA) {
			    	menorContaA = moradorA[i];
			    }
			        mediaA = mediaA + moradorA[i]; 
			    System.out.println("A MAIOR CONTA:" + maiorContaA);
			    System.out.println("A MENOR CONTA:" + menorContaA);
			    System.out.println("A MEDIA É:" + mediaA / 12);
		}
		for (int j = 0; j < 12; j++) {
			System.out.println("Digite o valor da conta no mes:");
			    moradorB[j] = reading.nextInt();
			    int maiorContaB = 0;
			    int menorContaB = 0; 
			    int mediaB = 0;
			    if (moradorB[j] > maiorContaB) {
			    	maiorContaB = moradorB[j];
			    }
			        if (moradorB[j] < menorContaB) {
			    	menorContaB = moradorB[j];
			    }
			        mediaB = mediaB + moradorB[j]; 
			    System.out.println("A MAIOR CONTA:" + maiorContaB);
			    System.out.println("A MENOR CONTA:" + menorContaB);
			    System.out.println("A MEDIA É:" + mediaB / 12);
		}
		
		reading.close();
	}
}

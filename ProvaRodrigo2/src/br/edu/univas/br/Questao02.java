package br.edu.univas.br;

import java.util.Scanner;

public class Questao02 {
	
	public static void main(String[]args) {
		
		Scanner reading = new Scanner(System.in);
		
		System.out.println("Digite um número de 1 a 7:");
	        int num = reading.nextInt();
	    
		int nota[] = new int[7]; 
		while (num != 0)  {
			for (int i = 0; i < 7; i++) {
				if (num == 1) {
					System.out.println("DO");
				} else if ( num == 2) {
					System.out.println("RE");
				} else if (num == 3) {
					System.out.println("MI");
				} else if (num == 4) {
					System.out.println("FA");
				} else if (num == 5) {
					System.out.println("SOL");
				} else if (num == 6) {
					System.out.println("LA");
				} else if (num == 7) {
					System.out.println("SI");
				}
			}
			
		}
		
		
		reading.close();
	}

}

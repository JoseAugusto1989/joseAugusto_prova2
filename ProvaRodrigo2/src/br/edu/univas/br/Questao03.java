package br.edu.univas.br;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[]args) {
		
		Scanner reading = new Scanner(System.in);
		int soma = 0;
		int aux = 0;
		int x = 150;
		int func[] = new int[x];
		
		for (int i = 0; i < x; i++) {
			System.out.println("Digite o salario do funcionario:");
			    func[i] = reading.nextInt();
			    soma = soma + func[i];
			    aux = soma * 15 / 100;
		}
		for (int i = 0; i < 1; i++) {
			    System.out.println(soma);
			    System.out.println(aux);
		}
		reading.close();
	}
}

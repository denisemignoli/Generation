package repeticao;

import java.util.Scanner;

public class Exercicio1DoWhile {
	/* ENUNCIADO
	 * Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
	 * No final, mostre a soma dos n�meros digitados.(DO...WHILE)
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		int num, soma=0;
		
		System.out.println("\nEntre com um n�mero: ");
		num = leia.nextInt();
		
		do
		{
			if(num!=0)
			{
				soma = soma + num;
			}
			System.out.println("\nEntre com um n�mero: ");
			num = leia.nextInt();
		}
		while(num!=0);
		
		System.out.println("\nA soma dos n�meros digitados �: "+soma);
	}
}


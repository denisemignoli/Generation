package arrays;

import java.util.Scanner;

public class Exercicio2 {

	/*	ENUNCIADO
	 *  Faça um programa que receba 6 números inteiros e mostre: 
		• Os números pares digitados;  
		• A soma dos números pares digitados; 
		• Os números ímpares digitados; 
		• A quantidade de números ímpares digitados.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int [] numeros = new int [6];
		int somaPar=0, contImpar=0;
			
		for(int i = 0; i < 6; i++) 
		{
			System.out.println("\nEntre com um número: ");
			numeros[i] = leia.nextInt();
			
			if(numeros[i] % 2 == 0)
			{
				somaPar += numeros[i];
			}
			else
			{
				contImpar++;
			}		
		}
		System.out.println("\nSoma dos números pares: "+somaPar);
		System.out.println("\nQuantidade de números ímpares: "+contImpar);
	}
}

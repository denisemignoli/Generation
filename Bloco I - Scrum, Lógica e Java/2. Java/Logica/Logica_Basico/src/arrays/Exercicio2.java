package arrays;

import java.util.Scanner;

public class Exercicio2 {

	/*	ENUNCIADO
	 *  Fa�a um programa que receba 6 n�meros inteiros e mostre: 
		� Os n�meros pares digitados;  
		� A soma dos n�meros pares digitados; 
		� Os n�meros �mpares digitados; 
		� A quantidade de n�meros �mpares digitados.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int [] numeros = new int [6];
		int somaPar=0, contImpar=0;
			
		for(int i = 0; i < 6; i++) 
		{
			System.out.println("\nEntre com um n�mero: ");
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
		System.out.println("\nSoma dos n�meros pares: "+somaPar);
		System.out.println("\nQuantidade de n�meros �mpares: "+contImpar);
	}
}

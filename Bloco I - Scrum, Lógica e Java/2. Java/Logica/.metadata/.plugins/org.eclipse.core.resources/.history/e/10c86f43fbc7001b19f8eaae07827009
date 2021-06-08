package arrays;

import java.util.Scanner;

public class Exercicio3 {

	/*	3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		final int linha=3,coluna=3;
		int[][] matriz = new int[linha][coluna];
		int contMaior=0;
		
		for(int l=0;l<linha;l++)
		{
			for(int c=0;c<coluna;c++)
			{
				System.out.println("\nEntre com um valor: ");
				matriz [l][c] = leia.nextInt();
				
				if(matriz [l][c] > 10)
				{
					contMaior++;
				}
			}
		}
		System.out.println("\nA matriz tem "+contMaior+" maiores que 10");
	}

}

package arrays;

import java.util.Scanner;

public class Exercicio3 {

	/*	3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=3, y=3;
		int [][] matriz = new int [x][y];
		int contMaior=0;
		
		System.out.println("\nEntre com um n�mero: ");
		Scanner inserir = new Scanner (System.in);
		
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<y;j++)
			{
				System.out.println("\nDigite um n�mero: ");
				matriz [i][j] = inserir.nextInt();
				
				if (matriz [i][j]>10)
				{
					contMaior++;
				}
			}
		}
		System.out.println("\nOs n�meros maiores que 10 s�o: ");
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<y;j++)
			{
				if (matriz [i][j]>10)
				{
					System.out.println(matriz [i][j]);
				}
			}
		}
		System.out.println("\nForam contados "+contMaior+" n�meros maiores do que 10.");
		
	}

}

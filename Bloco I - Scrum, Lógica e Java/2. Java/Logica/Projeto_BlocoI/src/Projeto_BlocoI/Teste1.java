package Projeto_BlocoI;

import java.util.Scanner;

public class Teste1 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		int n1;

		System.out.println("Que bom te ver de novo!=D O que voc� gostaria de fazer hoje?\n1 - Aplicar 1"
				+ "\n2 - Aplicar 2");
		n1 = leia.nextInt();

		while (n1!=2 && n1!=1) 
		{	
			System.out.println("\nOp��o inv�lida, tente novamente.");
			System.out.println("\nEntre com um n�mero: ");
			n1 = leia.nextInt();
		}
		do 
		{	
		if (n1 == 1) 
		{
			System.out.println("\nAplica��o 1");
			System.out.println("\nDigite um n�mero dentre essas op��es:"+"\n\n\t1-A | 2-B | 3-C");
			int op = leia.nextInt();
			switch (op)
			{
			case 1:
				System.out.println("A");
				break;
				
			case 2:
				System.out.println("B");
				break;
			
			default:
				System.out.println("C");
				break;
			}
		} 
		else 
		{
			System.out.println("\nAplicacao 2");	
			
		}
		System.out.println("\nQuer repetir o procedimento? Digite um n�mero entre 1 e 2: ");
		n1 = leia.nextInt();
		}while(n1<=2 && n1>=1);
	}
}


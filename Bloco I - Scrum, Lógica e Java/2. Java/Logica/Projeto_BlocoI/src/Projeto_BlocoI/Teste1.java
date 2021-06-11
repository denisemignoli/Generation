package Projeto_BlocoI;

import java.util.Scanner;

public class Teste1 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		int n1;

		System.out.println("Que bom te ver de novo!=D O que você gostaria de fazer hoje?\n1 - Aplicar 1"
				+ "\n2 - Aplicar 2");
		n1 = leia.nextInt();

		while (n1!=2 && n1!=1) 
		{	
			System.out.println("\nOpção inválida, tente novamente.");
			System.out.println("\nEntre com um número: ");
			n1 = leia.nextInt();
		}
		do 
		{	
		if (n1 == 1) 
		{
			System.out.println("\nAplicação 1");
			System.out.println("\nDigite um número dentre essas opções:"+"\n\n\t1-A | 2-B | 3-C");
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
		System.out.println("\nQuer repetir o procedimento? Digite um número entre 1 e 2: ");
		n1 = leia.nextInt();
		}while(n1<=2 && n1>=1);
	}
}


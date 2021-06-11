package Projeto_BlocoI;

import java.util.Scanner;

public class TesteInvestimento {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int n1;
		
		System.out.println("Que bom te ver de novo!=D O que você gostaria de fazer hoje?\n1 - Aplicar em renda fixa\n2 - Aplicar em renda variável");
		n1 = leia.nextInt();
		
		while(n1>2)
			{
				System.out.println("\nOpção inválida, tente novamente.");
				System.out.println("\nEntre com um número: ");
				n1 = leia.nextInt();
			}
			
		if(n1==1)
			{
				System.out.println("\nAplicação em renda fixa");
			}
		else 
			{
				System.out.println("\nAplicação em renda variável");
			}
		Investimentos aplicacao1 = new Investimentos ("Denise Mignoli",3000,"CDB",20);		
		aplicacao1.calcularValorInvestir();	
	}
}

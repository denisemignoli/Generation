package Projeto_BlocoI;

import java.util.Scanner;

public class TesteInvestimento {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int n1;
		
		System.out.println("Que bom te ver de novo!=D O que voc� gostaria de fazer hoje?\n1 - Aplicar em renda fixa\n2 - Aplicar em renda vari�vel");
		n1 = leia.nextInt();
		
		while(n1>2)
			{
				System.out.println("\nOp��o inv�lida, tente novamente.");
				System.out.println("\nEntre com um n�mero: ");
				n1 = leia.nextInt();
			}
			
		if(n1==1)
			{
				System.out.println("\nAplica��o em renda fixa");
			}
		else 
			{
				System.out.println("\nAplica��o em renda vari�vel");
			}
		Investimentos aplicacao1 = new Investimentos ("Denise Mignoli",3000,"CDB",20);		
		aplicacao1.calcularValorInvestir();	
	}
}

package ProjetoFinancas;

import java.util.Scanner;

public class TesteInvestimento {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner inserir = new Scanner(System.in);
		int n1, idade, tempoCDB, tempoLCI;
		double salario, percEnvelope, rendimentoCDB, impostoCDB, rendimentoLCI;
		String Igor="Denise", profissao;
		
		System.out.println("\nOi, ficamos felizes em te ver novamente! =)");
		System.out.println("\nQuanto voc� recebeu esse m�s? ");
		salario = inserir.nextDouble();
		
		
		Investimentos aplicacao1 = new Investimentos (Igor, idade, profissao, salario, percEnvelope, rendimentoCDB, impostoCDB,
				tempoCDB, rendimentoLCI, tempoLCI);
		
		
		aplicacao1.calcularCDB();
		
		aplicacao1.calcularLCI();
		
		System.out.println("\nO que voc� gostaria de fazer hoje?" + "\n\n\t(1) Apontar em renda fixa\n\t(2) Apontar em renda vari�vel");
		n1 = inserir.nextInt();
		
		while (n1!=2 && n1!=1) 
		{	
			System.out.println("\nOp��o inv�lida, tente novamente.");
			System.out.println("\nEntre com um n�mero: ");
			n1 = inserir.nextInt();
		}
			
		do 
		{	
		if (n1 == 1) 
		{
			System.out.println("\n\tApontamento em renda fixa");
			System.out.println("----------------------------------------- ");
			System.out.println("\n\nDigite um n�mero dentre essas op��es:"+"\n\n\t(1) CDB/LC\n\t(2) LCI/LCA ");
			int op = inserir.nextInt();
			switch (op)
			{
			case 1:
				System.out.println("CDB/LC");
				break;
				
			case 2:
				System.out.println("LCI/LCA");
				break;
			
			default:
				System.out.println("Op��o inv�lida. Por favor, repita a opera��o.");
				break;
			}
			if (op == 1)
			{
				aplicacao1.calcularCDB();
			}
			else if (op == 2)
			{
				aplicacao1.calcularLCI();
			}
		} 
		else 
		{
			System.out.println("\n\tApontamento em renda vari�vel");
			System.out.println("--------------------------------------------- ");
			System.out.println("\nDigite um n�mero dentre essas op��es:"+"\n\n\t(1) A��es brasileiras\n\t(2) Fundos Imobili�rios");
			int op = inserir.nextInt();
			switch (op)
			{
			case 1:
				System.out.println("A��es brasileiras");
				break;
				
			case 2:
				System.out.println("Fundos Imobili�rios");
				break;
			
			default:
				System.out.println("Op��o inv�lida. Por favor, repita a opera��o.");
				break;
			}			
		}
		System.out.println("\nQuer repetir o procedimento? Digite um n�mero entre 1 e 2: ");
		n1 = inserir.nextInt();
		}while(n1<=2 && n1>=1);
	}
}

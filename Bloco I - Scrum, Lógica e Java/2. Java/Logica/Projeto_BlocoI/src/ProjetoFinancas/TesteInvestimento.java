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
		System.out.println("\nQuanto você recebeu esse mês? ");
		salario = inserir.nextDouble();
		
		
		Investimentos aplicacao1 = new Investimentos (Igor, idade, profissao, salario, percEnvelope, rendimentoCDB, impostoCDB,
				tempoCDB, rendimentoLCI, tempoLCI);
		
		
		aplicacao1.calcularCDB();
		
		aplicacao1.calcularLCI();
		
		System.out.println("\nO que você gostaria de fazer hoje?" + "\n\n\t(1) Apontar em renda fixa\n\t(2) Apontar em renda variável");
		n1 = inserir.nextInt();
		
		while (n1!=2 && n1!=1) 
		{	
			System.out.println("\nOpção inválida, tente novamente.");
			System.out.println("\nEntre com um número: ");
			n1 = inserir.nextInt();
		}
			
		do 
		{	
		if (n1 == 1) 
		{
			System.out.println("\n\tApontamento em renda fixa");
			System.out.println("----------------------------------------- ");
			System.out.println("\n\nDigite um número dentre essas opções:"+"\n\n\t(1) CDB/LC\n\t(2) LCI/LCA ");
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
				System.out.println("Opção inválida. Por favor, repita a operação.");
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
			System.out.println("\n\tApontamento em renda variável");
			System.out.println("--------------------------------------------- ");
			System.out.println("\nDigite um número dentre essas opções:"+"\n\n\t(1) Ações brasileiras\n\t(2) Fundos Imobiliários");
			int op = inserir.nextInt();
			switch (op)
			{
			case 1:
				System.out.println("Ações brasileiras");
				break;
				
			case 2:
				System.out.println("Fundos Imobiliários");
				break;
			
			default:
				System.out.println("Opção inválida. Por favor, repita a operação.");
				break;
			}			
		}
		System.out.println("\nQuer repetir o procedimento? Digite um número entre 1 e 2: ");
		n1 = inserir.nextInt();
		}while(n1<=2 && n1>=1);
	}
}

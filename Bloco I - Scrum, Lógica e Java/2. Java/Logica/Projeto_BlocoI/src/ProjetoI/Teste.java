package ProjetoI;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inserir = new Scanner(System.in);

		String nome = "Denise";
		double salario, percEnvelope, rendimentoCDB, impostoCDB, rendimentoLCI, somaFII=0.0, n2, somaAcoes=0.0;
		int n1, tempoCDB, tempoLCI;

		System.out.println("\nOi, " + nome + "! Ficamos felizes em te ver novamente! =)");
		System.out.println("\nQuanto você recebeu esse mês? (R$) ");
		salario = inserir.nextDouble(); //3000

		System.out.println("\nQual o percentual da sua renda você destinou para investimentos? (%)");
		percEnvelope = inserir.nextInt(); //20%
		
		Investimentos aplicacao1 = new Investimentos(salario, percEnvelope);
		aplicacao1.calcularValorInvestir(); // 600
		
		System.out.println("\nMaravilha! =D E como você distribuiu esse valor?\n\n\t(1) Apontar em renda fixa\n\t"
				+ "(2) Apontar em renda variável");
		n1 = inserir.nextInt();

		while (n1 != 2 && n1 != 1) {
			System.out.println("\nOpção inválida, tente novamente.");
			System.out.println("\nEntre com um número: ");
			n1 = inserir.nextInt();
		}

		do {
			if (n1 == 1) {
				System.out.println("\n\tApontamento em renda fixa");
				System.out.println("========================================= ");
				System.out.println("\n\nDigite um número dentre essas opções:" + "\n\n\t(1) CDB/LC\n\t(2) LCI/LCA ");
				int op = inserir.nextInt();
				switch (op) {
				case 1:
					System.out.println("CDB/LC");
					
					System.out.println("\nQual o rendimento desse CDB?");
					rendimentoCDB = inserir.nextDouble(); //13%
					System.out.println("\nQual o imposto desse CDB?");
					impostoCDB = inserir.nextDouble(); //17,5%
					System.out.println("\nQual o tempo desse CDB?");
					tempoCDB = inserir.nextInt(); //1
					
					Investimentos aplicacao2 = new Investimentos(salario, percEnvelope, rendimentoCDB,
							impostoCDB, tempoCDB);
					
					aplicacao2.calcularCDB();
					
					break;
					
				case 2:
					System.out.println("LCI/LCA");
					
					System.out.println("\nQual o rendimento desse LCI/LCA?");
					rendimentoLCI = inserir.nextDouble();
					System.out.println("\nQual o tempo desse LCI/LCA?");
					tempoLCI = inserir.nextInt();
					
					Investimentos aplicacao3 = new Investimentos(salario, percEnvelope, rendimentoLCI, tempoLCI);
					
					aplicacao3.calcularLCI();
					
					break;
					
				default:
					System.out.println("Opção inválida.");
					break;
				}
			
			} else {
				System.out.println("\n\tApontamento em renda variável");
				System.out.println("============================================= ");
				System.out.println("\nDigite um número dentre essas opções:"
						+ "\n\n\t(1) Ações brasileiras\n\t(2) Fundos Imobiliários");
				int op = inserir.nextInt();
				switch (op) {
				case 1:
					System.out.println("Ações brasileiras");
					System.out.println("\nQuanto vc aplicou?");
					n2 = inserir.nextDouble();
					somaAcoes = somaAcoes + n2;
					System.out.println("R$ "+somaAcoes);
					break;

				case 2:
					System.out.println("Fundos Imobiliários");
					System.out.println("\nQuanto vc aplicou?");
					n2 = inserir.nextDouble();
					somaFII = somaFII + n2;
					System.out.println("R$ "+somaFII);
					break;

				default:
					System.out.println("Opção inválida.");
					break;
				}
			}
			System.out.println("\nQuer repetir o procedimento? Digite o número 1 para renda fixa, 2 para renda variável ou 0 para sair ");
			n1 = inserir.nextInt();
		} while (n1 == 2 || n1 ==1);
	}
}

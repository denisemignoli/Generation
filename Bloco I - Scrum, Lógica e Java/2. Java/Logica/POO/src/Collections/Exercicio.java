package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio {
	/*
	 * Crie um programa para trabalhar com estoque de uma loja, o programa deverá
	 * trabalhar com Collection do tipo List do Java para manipular os dados desse
	 * estoque, o programa deverá atender as seguintes funcionalidades: - Armazenar
	 * dados da List - Remover dados da list; - Atualizar dados da list. -
	 * Apresentar todos os dados da list.
	 */
	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		List<String> produtoEstocados = new ArrayList<String>();

		String addProduto;
		int options;

		System.out.println("\n\tControle de Estoque\n"
				+ "(1)Armazenar dados\n(2)Remover dados\n(3)Atualizar dados\n(4)Apresentar todos os dados");
		options = read.nextInt();
		
		do
		{
			switch (options) {
			case 1:
				read.next();
				System.out.println("\nDigite aqui o item que você quer incluir: ");
				addProduto = read.next();
				produtoEstocados.add(addProduto);
				break;
				
			case 2:
				do
				{
					read.next();
					System.out.println("\nDigite aqui o item que você quer remover: ");
					addProduto = read.next();
					if(produtoEstocados.contains(addProduto))
					{
						produtoEstocados.remove(addProduto);
					}
					else
					{
						System.out.println("\nEste produto não consta na lista. Tente de novo.\n"
								+ "Digite (1) Para tentar novamente\n(0) Para sair");
						options = read.nextInt();
					}
				}while(options==1);
				break;
				
			case 3:
				do
				{
					read.next();
					System.out.println("\nDigite aqui o item que você quer atualizar: ");
					addProduto = read.next();
					for(String verificar:produtoEstocados)
					{
						System.out.println(verificar);
					}
					
					if(produtoEstocados.contains(addProduto))
					{
						produtoEstocados.remove(addProduto);
						produtoEstocados.add(addProduto);
					}
					else
					{
						System.out.println("\nEste produto não consta na lista. Tente de novo.\n"
								+ "Digite (1) Para tentar novamente\n(0) Para sair");
						options = read.nextInt();
					}
				}while(options==1);
				break;
				default:
					System.out.println("\nOpção inválida.");
			}
			System.out.println("\n\tControle de Estoque\n"
					+ "(1)Armazenar dados\n(2)Remover dados\n(3)Atualizar dados\n(4)Apresentar todos os dados");
			options = read.nextInt();
		}while(options!=0);
	}
}

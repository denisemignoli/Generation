package Projeto_BlocoI;

import java.util.Scanner;

public class Teste2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inserir = new Scanner(System.in);
		int nPeople;
		
		System.out.println("Entre com uma quantidade de pessoas que vc deseja cadastrar: ");
		nPeople = inserir.nextInt();
		
		String[] nomes = new String[nPeople]; // nesse caso o array é composto por nomes, por isso usamos String
		
		for(int i=0;i<nPeople;i++)
		{
			System.out.println("\nEntre com o primeiro nome: ");
			nomes[i] = inserir.next();
		}
		System.out.println("\nPessoas cadastradas: ");
		
		for(String nome:nomes) //each : > igual o case
		{
			System.out.println("\n\t"+nome);
		}
	}
}

package condicional;

import java.util.Scanner;

public class Exercicio3 {

	/*Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual categoria ela se encontra:
	10-14 infantil
	15-17 juvenil
	18-25 adulto
	*/
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		int idade;
		
		System.out.println("\nPara participar do campeonato, por favor, nos informe sua idade: ");
		idade = leia.nextInt();
		
		if(idade>=10 && idade <=14)
		{
			System.out.println("\nVoc� � da categoria infantil =)");
		}
		else if(idade>=15 && idade <=17)
		{
			System.out.println("\nVoc� � da categoria juvenil =)");
		}
		else if(idade>=18 && idade <=25)
		{
			System.out.println("\nVoc� � da categoria adulto =)");
		}
		else 
		{
			System.out.println("\nInfelizmente, voc� n�o se enquadra nas categorias dispon�veis at� o momento...");
		}
	}

}

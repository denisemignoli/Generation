package condicional;

import java.util.Scanner;

public class Exercicio4 {

	/* 
	Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar. 
	Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.
	*/
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		double num, resultado;
		
		System.out.println("\nDigite aqui o n�mero desejado: ");
		num = leia.nextDouble();
		
		if(num%2==0)
		{
			resultado = Math.sqrt(num);
			System.out.println("\nO n�mero "+num+" � par e sua raiz � "+resultado);
		}
		else
		{
			resultado = Math.pow(num,2);
			System.out.println("\nO n�mero "+num+" � �mpar e seu quadrado � "+resultado);
		}
		
	}

}

package condicional;

import java.util.Scanner;

public class Exercicio2 {
	
	// Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		int n1, n2, n3;
		
		System.out.println("\nDigite o primeiro n�mero: ");
		n1 = leia.nextInt();
				
		System.out.println("\nDigite o segundo n�mero: ");
		n2 = leia.nextInt();
				
		System.out.println("\nDigite o terceiro n�mero: ");
		n3 = leia.nextInt();
		
		if(n1<n2 && n1<n3)
		{
			if(n2<n3)
			{
				System.out.println("\nA sequ�ncia crescente �: "+n1+", "+n2+" e "+n3);
			}
			else 
			{
				System.out.println("\nA sequ�ncia crescente �: "+n1+", "+n3+" e "+n2);
			}
		}
		else if(n2<n1 && n2<n3)
		{
			if(n1<n3)
			{
				System.out.println("\nA sequ�ncia crescente �: "+n2+", "+n1+" e "+n3);
			}
			else 
			{
				System.out.println("\nA sequ�ncia crescente �: "+n2+", "+n3+" e "+n1);
			}
		}
		else
		{
			if(n1<n2)
			{
				System.out.println("\nA sequ�ncia crescente �: "+n3+", "+n1+" e "+n2);
			}
			else 
			{
				System.out.println("\nA sequ�ncia crescente �: "+n3+", "+n2+" e "+n1);
			}
		}
	}

}

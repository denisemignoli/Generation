package introducao_variaveis;

import java.util.Scanner;

public class Exercicio8 {
	/* ENUNCIADO
	 * 8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a percentagem do distribuidor 
	 * e dos impostos (aplicados ao custo de fabrica). Supondo que a percentagem do distribuidor seja de 28% e os 
	 * impostos de 45%, escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao consumidor. 
	 */

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			double cf,  cc;
			Scanner leia = new Scanner(System.in);
			
			System.out.println("\nEntre com o custo de fabrica: ");
			cf = leia.nextFloat();
			
			cc = cf + (cf*0.73);
			
			System.out.println("\nCusto ao consumidor: "+cc);
			
		}
}

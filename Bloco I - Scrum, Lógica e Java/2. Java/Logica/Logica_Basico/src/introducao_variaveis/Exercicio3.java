package introducao_variaveis;

import java.util.Scanner;

public class Exercicio3 {
	/* ENUNCIADO
	 * 3. Faca um sistema que leia o tempo de duracao de um evento em uma fabrica expressa em segundos e 
	 * mostre-o expresso em horas, minutos e segundos.
	 */

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			int horas, minutos, segundos, totalSegundos;
			Scanner leia = new Scanner(System.in);
			
			System.out.println("\nEntre com o total de segundos do evento: ");
			totalSegundos = leia.nextInt();
			
			horas = totalSegundos / 3600;
			
			minutos = (totalSegundos % 3600) / 60;
			
			segundos = (totalSegundos % 3600) % 60;
			
			System.out.println("\nHoras: "+horas+"\nMinutos: "+minutos+"\nSegundos: "+segundos);
					
		}

}

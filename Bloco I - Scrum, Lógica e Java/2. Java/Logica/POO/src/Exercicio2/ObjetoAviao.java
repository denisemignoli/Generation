package Exercicio2;

/*
 * 2) Crie uma classe avião e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto avião, 
 * defina as instancias deste objeto e apresente as informações deste objeto no console.
 */

public class ObjetoAviao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aviao travel1 = new Aviao("Denise Aparecida Mignoli","Econômica",55,2,"Luthansa","São Paulo - Guarulhos International","Helsinki - Vantaa");
		System.out.println("Dados do(a) passageiro(a): ");
		travel1.printInfoPass();
		System.out.println("\nDados do voo: ");
		travel1.printInfoFlight();
	}
}

package Exercicio2;

/*
 * 2) Crie uma classe avi�o e apresente os atributos e m�todos referentes esta classe, em seguida crie um objeto avi�o, 
 * defina as instancias deste objeto e apresente as informa��es deste objeto no console.
 */

public class ObjetoAviao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aviao travel1 = new Aviao("Denise Aparecida Mignoli","Econ�mica",55,2,"Luthansa","S�o Paulo - Guarulhos International","Helsinki - Vantaa");
		System.out.println("Dados do(a) passageiro(a): ");
		travel1.printInfoPass();
		System.out.println("\nDados do voo: ");
		travel1.printInfoFlight();
	}
}

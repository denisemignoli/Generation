package Exercicio1;

/* ENUNCIADO
 * 1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto cliente, 
 * defina as instancias deste objeto e apresente as informações deste objeto no console.
 */

public class ObjetoCliente {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.out.println("Nome do(a) cliente: ");
		Cliente cliente1 = new Cliente("Denise","Aparecida","Mignoli",27,123456789);
		cliente1.imprimirInfo();
		System.out.println("\n****Alteração de idade:****");
		cliente1.setIdade(28);
		cliente1.imprimirInfo();
	}
}

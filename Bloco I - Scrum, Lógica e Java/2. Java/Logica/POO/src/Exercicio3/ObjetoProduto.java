package Exercicio3;

import Exercicio3.ProdutoEletronico;

public class ObjetoProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProdutoEletronico produto1 = new ProdutoEletronico("Calculadora Científica","Fx-82MS","Casio","azul marinho",50,150);
		System.out.println("Detlhes do produto: ");
		produto1.printFichaTecnica();
	}
}

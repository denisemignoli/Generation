package Exercicio3;

import java.text.NumberFormat;

public class ProdutoEletronico {

	private String nome;
	private String marca;
	private String modelo;
	private String cor;
	private double preco;
	private float peso;
	
	public ProdutoEletronico(String nome, String marca, String modelo, String cor, double peso, float preco)
	{
		this.setNome(nome);
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setCor(cor);
		this.setPreco(preco);
		this.setPeso(peso);
	}
	public void printFichaTecnica()
	{
		System.out.println("Produto:"+nome+" - "+modelo+" - "+marca+"\nCor: "+cor+"\nPeso: "+peso+" g"+"\nPreço: "+this.formatarMoeda());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(double peso2) {
		this.peso = (float) peso2;
	}
	public String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(preco);
		return formatoMoeda;
	}
	
}

package Projeto_BlocoI;

import java.text.NumberFormat;

public class CadastroCliente {

	private String nomeCliente;
	private double receita;
	
	public CadastroCliente(String nomeCliente,double receita)
	{
		super();
		this.nomeCliente = nomeCliente;
		this.receita = receita;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getReceita() {
		return receita;
	}

	public void setReceita(double receita) {
		this.receita = receita;
	}
	public String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(receita);
		return formatoMoeda;
	}
}

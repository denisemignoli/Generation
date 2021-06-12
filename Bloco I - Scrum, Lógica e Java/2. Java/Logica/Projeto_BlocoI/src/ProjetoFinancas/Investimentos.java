package ProjetoFinancas;

import java.text.NumberFormat;

public class Investimentos extends Cliente{

	private double percEnvelope;
	private double rendimentoCDB;
	private double impostoCDB;
	private int tempoCDB;
	private double rendimentoLCI;
	private int tempoLCI;

	
	public Investimentos(String nome, int idade, String profissao, double salario, double percEnvelope,double rendimentoCDB, double impostoCDB,
			int tempoCDB,double rendimentoLCI,int tempoLCI)
	{
		super(nome,idade,profissao, salario);
		this.percEnvelope = percEnvelope;
		this.rendimentoCDB = rendimentoCDB;
		this.impostoCDB = impostoCDB;
		this.tempoCDB = tempoCDB;
		this.rendimentoLCI = rendimentoLCI;
		this.tempoLCI = tempoLCI;
	}

	public double getPercEnvelope() {
		return percEnvelope;
	}

	public void setPercEnvelope(double percEnvelope) {
		this.percEnvelope = percEnvelope;
	}

	public double getRendimentoCDB() {
		return rendimentoCDB;
	}

	public void setRendimentoCDB(double rendimentoCDB) {
		this.rendimentoCDB = rendimentoCDB;
	}

	public double getImpostoCDB() {
		return impostoCDB;
	}

	public void setImpostoCDB(double impostoCDB) {
		this.impostoCDB = impostoCDB;
	}

	public int getTempoCDB() {
		return tempoCDB;
	}

	public void setTempoCDB(int tempoCDB) {
		this.tempoCDB = tempoCDB;
	}

	public double getRendimentoLCI() {
		return rendimentoLCI;
	}

	public void setRendimentoLCI(double rendimentoLCI) {
		this.rendimentoLCI = rendimentoLCI;
	}

	public int getTempoLCI() {
		return tempoLCI;
	}

	public void setTempoLCI(int tempoLCI) {
		this.tempoLCI = tempoLCI;
	}

	
	public void calcularValorInvestir()
	{
		double valorInvestir = getSalario() * (percEnvelope/100); //(3000*20%) = R$ 600
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(valorInvestir);
		
		System.out.println("\nLevando em considera��o sua atual renda, o valor a investir este m�s � de: "+formatoMoeda);
	}
	
	public void calcularCDB()
	{
		double valorInvestir = getSalario() * (percEnvelope/100); //(3000*20%) = R$ 600
		double valorRendimento = (valorInvestir * (rendimentoCDB/100) * tempoCDB); //(600*13%)*1 = R$ 78 
		double valorDescontado = (valorRendimento * impostoCDB/100); //(78*17,5%) = R$ 13,65
		double calcularCDB = (valorInvestir + valorRendimento - valorDescontado); //600 + 78 - 13,65 = R$ 664,35
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(calcularCDB);
		
		System.out.println("\nO valor final na data de vencimento ser� de: "+formatoMoeda);
	}
	
	public void calcularLCI()
	{
		double valorInvestir = getSalario() * (percEnvelope/100); //(3000*20%) = R$ 600
		double valorRendimento = (valorInvestir * (rendimentoLCI/100) * tempoLCI); //(600*13%)*1 = R$ 78
		double calcularLCI = (valorInvestir + valorRendimento); //600 + 78 = R$ 678,00
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(calcularLCI);
		
		System.out.println("\nO valor final na data de vencimento ser� de: "+formatoMoeda);
		
	}
	
	public String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(getSalario());
		return formatoMoeda;
	}
}

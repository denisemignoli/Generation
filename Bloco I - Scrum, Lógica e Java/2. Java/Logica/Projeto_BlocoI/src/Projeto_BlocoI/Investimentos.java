package Projeto_BlocoI;

public class Investimentos extends CadastroCliente{

	private String nomeInvestimento;
	private float percentual;
	
	public Investimentos(String nome, double receita, String nomeInvestimento, float percentual)
	{
		super(nome,receita);
		this.nomeInvestimento = nomeInvestimento;
		this.percentual = percentual;
	}

	public String getNomeInvestimento() {
		return nomeInvestimento;
	}

	public void setNomeInvestimento(String nomeInvestimento) {
		this.nomeInvestimento = nomeInvestimento;
	}

	public float getPercentual() {
		return percentual;
	}

	public void setPercentual(float percentual) {
		this.percentual = percentual;
	}
	public void calcularValorInvestir()
	{
		double valor_investir = getReceita() * (percentual/100);
		System.out.println("\nO valor a investir é de: "+valor_investir);
	}
}

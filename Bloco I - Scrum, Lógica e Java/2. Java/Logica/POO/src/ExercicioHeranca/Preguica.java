package ExercicioHeranca;

public class Preguica extends Animal {

	private int peso;
	private String motivacao;
		
	public Preguica(String nome, int idade, int peso, String motivacao)
	{
		super(nome,idade);
		this.peso = peso;
		this.motivacao = motivacao;
	}
	
	@Override
	public void emitir(String som)
	{
		System.out.println("\nTipo do som emitido: "+som);
	}

	@Override
	public void correr(int corrida)
	{
		System.out.println("\nTipo de corrida: "+corrida);
	}
	
	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getMotivacao() {
		return motivacao;
	}

	public void setMotivacao(String motivacao) {
		this.motivacao = motivacao;
	}

	public void imprimirInfo()
	{
		System.out.println("\nNome da preguica: "+getNome()+"\nidade: "+getIdade()+" anos"+
				"\nPeso: "+peso+" kg"+"\nMotivação: "+motivacao);
	}
}

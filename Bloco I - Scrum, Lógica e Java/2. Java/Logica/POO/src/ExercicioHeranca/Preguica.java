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

package ExercicioHeranca;

public class Cavalo extends Animal {

	private int peso;
	private String raca;
	private int velocidade;
	private String adestrador;
	
	public Cavalo(String nome, int idade, int peso, String raca,int velocidade,String adestrador)
	{
		super(nome,idade);
		this.peso = peso;
		this.raca = raca;
		this.velocidade = velocidade;
		this.adestrador = adestrador;
	}
	
	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public String getAdestrador() {
		return adestrador;
	}

	public void setAdestrador(String adestrador) {
		this.adestrador = adestrador;
	}

	public void imprimirInfo()
	{
		System.out.println("\nNome do cavalo da competição: "+getNome()+"\nidade: "+getIdade()+" anos"+
				"\nPeso: "+peso+" kg"+"\nRaça: "+raca+"\nVelocidade alcançada: "+velocidade+" km/h"+"\nAdestrador(a): "+adestrador);
	}
}

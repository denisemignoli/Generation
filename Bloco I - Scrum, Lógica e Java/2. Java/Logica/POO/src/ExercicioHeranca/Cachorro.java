package ExercicioHeranca;

public class Cachorro extends Animal{

	private String tamanho;
	private String raca;
	private String brinquedo;
	
	public Cachorro(String nome, int idade, String tamanho, String raca,String brinquedo)
	{
		super(nome,idade);
		this.tamanho = tamanho;
		this.raca = raca;
		this.brinquedo = brinquedo;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	
	public String getBrinquedo() {
		return brinquedo;
	}

	public void setBrinquedo(String brinquedo) {
		this.brinquedo = brinquedo;
	}

	public void imprimirInfo()
	{
		System.out.println("\nNome do cachorrinho: "+getNome()+"\nidade: "+getIdade()+" meses"+
				"\nTamanho: "+tamanho+"\nRaça: "+raca+"\nBrinquedo favorito: "+brinquedo);
	}
	
}

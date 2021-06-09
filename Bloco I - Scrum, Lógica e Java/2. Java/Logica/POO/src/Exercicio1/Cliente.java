package Exercicio1;

/* ENUNCIADO
 * 1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto cliente, 
 * defina as instancias deste objeto e apresente as informações deste objeto no console.
 */

public class Cliente {

	private String primeiroNome;
	private String ultimoNome;
	private String nomesDoMeio;
	private int idade;
	private int CPF;
	
	//Construtor > o mesmo nome da classe sempre seguido pela lista de parâmetros que temos
	public Cliente (String primeiro,String meio,String ultimo, int idade, int CPF)
	{
		primeiroNome = primeiro;
		ultimoNome = ultimo;
		nomesDoMeio = meio;
		this.idade = idade;
		this.CPF = CPF;		
	}
	
	public void imprimirInfo()
	{
		System.out.println(primeiroNome+" "+nomesDoMeio+" "+ultimoNome+", "+idade+" anos, CPF "+CPF);
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	public String getNomesDoMeio() {
		return nomesDoMeio;
	}

	public void setNomesDoMeio(String nomesDoMeio) {
		this.nomesDoMeio = nomesDoMeio;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getCPF() {
		return CPF;
	}

	public void setCPF(int cPF) {
		CPF = cPF;
	}	
}

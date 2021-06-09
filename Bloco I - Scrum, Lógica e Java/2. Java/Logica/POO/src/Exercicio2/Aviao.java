package Exercicio2;

/*
 * 2) Crie uma classe avião e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto avião, 
 * defina as instancias deste objeto e apresente as informações deste objeto no console.
 */

public class Aviao {

	private String passageiro;
	private String classe;
	private int assento;
	private int pesoBagagem;
	private String ciaAerea;
	private String partida;
	private String destino;
	
	public Aviao(String passageiro, String classe, int assento, int pesoBagagem,String ciaAerea, String partida, String destino)
	{
		this.setPassageiro(passageiro);
		this.setClasse(classe);
		this.setAssento(assento);
		this.setPesoBagagem(pesoBagagem);
		this.setCiaAerea(ciaAerea);
		this.setPartida(partida);
		this.setDestino(destino);
	}
	public void printInfoPass()
	{
		System.out.println("Nome:"+passageiro+"\nClasse: "+classe+" | Assento:"+assento+" | Peso da Bagagem: "+pesoBagagem+" kg");
	}
	public void printInfoFlight()
	{
		System.out.println("Companhia Aérea: "+ciaAerea+"\nPartida: "+partida+" ---> Destino: "+destino);
	}

	public String getPassageiro() {
		return passageiro;
	}

	public void setPassageiro(String passageiro) {
		this.passageiro = passageiro;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public int getAssento() {
		return assento;
	}

	public void setAssento(int assento) {
		this.assento = assento;
	}

	public int getPesoBagagem() {
		return pesoBagagem;
	}

	public void setPesoBagagem(int pesoBagagem) {
		this.pesoBagagem = pesoBagagem;
	}

	public String getCiaAerea() {
		return ciaAerea;
	}

	public void setCiaAerea(String ciaAerea) {
		this.ciaAerea = ciaAerea;
	}

	public String getPartida() {
		return partida;
	}

	public void setPartida(String partida) {
		this.partida = partida;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}	
}

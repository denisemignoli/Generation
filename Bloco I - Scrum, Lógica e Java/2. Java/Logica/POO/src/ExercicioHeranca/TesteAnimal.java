package ExercicioHeranca;

public class TesteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cachorro Luck = new Cachorro ("Luck", 10,"pequeno","yorkshire","meia");
		Luck.imprimirInfo();
		
		Cavalo Raio = new Cavalo ("Raio",2,60,"Puro sangue inglês",60,"Lorna Johnstone");
		Raio.imprimirInfo();
		
		Preguica Sono = new Preguica ("Sono",3,2,"0");
		Sono.imprimirInfo();
	}

}

package classes_e_metodos;

public class Jantar {

	public static void main(String[] args) {
		Comida c1 = new Comida("Arroz", 0.230);
		Comida c2 = new Comida("Feijão", 0.300);
		Pessoa p = new Pessoa("João", 99.80);
		
		System.out.println(p.apresentar());
		p.comer(c1);
		p.comer(c2);
		System.out.println(p.apresentar());
	}

}

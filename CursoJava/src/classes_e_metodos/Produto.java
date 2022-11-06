package classes_e_metodos;

public class Produto {
	    
	    String nome;
	    double preco;
	    static double desconto = 0.25;
	    
	    // contrutor precisa ter o mesmo nome da classe
	    Produto(){ // contrutor padrão
	    	
	    }
	    
	    //pode possui mais de om construtor, mas precisa ter a assinatura diferente
	    //o contrutor abaixo possui paramentros que o contrutor padrão não possui
	    Produto(String nomeInicial, double precoInicial){ //contrutor
	    	nome =  nomeInicial;
	    	preco = precoInicial;
	    
	    }

	    double precoComDesconto(){
	        return preco * (1 - desconto);
	 }
}


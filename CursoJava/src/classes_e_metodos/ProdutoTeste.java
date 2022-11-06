package classes_e_metodos;


public class ProdutoTeste {
	public static void main(String[] args) {
	
		Produto p1 = new Produto("Notebook", 3299);
		System.out.println(p1.nome + ": " + p1.preco);
	
		
		var p2 =  new Produto("Caneta verde", 12);	
		
		System.out.println(p2.nome + ": " + p2.preco);
		
		System.out.println("\n"+p1.nome +" com desconto: " + p1.precoComDesconto());
		System.out.println(p2.nome + " com desconto: " + p2.precoComDesconto());
		
		
		var carrinho = p1.preco + p2.preco;
		var valorFinal = p1.precoComDesconto() + p2.precoComDesconto();
		
		System.out.println("\nTotal no carrinho: " + carrinho);
		System.out.println("Valor final: " + valorFinal);
		
	}
	 
	 
	 
	 
}

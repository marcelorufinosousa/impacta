package projeto14;

import java.util.LinkedHashSet;
import java.util.Set;

public class Proj14ColecaoAplicacaoAppSet03 {
	public static void main(String[] args) {
		
		 Set<Produto> produtos = new LinkedHashSet<>();
		 produtos.add(new Produto("Informática", "Lapop", 4000));
		 produtos.add(new Produto("Limpeza", "Sabonete", 3));
		 produtos.add(new Produto("Alimentação", "Macarrão", 5));
		 produtos.add(new Produto("Informática", "WebCam", 389));

		 
		 Produto p = new Produto("Transporte", "Bicicleta", 2000);
		 produtos.add(p);
		 produtos.add(p);
		 produtos.add(p);		 
			
		 produtos.forEach(produto -> System.out.println(produto));
		 
		 
		
		
	}

}

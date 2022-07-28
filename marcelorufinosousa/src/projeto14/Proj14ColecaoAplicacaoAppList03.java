package projeto14;

import java.util.ArrayList;

import com.sun.tools.javac.util.List;

public class Proj14ColecaoAplicacaoAppList03 {
	public class AppList03 {
		public static void main(String[] args) {
			
	
					List<Produto> produtos = new ArrayList<>();		
					produtos.add(new Produto("Informática", "Lapop", 4000));
					produtos.add(new Produto("Limpeza", "Sabonete", 3));
					produtos.add(new Produto("Alimentação", "Macarrão", 5));
					produtos.add(new Produto("Informática", "WebCam", 389));
					produtos.add(new Produto("Transporte", "Bicicleta", 2000));
					

					System.out.println("Lista Orinal: ");
					produtos.forEach(produto -> System.out.println(produto));
							
					produtos.sort((a,b) -> a.getCategoria().compareTo(b.getCategoria()));
					
					System.out.println();
					System.out.println("Lista Ordenada pela Categoria:");
					produtos.forEach(produto -> System.out.println(produto));			
				
		}

}

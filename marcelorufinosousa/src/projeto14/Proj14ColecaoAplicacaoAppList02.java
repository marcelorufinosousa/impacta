package projeto14;

import java.util.ArrayList;
import java.util.Collections;

import com.sun.tools.javac.util.List;

public class Proj14ColecaoAplicacaoAppList02 {
public static void main(String[] args) {	
		
		//interface              //tipo
		List<Produto> produtos = new ArrayList<>();		
		produtos.add(new Produto("Inform�tica", "Lapop", 4000));
		produtos.add(new Produto("Limpeza", "Sabonete", 3));
		produtos.add(new Produto("Alimenta��o", "Macarr�o", 5));
		produtos.add(new Produto("Inform�tica", "WebCam", 389));
		produtos.add(new Produto("Transporte", "Bicicleta", 2000));
		

		System.out.println("Lista Orinal: ");
		produtos.forEach(produto -> System.out.println(produto));
		
		
		Collections.sort(produtos, new OrdenacaoCategoria());
			
		System.out.println();
		
		System.out.println("Lista Ordenada pela Categoria:");
		produtos.forEach(produto -> System.out.println(produto));
		
		
		Collections.sort(produtos, new OrdenacaoDescricao());
		
		System.out.println();
		
		System.out.println("Lista Ordenada pela Descri��o: ");
		produtos.forEach(produto -> System.out.println(produto));
		
	}

}

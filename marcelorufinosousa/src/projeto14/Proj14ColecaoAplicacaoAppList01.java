package projeto14;

import java.util.ArrayList;
import java.util.Collections;

import com.sun.tools.javac.util.List;

public class Proj14ColecaoAplicacaoAppList01 {
public static void main(String[] args) {
		
		
		List<String> nomes = new  ArrayList<>();
		
		nomes.add("Maria");	
		
		nomes.add("Alex");	
		
		nomes.add(0,"Lucas");	
		
	
		System.out.println(nomes);
		
		System.out.println();
		
	
		for (String nome : nomes) {			
			System.out.println(nome);
		}
		
		Collections.sort(nomes);
		
		System.out.println();
		
		nomes.forEach(s -> System.out.println(s));
		
		
		}	

}

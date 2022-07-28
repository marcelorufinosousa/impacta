package projeto14;

import java.util.Set;
import java.util.TreeSet;

public class Proj14ColecaoAplicacaoAppSet02 {
	public static void main(String[] args) {
		
		   Set<String> nomes = new  TreeSet<>();
		   nomes.add("Daniel");
		   nomes.add("Edgard");
		   nomes.add("Edson");
		   nomes.add("Kelly");
		   nomes.add("Cecilia");
		   nomes.add("Bruno");   
		   nomes.add("Kelly");
		   
		   
		   nomes.forEach(s -> System.out.println(s));
		  
	}

}

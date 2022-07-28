package projeto8;

import

import


public class Proj8HerancaoUtiliatarios01AppUtilitarios {

	public static void main(String[] args) {
		
		double soma = Utilitarios.somar(12, 15.6);
		System.out.println(soma);
		
		String novaFrase = Utilitarios.removerEspacos("Esta chovendo muito");
		
		System.out.println(novaFrase);
		
		System.out.println(Utilitarios.gerarEmail(" Lucas ", "Aragao "));
	}

}

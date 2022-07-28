package projeto9;

import

import

public class Proj9ClassesAbstratasUltilitarios1AppUltilitarios {
	
	public static void main(String[] args) {
		
		double soma = Utilitarios.somar(12, 15.6);
		System.out.println(soma);
		
		String novaFrase = Ultilitarios.removerEspacos("Esta chovendo muito");
		
		System.out.println(novaFrase);
		
		System.out.println(Ultilitarios.gerarEmail("Lucas, "Aragao"));
	}
	

}

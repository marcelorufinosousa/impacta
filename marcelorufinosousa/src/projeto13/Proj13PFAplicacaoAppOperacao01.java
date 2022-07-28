package projeto13;

public class Proj13PFAplicacaoAppOperacao01 {
public static int contarPalavras(String s) {
		

		String texto = s.trim();			
		String[] itens = texto.split(" ");
		int contador = 0;
		
		for (String elemento : itens) {				
			
			if(elemento.length() > 0)
			  contador++;				
		}
		
		return contador;	
		
	}

	public static void main(String[] args) {
		
		Operacao01 op1  = s -> s.length();			
		int retorno = op1.executar("Curso Java");		
		System.out.println("op1:" + retorno);
		

		Operacao01 op2 = s -> {

			String texto = s.trim();			
			String[] itens = texto.split(" ");
			int contador = 0;
			
			for (String elemento : itens) {				
				
				if(elemento.length() > 0)
				  contador++;				
			}
			return contador;		
		};
		
		String texto = "O curso de java   termina dia 14";		
		int resultado =  op2.executar(texto);		
		System.out.println("O texto possui: " + resultado);		
		System.out.println("o resultado é \"" + resultado + "\"" );
		
		Operacao01 op3 = s -> contarPalavras(s);
	    int resultado3 = op3.executar("Esse exemplo é mto comum");
	}

}

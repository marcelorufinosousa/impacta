package projeto11;

import

import


public class Proj11ArraysAplicacaoAppArray05 {
public static void main(String[] args) {
			
		
	    int quantidade = Integer.parseInt(  JOptionPane.
				     showInputDialog
				     ("Informe um quantidade de nomes"));
		
	    if(quantidade <= 0) {
	    	
	    	JOptionPane.showMessageDialog(null, 
	    			"A quantidade dever maior que zero!",
	    			"Erro",
	    			JOptionPane.ERROR_MESSAGE);
	    	
	    	return;	  
	    	
	    }
	    
	
	     String[] nomes = new String[quantidade];		
		
		for (int i = 0; i < nomes.length; i++) {		
			
			nomes[i] = 	JOptionPane. showInputDialog("Informe o nome " + (i+1));
		  
		}
		
		Arrays.sort(nomes);
		
				
		for( String nome_posicao_array : nomes) {	
			System.out.println(nome_posicao_array);			
		}	

	}

}

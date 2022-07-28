package projeto12;

import javax.swing.JOptionPane;

public class Proj12ExcecoesAplicacaoAppExcecoes05 {
	public static void main(String[] args) {

		try {

			String nome = JOptionPane.showInputDialog("Informe seu nome: ");
			JOptionPane.showMessageDialog(null, "Nome informado: " + nome.toUpperCase());

			int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));
			JOptionPane.showMessageDialog(null, "Idade informada: " + idade);

		} 				
			
		catch(Exception e) {
			
			 String classe = e.getClass().getSimpleName();
			
			 if( e instanceof NullPointerException) {
				 e.initCause(new NullPointerException("Referencias nulas não acessam métodos."));
			 }
			 
			 
			 e.printStackTrace();
			
			JOptionPane.showMessageDialog(null,
					  "Classe: " + classe + 		
					  "\nErro Geral: " + e.getMessage());
			
		}
		
		

	}

}

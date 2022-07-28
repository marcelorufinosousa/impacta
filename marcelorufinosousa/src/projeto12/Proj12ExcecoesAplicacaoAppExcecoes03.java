package projeto12;

import javax.swing.JOptionPane;

public class Proj12ExcecoesAplicacaoAppExcecoes03 {
	public static void main(String[] args) {

		try {

			String nome = JOptionPane.showInputDialog("Informe seu nome: ");
			JOptionPane.showMessageDialog(null, "Nome informado: " + nome.toUpperCase());

			int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));
			JOptionPane.showMessageDialog(null, "Idade informada: " + idade);

		} 
				
		catch (NumberFormatException e) {			
			JOptionPane.showMessageDialog(null, e.getMessage());			

		}
		catch(NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Erro: " +  e.getMessage());		

		}	
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Erro Geral: " +  e.getMessage());

			
		}
		
		

	}

}

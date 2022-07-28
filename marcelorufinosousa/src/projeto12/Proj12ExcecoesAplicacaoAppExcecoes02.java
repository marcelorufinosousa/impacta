package projeto12;

import javax.swing.JOptionPane;


public class Proj12ExcecoesAplicacaoAppExcecoes02 {
public static void main(String[] args) {
		
		try {

			String nome = JOptionPane.showInputDialog("Informe seu nome: ");
			JOptionPane.showMessageDialog(null, "Nome informado: " + nome.toUpperCase());

			int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));
			JOptionPane.showMessageDialog(null, "Idade informada: " + idade);

		} catch (NumberFormatException | NullPointerException  e) {			
			JOptionPane.showMessageDialog(null,"Erro: " + e.getMessage());			

		}
		

	}

}

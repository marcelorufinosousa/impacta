package projeto4;

import javax.swing.JOptionPane;

public class Ingressos {
	public static void main(String[] args) {
		
		/*
		 * Em um club, o valor do ingresso é cobrado de acordo
		 * com a idade.
		 * 
		 * Se a idade for menor que 18 anos : r$20,00
		 * Entre 18 e 59 anos : r$ 30,00
		 * Acima de 59 anos : r$ 15,00
		 */
		 
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual é a sua idade ?"));
		
		Double ingresso;
		
		if(idade < 18) {
			ingresso = (double) 20;
		}
		else if (idade > 59) {
			ingresso = (double) 15;
		}
		else {
			ingresso = (double) 30;
		}
		String resposta = "Idade: " + idade +
				          "\n Valor ingresso : " + ingresso;
		
		JOptionPane.showMessageDialog(null, resposta);
	}

}

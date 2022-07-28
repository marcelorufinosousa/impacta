package projeto4;

import javax.swing.JOptionPane;

public class ComandoFor02 {
	public static void main(String[] args) {
		
		int quantidade = Integer.parseInt(
		JOptionPane.showInputDialog("Quantas pessoas esta na sala?"));
						
		//variavel para receber a maior idade 
		int maior = 0;
		int posicao = 0;
		
		for (int i = 1; i <= quantidade; i++) {
			
		//pergunta sera repetida enquanto o for estiver sendo executado
			String pergunta = "Pessoa " + i +
					          "\n Qual a idade da pessoa " + i + "?";
			
		//idade vai receber um valor para cada	
		int idade = Integer.parseInt
				(JOptionPane.showInputDialog(pergunta));
		
		System.out.println("A idade atual: " + idade);
		//caso a idade atual for maior que a variavel de fora
		
		if(idade > maior) {
			
			maior = idade; //atualizamos a variavel de fora
			posicao = i; //posicao atual
		}
		
	}
		
		String resposta = "Maior idade: " + maior + 
				          "\n Pessoa: " + posicao;
		
		JOptionPane.showMessageDialog(null, resposta);
		}
		
	}



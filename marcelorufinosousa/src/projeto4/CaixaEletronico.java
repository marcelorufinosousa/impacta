package projeto4;

import javax.swing.JOptionPane;
public class CaixaEletronico {
	
	/*
	 * Em um caixa eletronico contem cedulas
	 * de: 50,20,10,05
	 * 
	 *  Com base no valor do saque, o caixa apresetada 
	 *  a quantidade de cedulas dispensadas, condirerando 
	 *  que as cedulas de maior valor sao liberadas primeiro.
	 */

	//Scanner valorsaque = new Scanner(System.in);
	//double valor = valorsaque.nextDouble();
	
	public static void main(String[] args) {
		
		//solicitar o valor do saque
		Double valor = Double.parseDouble(
				JOptionPane.showInputDialog("Qual o valor do saque?"));
		
		//obter o valor como sendo inteiro
		Double valorsaque = valor ; //typecast
		//analisando se o valor é multiplo de 5
		//condicao = analise se valorsaque 
		//nao tem resto 0 ao dividir por 5
		if(valorsaque % 5 != 0) {
			JOptionPane.showMessageDialog(null, "Valor invalido");
			return;
		}
		
		//toda variavel devem atribuir um valor 
		int qtde50, qtde20, qtde10, qtde5;
		qtde50 = qtde20 = qtde10 = qtde5 = 0;
		
		//qtde50 = 0;
		//qtde20 = 0;
		
		qtde50 = (int) (valorsaque/50); //1 nota de 50
		valor %= 50; //recebe o resto e atribui no valorsaque
		
		qtde20 = (int) (valorsaque/20); //1 nota de 20
		valorsaque %= 20;
		
		qtde10 = (int) (valorsaque/10);
		valorsaque %= 10;
		
		qtde5 = (int) (valorsaque/5);
		valorsaque %= 5;
		
		String resposta = "Valor do saque: " + valor +
				          "\n Notas de 50: " + qtde50 +
				          "\n Notas de 20: " + qtde20 +
				          "\n Notas de 10: " + qtde10+
				          "\n Notas de  5:"  + qtde5;
		
		JOptionPane.showMessageDialog(null, resposta);
		
		System.out.println(valor);
		
	}	
}

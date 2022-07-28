package projeto4;

import javax.swing.JOptionPane;

public class ComandoIf02 {
	public static void main(String[] args) {
		
		/*
		 * Funcionario tera um desconto de 10%
		 * SE o salario bruto for superior a 
		 * 5.000 R$.
		 * O desconto sera calculado sobre a 
		 * diferenca entre o valor do salario
		 * e o valor base de 5.000 r$.
		 */
		
		Double salario = Double.parseDouble(
				JOptionPane.showInputDialog("informe o salario"));
		
		Double desconto = (double) 0;
		
		if(salario > 5000) {
			desconto = (salario - 5000)* 10/100;
			}
		
		String resposta = "Salario bruto: " + salario +
				         "\nDesconto: " + desconto +
				         "\nSalario liquido: " + (salario - desconto);
		
		JOptionPane.showMessageDialog(null, resposta);
		
	}

}

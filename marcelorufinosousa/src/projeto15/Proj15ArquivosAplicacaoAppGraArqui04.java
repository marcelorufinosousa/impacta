package projeto15;

import java.io.FileWriter;

import javax.swing.JOptionPane;

import projeto6.Proj6SexoEnumeracoes.Sexo;

public class Proj15ArquivosAplicacaoAppGraArqui04 {public static void main(String[] args) {
	
	try {
	
		FileWriter  writer =  new 
		FileWriter
 ("C:\\Users\\virtual\\Documents\\Curso_Java\\Arquivos\\funcionarios.csv", true); 
		
			
		String nome = JOptionPane.showInputDialog("Nome do Funcionário");
		
	  	int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade do funcionário"));
		
		Sexo sexo = (Sexo)  JOptionPane.showInputDialog(
							null, 
							"Qual o sexo do funcionário?", 
							"Sexo", 
							JOptionPane.QUESTION_MESSAGE,
							null, 
							Sexo.values(), 
							null);
		
		String documento = JOptionPane.showInputDialog("CPF do funcionário");
		String cargo = JOptionPane.showInputDialog("Cargo do funcionário");			
		
		double salario  = Double.parseDouble(JOptionPane.showInputDialog("Salário do funcionário:"));

		StringBuilder sb = new StringBuilder();		
					
		sb.append(nome).append(";")
		  .append(idade).append(";")
		  .append(sexo).append(";")
		  .append(documento).append(";")
		  .append(cargo).append(";")
		  .append(salario).append("\n");
		
		  writer.write(sb.toString());
		  writer.close();			
		 
		  JOptionPane.showMessageDialog(null, "Dados gerados com sucesso!");
		
		
	} catch (Exception e) {
		JOptionPane.showMessageDialog(null, e.getMessage());
		
	}
	

}

}

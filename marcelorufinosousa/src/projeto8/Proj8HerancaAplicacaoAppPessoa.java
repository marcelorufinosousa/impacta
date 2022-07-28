package projeto8;

import javax.swing.JOptionPane;

import

import
import
import
import
import

public class Proj8HerancaAplicacaoAppPessoa {
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Lucas");
		pessoa.setIdade(28);
		pessoa.setSexo(sexo.MASCULINO);
		JOptionPane.showMessageDialog(null, pessoa.mostrar());
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Joel");
		funcionario.setIdade(29);
		funcionario.setSexo(Sexo.MASCULINO);
		funcionario.setCargo("Vendedor");
		funcionario.setSalario(5000);
		JOptionPane.showMessageDialog(null,funcionario.mostrar());
		
		Aluno aluno = new Aluno();
		aluno.setNome("Luana");
		aluno.setIdade(32);
		aluno.setSexo(Sexo.FEMININO);
		aluno.setMatricula(12345);
		
		
		JOptionPane.showMessageDialog(null, aluno.mostrar());
		
		
		
		
		
	}
	

}

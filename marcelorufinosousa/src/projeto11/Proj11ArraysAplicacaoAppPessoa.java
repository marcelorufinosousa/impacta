package projeto11;

import

import

import

import

import

import

public class Proj11ArraysAplicacaoAppPessoa {
public static void main(String[] args) {

		Pessoa funcionario = new Funcionario();
		funcionario.setNome("Joel");
		funcionario.setIdade(29);
		funcionario.setSexo(Sexo.MASCULINO);
		((Funcionario)funcionario).setCargo("Vendedor");
		((Funcionario)funcionario).setSalario(5000);
		JOptionPane.showMessageDialog(null,funcionario.mostrar());
		

		Pessoa aluno = new Aluno();
		aluno.setNome("Luana");
		aluno.setIdade(32);
		aluno.setSexo(Sexo.FEMININO);
		((Aluno)aluno).setMatricula(12345);

		
		((Aluno)aluno).setCurso( new Curso(222,"Java Programmer", 100,1000));
		JOptionPane.showMessageDialog(null,aluno.mostrar());
				
	}

}

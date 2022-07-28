package projeto12;

import javax.swing.JOptionPane;

import projeto10.Proj10InterfacesClassesFuncionarios.Funcionario;
import projeto6.Proj6PessoaClasse.Pessoa;
import projeto6.Proj6SexoEnumeracoes.Sexo;

public class Proj12ExcecoesAplicacaoAppPessoa {
public static void main(String[] args) {
		

		Pessoa funcionario = new Funcionario();
		funcionario.setNome("Joel");
		try {
			funcionario.setIdade(29);
		} catch (IllegalAccessException e) {			
			e.printStackTrace();
		}
		funcionario.setSexo(Sexo.MASCULINO);
		((Funcionario)funcionario).setCargo("Vendedor");
		((Funcionario)funcionario).setSalario(5000);
		JOptionPane.showMessageDialog(null,funcionario.mostrar());
		
		
		Pessoa aluno = new Aluno();
		aluno.setNome("Luana");
		try {
			aluno.setIdade(32);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		aluno.setSexo(Sexo.FEMININO);
		((Aluno)aluno).setMatricula(12345);
		

		((Aluno)aluno).setCurso( new Curso(222,"Java Programmer", 100,1000));
		JOptionPane.showMessageDialog(null,aluno.mostrar());
		
		
		
		
		
	}

}

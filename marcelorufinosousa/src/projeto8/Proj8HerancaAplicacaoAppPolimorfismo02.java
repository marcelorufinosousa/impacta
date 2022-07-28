package projeto8;

import javax.swing.JOptionPane;

import projeto6.Proj6PessoaClasse;
import projeto6.Proj6PessoaClasse.Pessoa;

import

import
import
import
import
import

public class Proj8HerancaAplicacaoAppPolimorfismo02 {
	public static void main(String[] args) {
		
		pessoa p1 = new Funcionario("Joel",29,Sexo.MASCULINO,"Dev",3500);
		
		Aluno p2 =  new Aluno("Lucas",28,Sexo.MASCULINO, 1234,
				new Curso(10,"C#", 40,500));
		
		mostrarPessoa(p1);
		mostrarPessoa(p2);
		
	}
	
	private static void mostrarPessoa(Pessoa p) {
		
		String nomeClasse = p.getClass().getSimpleName();
		String resposta = p.mostrar();
		
		JOptionPane.showMessageDialog(null, "Clase: "  + nomeClasse + 
				"\n" + resposta);
	}
	
}

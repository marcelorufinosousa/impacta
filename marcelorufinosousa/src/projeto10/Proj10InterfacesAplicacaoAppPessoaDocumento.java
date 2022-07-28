package projeto10;

import javax.swing.JOptionPane;

import projeto10.Proj10InterfacesClassesFuncionarios.Funcionario;
import projeto6.Proj6SexoEnumeracoes.Sexo;


public class Proj10InterfacesAplicacaoAppPessoaDocumento {
	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Lucas A");
		funcionario.setIdade(28);
		funcionario.setSexo(Sexo.MASCULINO);
		funcionario.setCargo("professor");
		funcionario.setSalario(50000);
		
		funcionario.setDocumento(new DocumentoCnpj("94574710001232"));
		 JOptionPane.showMessageDialog(null, funcionario.mostrar());
	}

}

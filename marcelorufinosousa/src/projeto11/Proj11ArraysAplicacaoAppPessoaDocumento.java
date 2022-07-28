package projeto11;

import

import

import

import

public class Proj11ArraysAplicacaoAppPessoaDocumento {
public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Lucas A");
		funcionario.setIdade(28);
		funcionario.setSexo(Sexo.MASCULINO);
		funcionario.setCargo("Professor");
		funcionario.setSalario(50000);
		
		funcionario.setDocumento( new DocumentoCnpj("94574710001232"));
		
		JOptionPane.showMessageDialog(null,
				funcionario.mostrar());
		
	}
	

}

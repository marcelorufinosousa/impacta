package projeto12;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import projeto10.Proj10InterfacesClassesFuncionarios.Funcionario;
import projeto6.Proj6SexoEnumeracoes.Sexo;

public class Proj12ExcecoesAplicacaoAppPessoaDocumento {
public static void main(String[] args) {
		
		try {
			
		    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			
			Funcionario funcionario = new Funcionario();
			funcionario.setNome("Lucas A");
			funcionario.setIdade(-15);
			funcionario.setSexo(Sexo.MASCULINO);
			funcionario.setCargo("Professor");
			funcionario.setSalario(50000);
			//funcionario.setDocumento( new DocumentoCpf("9457471000"));
			
			funcionario.setDocumento( new DocumentoCnpj("94574710001232"));
			
			JOptionPane.showMessageDialog(null,
					funcionario.mostrar());
		} catch (Exception e) {
			//e.printStackTrace();
			
			 JOptionPane.showMessageDialog(null, e.getMessage(),
					 "Erro", JOptionPane.ERROR_MESSAGE);
			
		}
		
	}

}

package projeto9;

import javax.swing.JOptionPane;

import

import


public class Proj9ClassesAbstratasAplicacaoAppProduto {

	public static void main(String[] args) {
		
		While(true){
			String cat = JOptionPane.showInputDialog("informe a categoria");
			String desc = JOptionPane.showInputDialog("informe a descricao");
			double preco = Double.parseDouble(JOptionPane.showInputDialog("informe o preco"));
			produto celular = new Produto(cat, desc, preco);
			System.out.println(celular.mostrar());
			JOptionPane.showMessageDialog(null, celular.mostrar());
			
			int opcao = JOptioPane.showConfirmDialog(null,"Deseja continuar?",
					"confirmação",JOptionPane.YES_NO_OPTION);
			
			if(opcao == JOptionPane.NO_OPTION) {
				break;
			}
		}
	}
}

package projeto7;

import javax.swing.JOptionPane;


public class Proj7AppProduto {
	public static void main(String[] args) {
		
		While (true) {
			String cat = JOptionPane.showInputDialog("Informe a categoria");
			String desc = JOptionPane.showInputDiaolog("Informe a descri��o");
			double preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o pre�o"));
			produto celular = new produto (cat, desc, preco);
			System.out.println(celular.mostrar());
			JOptionPane.showMessageDialog(null, celular.mostrar());
			
			int opcao = JOptionPane.showConfirmDialog(null,
					"Deseja continuar?", "Cpnfirma��o",JOptionPane.YES_NO_OPTION);
			
			if (Opcao == JOptionPane.NO_OPTION) {
				break;
			}
		}
	}

}

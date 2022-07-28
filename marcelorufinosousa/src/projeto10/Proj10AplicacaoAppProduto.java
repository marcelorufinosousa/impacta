package projeto10;

import javax.swing.JOptionPane;


public class Proj10AplicacaoAppProduto {
   public static void main(String[] args) {
	   
	   While(true){
		   String cat = JOptionPane.showInputDialog("informe a categoria");
		   String desc = JOptionPane.showInputDialog("informe a descrição");
		   double preco = Double.parseDouble(JOptionPane.showInputDialog("informe o preço"));
		   Produto celular = new Produto(cat, desc, preco);
		   System.out.println(celular.mostrar());
		   JOptionPane.showMessageDialog(null, celular.mostrar());
		   
		   int opcao = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirmação",
				   JOptionPane.YES_NO_OPTION){
			   break;
		   }
	   }
   }
	
}

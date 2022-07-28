package projeto6;

import javax.swing.JOptionPane;

import 

import

public class Proj6AppProdutoAplicacao {
	public static void main(String[] args) {
		
		Produto celular = new Produto();
		
		int cod = Integer.parseInt(JOptionPane.showInputDialog("Informe o codigo"));
		String cat = JOptionPane.showImputDialog("Informe a categoria");
		String desc = JOptionPane.showImputDialog("Informe a descricao");
		double preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o preco"));
		
		celular.setCodigo(cod);
		celular.setVategoria(cat);
		celular.setDescricao(desc);
		celular.setPreco(preco);
		
		System.out.println(celular.mostrar());
		JOptionPane.showMessageDialog(null, celular.mostrar());
	}
	

}

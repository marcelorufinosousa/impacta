package projeto8;

import javax.swing.JOptionPane;

import

import
import

public class Proj8HerancaAplicacaoAppPolimorfismo03 {
  public static void main(String[] args) {
	  
	  Produto prod = new Produto("Alimentação", "Batata frita", 50);
	  Produto prod2 = new ProdutoImportado("Transporte", "Bicicleta",2500,6.0);
	  
	  if(prod2 instanceof ProdutoImportado) {
		  ((ProdutoImportado)prod2).setTaxaImportacao(7.0);
		  
		  }
	  
	  JOptionPane.showMessageDialog(null, prod.mostrar());
	  JOptionPane.showMessageDialog(null, Prod2.mostrar());
	  }
}

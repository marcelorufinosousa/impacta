package projeto12;

import javax.swing.JOptionPane;

public class Proj12ExcecoesAplicacaoAppFiguras {
public static void main(String[] args) {
		
		Retangulo ret = new Retangulo(10,15);

				
		Circulo cir = new Circulo(5);

		JOptionPane.showMessageDialog(null, ret.apresentarFigura());
		JOptionPane.showMessageDialog(null, cir.apresentarFigura());
			
  }

}

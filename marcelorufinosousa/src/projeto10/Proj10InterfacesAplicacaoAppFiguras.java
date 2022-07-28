package projeto10;

import javax.swing.JOptionPane;




public class Proj10InterfacesAplicacaoAppFiguras {
	public static void main(String[] args) {
		
		Retangulo ret = new Retangulo();
		ret.setBase(10);
		ret.setAltura(15);
		
		Circulo cir = new Circulo();
		cir.setRaio(5);
		
		JOptionPane.showMessageDialog(null, ret.apresentarFigura());
		JOptionPane.showMessageDialog(null, cir.apresentarFigura());
	}

}

package projeto11;

import

import

import

public class Proj11ArraysAplicacaoAppFiguras {
public static void main(String[] args) {
		
		Retangulo ret = new Retangulo(10,15);
				
		Circulo cir = new Circulo(5);
		
		
		JOptionPane.showMessageDialog(null, ret.apresentarFigura());
		JOptionPane.showMessageDialog(null, cir.apresentarFigura());
		
	}

}

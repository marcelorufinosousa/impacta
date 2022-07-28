package projeto11;

import

import

import

import


public class Proj11ArraysAplicacaoAppArray07 {
public static void main(String[] args) {
		
		Figura[] figuras = new Figura[3];
		
		figuras[0] = new Retangulo(12,14);
		figuras[1] = new Circulo(20);
		figuras[2] = new Retangulo(1,1);
		
		for (Figura figura : figuras) {
			JOptionPane.showMessageDialog(null,
					figura.apresentarFigura());
		}
		
	}
}

package projeto9;

import javax.swing.JOptionPane;

import

import

import

import

public class Proj9ClassesAbstratasAplicacaoAppFigura {
	
	public static void main(String[] args) {
		
		Retangulo ret = new Retangulo();
		ret.setBase(10);
		ret.Altura(15);
		
		Circulo cir = new Circulo();
		cir.setRaio(5);
		
		apresentarFigura(ret);
		apresentarFigura(cir);
		
	}
	private static void apresentarFigura(Figura figura) {
		String resposta = "Classe; " + figura.getClass().getSimpleName()+
				                        "\n Area: " + figura.calcularArea();
		JOptionPane.showMessageDialog(null, resposta);
	}

}

package projeto9;

import javax.swing.JOptionPane;

import

import

public class Proj9ClassesAbstratasAplicacaoAppAutomovel01 {
	public static void main(String[] args) {
		
		Automovel auto = new Automovel("Honda","Civic");
		JOptionPane.showMessageDialog(null, auto.mostrar());
		
		Automovel auto2 = new Automovel("Ford","Fusion", 2019);
		JOptionPane.showMessageDialog(null, auto2.mostrar());
		
		Automovel auto3 = new Automovel("Vw","Fusca",1970,"BCB2314");
		JOptionPane.showMessageDialog(null, auto3.mostrar());
	}

}

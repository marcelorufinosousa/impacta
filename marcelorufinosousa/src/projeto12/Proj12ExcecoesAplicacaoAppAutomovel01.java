package projeto12;

import javax.swing.JOptionPane;

import projeto5.Proj5Automovel.Automovel;

public class Proj12ExcecoesAplicacaoAppAutomovel01 {
     public static void main(String[] args) {
		
		Automovel auto = new Automovel("Honda","Civic");		
		JOptionPane.showMessageDialog(null,auto.mostrar());
		
		Automovel auto2 = new Automovel("Ford", "Fusion", 2019);
		JOptionPane.showMessageDialog(null,auto2.mostrar());
		
		Automovel auto3 = new Automovel("VW", "Fusca", 1970, "BCB3214");
		JOptionPane.showMessageDialog(null,auto3.mostrar());		
	}

}

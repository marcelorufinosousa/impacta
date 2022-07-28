package projeto6;

import javax.swing.JOptionPane;

import

import 

public class Proj6AppAutomovel01Aplicacao {
	public static void main(String[] args) {
		
		Automovel auto = new Automovel();
		auto.lerdados("Honda","Civic",2020,"EBB1234");
		
		String texto = auto.mostrar();
		System.out.println(texto);
		
		JOptionPane.showMessageDialog(null, auto.mostrar());
		
		JOptionPane.showMessageDialog(null, auto.mostrar());
		
		Integer j = null,
	}
	

}

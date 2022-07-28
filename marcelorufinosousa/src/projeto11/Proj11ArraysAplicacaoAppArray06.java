package projeto11;

import

import

import

public class Proj11ArraysAplicacaoAppArray06 {
public static void main(String[] args) {
		
		Automovel[] automoveis = new Automovel[3];
		
		automoveis[0] = new Automovel("VW","Fusca", 1972,"BBC1984");
		automoveis[1] = new Automovel("VW","Kombi", 1980,"CDV8874");
		automoveis[2] = new Automovel("Hyundai","Creta", 2022,"FFJ1963");
		
		Arrays.sort(automoveis);
		
		
		for (Automovel automovel : automoveis) {
			JOptionPane.showMessageDialog(null, automovel.mostrar());
		}

	}

}

package projeto6;

import

import

public class Proj6AppAutomovel02Aplicacao {
   public static void main(String[] args) {
	   
	   Automovel auto1 = new Automovel();
	   auto1.lerdados("Honda","Civic",2021,"EBX1234");
	   Automovel auto2 = auto1;
	   auto1 = null;
	   
	   auto2.setano(2022);
	   JOptioPane.showMessageDialog(null, auto1.mostrar());
   }
	
}

package projeto8;

import javax.swing.JOptionPane;

import

import
import
import
import
import

public class Proj8HerancaAplicacaoAppPolimorfismo01 {
   public static void main(String[] args) {	
	   
	   Pessoa p1 = new Funcionario("Joel",29,Sexo.MASCULINO,"Dev",3500);
	   JOptionPane.showMessageDialog(null, p1.mostrar());
	   
	   p1 = new Aluno("Lucas",28,Sexo.MASCULINO,1234,
			   new curso(10,"c#",40,500));
	   
	   JOptionPane.showMessageDialog(null, p1.mostrar());
   }
	
	
}

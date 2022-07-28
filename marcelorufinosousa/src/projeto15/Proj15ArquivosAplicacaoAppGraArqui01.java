package projeto15;

import java.io.FileWriter;

import javax.swing.JOptionPane;

public class Proj15ArquivosAplicacaoAppGraArqui01 {
public static void main(String[] args) {
		
		try {
	
			FileWriter  writer = 
					new FileWriter("C:\\Users\\virtual\\Documents\\Curso_Java\\Arquivos\\arquivo1.txt"); 
			
			
		  String texto = JOptionPane.showInputDialog("Escreva um texto: ");
		  writer.write(texto);
	      writer.close();		
		  
	      JOptionPane.showMessageDialog(null, "Arquivo criado com sucesso!");
		  	
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			
		}
	
	}

}

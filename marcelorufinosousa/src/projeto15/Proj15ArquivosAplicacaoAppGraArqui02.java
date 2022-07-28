package projeto15;

import java.io.FileWriter;

import javax.swing.JOptionPane;

public class Proj15ArquivosAplicacaoAppGraArqui02 {
	public static void main(String[] args) {
		try {
		
			FileWriter  writer = 
 new FileWriter("C:\\Users\\virtual\\Documents\\Curso_Java\\Arquivos\\nomes.txt", true); 
			
			
		  String texto = JOptionPane.showInputDialog("Escreva um nome: ");
		  writer.write(texto + "\r\n");
	      writer.close();		
		  
	      JOptionPane.showMessageDialog(null, "Arquivo criado com sucesso!");
		 
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			
		}
	}

}

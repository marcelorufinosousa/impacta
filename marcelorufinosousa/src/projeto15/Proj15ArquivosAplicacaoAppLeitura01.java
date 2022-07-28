package projeto15;

import java.io.FileReader;

import javax.swing.JOptionPane;

public class Proj15ArquivosAplicacaoAppLeitura01 {
public static void main(String[] args) {
		
		try {
			
			
			FileReader  reader = 
    new FileReader("C:\\Users\\virtual\\Documents\\Curso_Java\\Arquivos\\nomes.txt"); 
					
			String arquivo = "";
			
			while(true) {
				
				int caractere = reader.read(); 
				System.out.println(caractere);
				
				if(caractere == -1)
					break;
				
				
				char ch = (char)caractere;
				arquivo += ch;				
			}
			
			
			System.out.println(arquivo);
			reader.close();	
				
			
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
		
		
	}

}

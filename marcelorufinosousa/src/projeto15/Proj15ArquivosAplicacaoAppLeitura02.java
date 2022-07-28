package projeto15;

import java.io.FileReader;

import javax.swing.JOptionPane;

public class Proj15ArquivosAplicacaoAppLeitura02 {
public static void main(String[] args) {
		
		try {
			
	
			FileReader  reader = 
    new FileReader("C:\\Users\\virtual\\Documents\\Curso_Java\\Arquivos\\nomes.txt"); 
		
			StringBuilder sb = new StringBuilder();		
			
			while(true) {
				
				int caractere = reader.read(); 
		
				if(caractere == -1)
					break;
				
				char ch = (char)caractere;
				sb.append(ch);				
			}
			
			
			System.out.println(sb);
			reader.close();	
				
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
	}

}

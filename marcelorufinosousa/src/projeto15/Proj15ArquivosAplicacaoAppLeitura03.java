package projeto15;

import java.io.FileReader;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Proj15ArquivosAplicacaoAppLeitura03 {
	public static void main(String[] args) {
		
		try {
				
				    JFileChooser chooser = new JFileChooser();
				   
				    if( chooser.showOpenDialog(null) == JFileChooser.CANCEL_OPTION) {
				    	return;
				    }	
			
				
					FileReader  reader =  new FileReader(chooser.getSelectedFile()); 
				
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

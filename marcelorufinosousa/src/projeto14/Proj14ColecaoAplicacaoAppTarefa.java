package projeto14;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

public class Proj14ColecaoAplicacaoAppTarefa {
public static void main(String[] args) {
		
		try {
		
			Date data = new  Date();
		
			String sdata = JOptionPane.showInputDialog("Informe uma data (dd/mm/aaaa)");

			DateFormat dt = new  SimpleDateFormat("dd/MM/yyyy");
			Date dataUser = dt.parse(sdata);
	
				
			Tarefa t1= new Tarefa(new Date(),"Gerar Relatório", 10);
			Tarefa t2= new Tarefa(dataUser,"Imprimir recibo NF", 5);
			
			System.out.println(t1);
			System.out.println(t2);
			
		}  catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}

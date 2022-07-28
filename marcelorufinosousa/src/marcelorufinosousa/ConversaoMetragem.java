package marcelorufinosousa;

import java.util.Scanner;
public class ConversaoMetragem {
	
	//Metros para kilometros
	//metros para Milimetros
	
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		double metro, kilometro, milimetro;
		System.out.println("Insira a quantidade de metros : ");
		metro = teclado.nextDouble();
		kilometro = metro / 1000;
		milimetro = metro * 1000;
		System.out.println("kilometro : " + kilometro);
		System.out.println("milimetros : " + milimetro);
		
		
	}

}

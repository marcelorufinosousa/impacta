package marcelorufinosousa;

import java.util.Scanner;
public class CelsiusFahrenheit {
	
	static double conversaocelsiusfahrenheit (double c) {
		return 9 * c / 5 + 32;
	}
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um numero em celsius: ");
		double celsius = leitor.nextInt();
		System.out.println("O numero convertido em fahrenheit é: ");
		System.out.println(conversaocelsiusfahrenheit(celsius));
		
	}

}

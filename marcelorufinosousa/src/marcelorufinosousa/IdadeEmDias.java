package marcelorufinosousa;

import java.util.Scanner;

public class IdadeEmDias {
	public static void main(String[] args) {
		int anos, meses, dias;
		int idadeemdias;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a idade em anos: ");
		anos = leitor.nextInt();
		System.out.println("Digite a idade em meses ");
		meses = leitor.nextInt();
		System.out.println("Digite a idade em dias: ");
		dias = leitor.nextInt();
		
		idadeemdias = anos * 365 + meses * 30 + dias;
		System.out.println("Idade em dias: " + idadeemdias);
		
	}

}

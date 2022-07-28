package projeto16;

public class Proj16ThreadsAplicacaoAppProcesso03 {
public static void main(String[] args) {
		
		Processo03 p3 = new Processo03();
		Thread t = new Thread(p3);
		t.start();
		
		System.out.println("Total é igual a :" + p3.total);
		
		
		
	}

}

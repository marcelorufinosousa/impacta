package projeto16;

public class Proj16ThreadsAplicacaoAppPessoa04 {
public static void main(String[] args) {
		
		Processo04 proc = new Processo04();
		Thread t = new Thread(proc);
		t.start();
		
		synchronized(t) {
			
			try {
				
				System.out.println("Estou esperando...");
		
				t.wait();
				
			} catch (Exception e) {
				
			}
			
					
			System.out.println("Total é igual a :" + proc.total);
			
		}
		
	}

}

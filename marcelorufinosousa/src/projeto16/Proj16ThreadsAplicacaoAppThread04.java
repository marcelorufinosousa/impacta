package projeto16;

public class Proj16ThreadsAplicacaoAppThread04 {
	public static void main(String[] args) {
		
		 
		Thread  t = new Thread(				
				   () -> {					   
					   System.out.println("Nome da Thread: " 
					   + Thread.currentThread().getName());	
				   }				
				);
		
		//iniciar		
		t.start();	
				

	}

}

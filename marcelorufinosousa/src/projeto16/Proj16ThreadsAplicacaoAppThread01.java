package projeto16;

public class Proj16ThreadsAplicacaoAppThread01 {
public static void main(String[] args) {
		
		try {
					
			 ContadorThread t1 = new ContadorThread();
	      		t1.start();  

              for (int i = 0; i < 20; i++) {
	    		 
	    		 System.out.print(".");
	    		 Thread.sleep(500);   
			    }

		} catch (Exception e) {
			// TODO: handle exception
		}		

	}

}

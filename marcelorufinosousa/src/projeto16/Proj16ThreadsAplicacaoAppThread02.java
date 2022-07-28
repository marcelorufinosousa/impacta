package projeto16;

public class Proj16ThreadsAplicacaoAppThread02 {
public static void main(String[] args) {
	
		Processo01 p = new Processo01();
		
		Thread t1 = new Thread(p);
		t1.start();	
		
		
	}

}

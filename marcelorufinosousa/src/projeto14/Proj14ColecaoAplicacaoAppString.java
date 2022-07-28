package projeto14;

public class Proj14ColecaoAplicacaoAppString {
public static void main(String[] args) {
		
		String s1 = "Java";
		String s2 = "Java";
		
		System.out.println("s1 == s2 ?" + (s1 == s2));
				
		
		
		String s3 = new String("Java");
		String s4 = new String("Java");
		
		System.out.println("s3 == s4 ?" + (s3 == s4));
	
		
		System.out.println("s3 == s4 ?" + s3.equals(s4));
		
		Curso c1 = new Curso(100, "PHP", 100,1200);
		Curso c2 = new Curso(100, "PHP", 100,1200);
		
		System.out.println("c1 == c2? " + (c1 == c2));
		System.out.println("c1.equals(c2)? " + (c1.equals(c2)));
			
	}

}

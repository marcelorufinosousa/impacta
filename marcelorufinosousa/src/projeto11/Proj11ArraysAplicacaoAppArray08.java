package projeto11;

import

import

import

import

import

public class Proj11ArraysAplicacaoAppArray08 {
	public static void main(String[] args) {
			
		int quantidade = parseInt
				(showInputDialog("Informe a quantidade de cursos: "));
		
		 
		Curso[] cursos = new Curso[quantidade];
		
	
		for (int i = 0; i < cursos.length; i++) {	
			
			
			int codigo = parseInt(
					showInputDialog
					("Informe o codigo do curso " + (i + 1)));
			
			
			String descricao = showInputDialog
					("Descri��o do curso :" + (i + 1));
			
			int ch = parseInt(
					showInputDialog
					("Carga hor�ria do curso " + (i + 1)));
			
			double preco = parseDouble(
					showInputDialog
					("Pre�o do curso " + (i + 1)));
			
			cursos[i] = new Curso(codigo, descricao,ch,preco);
			
		}
		
		Arrays.sort(cursos);

		for (Curso curso : cursos) {
			System.out.println(curso.mostrar());
			System.out.println();
		}
		

	}

}

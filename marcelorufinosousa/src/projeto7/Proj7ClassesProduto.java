package projeto7;

public class Proj7ClassesProduto {
	
	private final int codigo;
	private String categoria;
	private String descricao;
	private double preco;
	
	private static int contador = 1;
	
	public Produto(String categoria, String descricao, double preco) {
		this.codigo = contador++;
		this.setCategoria(categoria);
		this.setDescricao(descricao);
		this.setPreco(preco);
	}
	public int getCodigo() {
		return codigo;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public String mostrar() {
		
		return "\n Codigo: " + this.getCodigo() +
				"\n Descrição: " + this.getCategoria() +
				"\n Categoria: " + this.getCategoria() +
				"\n Preco: "     + this.getPreco();
	}

}

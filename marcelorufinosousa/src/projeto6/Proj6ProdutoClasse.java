package projeto6;

public class Proj6ProdutoClasse {
	
	public class produto{
		private int codigo;
		private String categoria;
		private String descricao;
		private Double preco;
		public int getCodigo() {
			return codigo;
		}
		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}
		public String getCategoria() {
			return categoria;
		}
		public void setCategoria(String categoria) {
			this.categoria = categoria;
		}
		public String getDescricao() {
			return descricao = descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		public double getpreco() {
			return preco;
		}
		public void setPreco(double preco) {
			this.preco = preco;
		}
		public String mostrar() {
			
			return "Codigo: " + this.getCodigo() +
				   "\n Descricao: " + this.getDescricao() +
				   "\n Categoria: " + this.getCategoria() +
				   "\n Preco: " + this.getpreco();
		}
	}

}

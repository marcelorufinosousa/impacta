package projeto8;

public class Proj8HerancaClassesCurso {
	
	private int codigo;
	private String descricao;
	private int cargaHoraria;
	private double preco;
	
	public Curso(int codigo, String descricao, int cargaHoraria, double preco) {
		super();
		this.setCodigo(codigo);
		this.setDescricao(descricao);
		this.setCargaHoraria(cargaHoraria);
		this.setPreco(preco);
	}
	
	public String mostrar() {
		return "codigo: " + this.getCodigo()+
				        "\n Descricao: " + this.getDescricao() +
				        "\n Carga Horaria: " + this.getCargaHoraria()+
				        "\n Preco: " + this.getPreco();
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao() {
		return Descricao;
	}
	public int getCargaHoraria() {
		return CargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}

}

package projeto6;

public class Proj6AutomovelClasses {
	
	public Static final String PAIS_ORIGEM = "Brasil";
	
	private String marca;
	private String modelo;
	private int ano;
	private String placa;
	
	public String mostrar() {
		
		String titulo = "DADOS AO AUTOMOVEL";
		
		String resposta = titulo + "\n Marca: " + this.getMarca() +
				                   "\n Modelo: " + this.getModelo() +
				                   "\n Ano: " + this.getAno() +
				                   "\n Pais Origem: " + PAIS_ORIGEM +
				                   "\n Placa: " + this.getplaca();
		
		return resposta;
		
	}

	public void lerDados(String marca, String modelo, int ano, String placa) {
		
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setAno(ano);
		this.setplaca(placa);
		
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return this.ano;
	}
	public void setAno(int ano) {
		if(ano < 1970) {
			throw new NumbeFormatException("O ano nao pode ser menor que 1970.");
		}
		this.ano = ano;
	}
	public String getplaca() {
		return placa;
	}
	public void setplaca(String placa) {
		this.placa = placa;
	}
}

package projeto8;

public class Proj8HerancaClassesAutomovel {

	public static final String PAIS_ORIGEM = "Brasil";
	
	private String marca;
	private String modelo;
	private int ano;
	private String placa;
	private final int chassi;
	
	public Automovel(String marca, String modelo) {
		
		this.chassi = (int)(Math.random()*1000);
		this.setMarca(marca);
		this.setModelo(modelo);	
		}
	
	public Automovel(String marca,String modelo, int ano, String placa) {
		
		this(marca,modelo);
		this.setPlaca(placa);
	}
	
	public String mostrar() {
		
		String titulo ="DADOS DO AUTOMOVEL";
		
		String resposta = titulo + "\n Marca: " + this.getMarca()+
				                   "\n Modelo: " + this.getModelo()+
				                   "\n Chassi: " + this.getChassi();
		
		if(this.getAno() > 0) {
			resposta +="\n Ano: " + this.getAno();
		}
		
		if(this.getPlaca() != null) {
			resposta += "\n placa: " + this.getPlaca()
		}
		resposta += "\n Pais Origem: " + PAIS_ORIGEM;
		return resposta;	
	}
	public String mostrar(String titulo) {
		
		String resposta = titulo + "\n Marca: " + this.getMarca() +
				                   "\n Modelo: " + this.getModelo() +
				                   "\n Chassi: " + this.getChassi() +
				                   "\n Ano: " + this.getAno()+
				                   "\n Pais Origem: " + PAIS_ORIGEM +
				                   "\n Placa: " + this.getPlaca();
		return resposta;
	}
	public int getChassi() {
		return chassi;
	}
	public void LerDados(String marca, String modelo, int ano, String placa) {
		
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setAno(ano);
		this.setPlaca(placa);
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
			throw new NumberFormatException("O ano não pode ser menor que 1970");
		}
		this.ano = ano;
	}
	public String getPlaca() {
		this.placa = placa;
	}
}

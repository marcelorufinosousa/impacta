package projeto16;

public class Automovel implements Comparable<Automovel> {

	public static final String PAIS_ORIGEM = "Brasil";
	
	//atributos.
	private	String	marca;  
	private	String modelo;
	private	int ano;
	private	String placa;
	
	private final int chassi;
	
	
	//construtores
	public Automovel(String marca, String modelo) {			
		this.chassi = (int)(Math.random() *1000);
		this.setMarca(marca);
		this.setModelo(modelo);	
	}
	
	public Automovel(String marca, String modelo, int ano) {
		this(marca,modelo);	
		this.setAno(ano);
			
	}	
	
	public Automovel(String marca, String modelo, int ano, String placa) {
		this(marca,modelo,ano);
		this.setPlaca(placa);
	}

	
	public String mostrar() {	
		
		String titulo = "DADOS DO AUTOMÓVEL";
		
		String reposta = titulo +  "\n\nMarca: " + this.getMarca() + 
				         "\nModelo: " + this.getModelo() +
				         "\nChassi:" + this.getChassi();
				        
		
		if(this.getAno() > 0) {
			
			reposta += "\nAno: " + this.getAno();
		}
		
		if(this.getPlaca() != null) {
			
			reposta += "\nPlaca: " + this.getPlaca();
		}
		
		reposta +=  "\nPais Origem: " + PAIS_ORIGEM;
		
		
		return reposta;
		
	}
	
   public String mostrar(String titulo) {	
		
		
		String reposta = titulo +  "\n\nMarca: " + this.getMarca() + 
				         "\nModelo: " + this.getModelo() +				         
				         "\nChassi:" + this.getChassi() + 
				         "\nAno: " + this.getAno() +
				         "\nPais Origem: " + PAIS_ORIGEM + 
				         "\nPlaca: " + this.getPlaca();		
		
		return reposta;
		
	}

	
   public int getChassi() {
		return chassi;
	}
	
	public void lerDados(String marca, String modelo, int ano, String placa ) {
	
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
			throw new NumberFormatException("O ano não pode ser menor que 1970.");
		}
		
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	@Override
	public int compareTo(Automovel auto) {
		
		
		if(this.getMarca().compareTo(auto.getMarca()) == 0) {
			return this.getModelo().compareTo(auto.getModelo());
		}
		
		
		return this.getMarca().compareTo(auto.getMarca());
		
		
	}

}

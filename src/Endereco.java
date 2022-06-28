
public class Endereco {
	
	private String rua;
	private String numero;
	private String cep;
	private String bairro;
	
	
	public Endereco(String rua, String numero, String cep, String bairro) {
		super();
		this.rua = rua;
		this.numero = numero;
		this.cep = cep;
		this.bairro = bairro;
	}


	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", numero=" + numero + ", cep=" + cep + ", bairro=" + bairro + "]";
	}
	
	
}


public abstract class Pessoa {
	
	protected String nome;
	protected String cpf;
	protected Endereco endereco;
	
	
	public Pessoa(String nome, String cpf, Endereco endereco) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}


	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + "]";
	}
	
	

}

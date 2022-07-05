
public class Cliente extends Pessoa{
	
	private String idCliente;

	//teste
	public Cliente(String nome, String cpf, Endereco endereco, String idCliente) {
		super(nome, cpf, endereco);
		this.idCliente = idCliente;
	}


	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + "]";
	}
	
	
	
}


public class Funcionario extends Pessoa {

	private String setor;
	private float salario;
	
	
	public Funcionario(String nome, String cpf, Endereco endereco, String setor, float salario) {
		super(nome, cpf, endereco);
		this.setor = setor;
		this.salario = salario;
	}
	
	public void setSalario(float salario) {
		this.salario = salario;
	}

	
	@Override
	public String toString() {
		return "Funcionario [setor=" + setor + ", salario=" + salario + "]";
	}



}

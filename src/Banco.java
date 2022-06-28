
import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private List<Funcionario> funcionarios;
	private List <Conta> contas;	
	
	public Banco() {
		super();
		this.funcionarios = new ArrayList<Funcionario>();
		this.contas = new ArrayList<Conta>();
	}

	
	
	@Override
	public String toString() {
		return "Banco [funcionarios=" + funcionarios + ", contas=" + contas + "]";
	}
	

}

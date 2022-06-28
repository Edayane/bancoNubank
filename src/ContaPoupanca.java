import java.util.List;

public class ContaPoupanca extends Conta{

	private int taxaRendimento;
	
	public ContaPoupanca(List<Cliente> clientes, String agencia, String numero, float saldo, int taxaRendimento) {
		super(clientes, agencia, numero, saldo);
		this.taxaRendimento = taxaRendimento;
	}


	private int verRendimento() {
		return taxaRendimento;
	}
	
	
	@Override
	public void sacar(float valor) {
		saldo = saldo - valor + taxaRendimento;
	}

	@Override
	public void depositar(float valor) {
		saldo = saldo + valor + taxaRendimento ;
	}

	@Override
	public float verSaldo() {
		return saldo + taxaRendimento;
	}

	@Override
	public void transferir(float valor) {
		saldo = saldo - valor + taxaRendimento;
	}

}

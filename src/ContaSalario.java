import java.util.List;

public class ContaSalario extends Conta{

	public int limiteDeposito;

	
	public ContaSalario(List<Cliente> clientes, String agencia, String numero, float saldo, int limiteDeposito) {
		super(clientes, agencia, numero, saldo);
		this.limiteDeposito = limiteDeposito;
	}
	
	public int verLimiteDeposito() {
		return limiteDeposito;
	}

	@Override
	public void sacar(float valor) {
		saldo = saldo - valor;
	}

	@Override
	public void depositar(float valor) {
		saldo = saldo + valor;
	}

	@Override
	public float verSaldo() {
		return saldo;
	}

	@Override
	public void transferir(float valor) {
		saldo = saldo - valor;
	}
		
	
	
}

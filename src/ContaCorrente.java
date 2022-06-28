import java.util.List;

public class ContaCorrente extends Conta {
	
	private int taxaAdmin;
	private int valorLimiteChequeEspecial;
	private int valorUsoChequeEspecial;
	
	
	public ContaCorrente(List<Cliente> clientes, String agencia, String numero, float saldo, int taxaAdmin,
			int valorLimiteChequeEspecial, int valorUsoChequeEspecial) {
		super(clientes, agencia, numero, saldo);
		
		this.taxaAdmin = taxaAdmin;
		this.valorLimiteChequeEspecial = valorLimiteChequeEspecial;
		this.valorUsoChequeEspecial = valorUsoChequeEspecial;
	}
	public int verSaldoChequeEspecial() {
		return valorLimiteChequeEspecial - valorUsoChequeEspecial;
	}
	

	@Override
	public void sacar(float valor) {
		saldo = saldo - valor - taxaAdmin;
	}

	@Override
	public void depositar(float valor) {
		saldo = saldo + valor - taxaAdmin;
	}

	@Override
	public float verSaldo() {
		return saldo - taxaAdmin;
	}

	@Override
	public void transferir(float valor) {
		saldo = saldo - valor - taxaAdmin;
	}
		

}

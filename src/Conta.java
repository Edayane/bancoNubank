
import java.util.List;

public abstract class Conta implements BancoInterface {

	protected List<Cliente>clientes;
	protected String agencia;
	protected String numero;
	protected float saldo;
	
	
	public Conta(List<Cliente> clientes, String agencia, String numero, float saldo) {
		super();
		this.clientes = clientes;
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}
	

	@Override
	public abstract void sacar(float valor); {	
	}

	@Override
	public abstract void depositar(float valor); {
	}

	@Override
	public abstract float verSaldo(); {		
	}

	@Override
	public abstract void transferir(float valor); {
	}


	@Override
	public String toString() {
		return "Conta [clientes=" + clientes + ", agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + "]";
	}
	
	

}

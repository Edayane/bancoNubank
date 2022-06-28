import java.util.List;
import java.util.Scanner;

public class MainMenu {
	
    static Scanner teclado = new Scanner(System.in);
    static BancoDeDados bd  = new BancoDeDados();
	
    public static void main(String[] args) {
		
	while(true) {
		System.out.println("********************************************************************");
		System.out.println("**************   Sistema do Banco Nubank   *************************");
        System.out.println("************************  MENU   ***********************************");
        System.out.println("********************************************************************");
        System.out.println("|******* Opção 01- Cadastrar Funcionário **************************|");
        System.out.println("|******* Opção 02- Cadastrar Cliente ******************************|");
        System.out.println("|******* Opção 03- Cadastrar conta salário   **********************|");
        System.out.println("|******* Opção 04- Cadastrar Conta Corrente ***********************|");
        System.out.println("|******* Opção 05- Cadastrar Conta Poupança ***********************|");
        System.out.println("|******* Opção 06- Realizar um saque ******************************|");
        System.out.println("|******* Opção 07- Listar Clientes ********************************|");
        System.out.println("|******* Opção 08- Listar Funcionários ****************************|");
        System.out.println("|******* Opção 09- Listar Contas **********************************|");
        System.out.println("|******* Opção 10- Realizar uma transferência *********************|");
        System.out.println("|******* Opção 11- Realizar um deposito ***************************|");
        System.out.println("|******* Opção 12- Sair do Sistema  *******************************|");
        System.out.println("********************************************************************");
        System.out.println("");

			
        System.out.println("Escolha uma Opção do Menu: ");
		int op = teclado.nextInt();
			
        if(op == 12 ) {
        	System.out.println("Sistema encerrado");
            break;
		}
			
		switch (op) {
		case 1: {
			cadastrarFuncionario();
            break;
		}
		case 2: {
			cadastrarCliente();
            break;
        }
		case 3: {
            cadastrarContaSalario();
            break;
        }
        case 4: {
            cadastrarContaCorrente();
            break;
        }
        case 5: {
            cadastrarContaPoupanca();
            break;
        }
        case 6: {
            realizarSaque();
            break;
        }
        case 7: {
            listarClientes();
            break;
        }
        case 8: {
            listarFuncionarios();
            break;
        }
        case 9: {
            listarContas();
            break;
        }
        case 10: {
            realizarTransferencia();
            break;
        }
        case 11: {
            realizarDeposito();
            break;
        }
        default:
            System.err.println("Opção inválida, favor escolher outra\n\n\n\n");
            break;			
		}				

	}	
}
     
    private static void cadastrarContaSalario() {
    	
    	
    	
    	
    	
    	
    	ContaSalario(List<Cliente> clientes, String agencia, String numero, float saldo, int limiteDeposito)
		
	}

	private static void cadastrarCliente() {
    	System.out.println("Digite o nome do Cliente: ");
    	String nome = teclado.next();
        System.out.println("Digite o CPF do Cliente: ");
        String cpf = teclado.next();
        Endereco end1 = cadastrarEndereco();
        System.out.println("Digite o Id do Cliente: ");
        String idCliente = teclado.next();
        
	
        Cliente c1 = new Cliente(nome, cpf, end1, idCliente);
		
        bd.gravarPassoa(c1);
        System.out.println("Cliente Gravado com Sucesso!\n\n\n\n");	
    	
	}

	private static Endereco cadastrarEndereco() {
    	System.out.println("Digite o nome da rua: ");
    	String rua = teclado.next();
    	System.out.println("Digite o numero da residência: ");
    	String numero = teclado.next();
    	System.out.println("Digite o CEP da rua: ");
    	String cep = teclado.next();
    	System.out.println("Digite o bairro: ");
    	String bairro = teclado.next();
    	
    	Endereco end1 = new Endereco(rua, numero, cep, bairro);
    	return end1;
    }

    private static void cadastrarFuncionario(){
    	System.out.println("Digite o nome do funcionário: ");
    	String nome = teclado.next();
        System.out.println("Digite o CPF do funcionário: ");
        String cpf = teclado.next();
        Endereco end = cadastrarEndereco();
        System.out.println("Digite o nome do setor do funcionário: ");
        String setor = teclado.next();
        System.out.println("Digite o salário do funcionário: ");
        float salario = teclado.nextFloat();
	
        Funcionario f1 = new Funcionario(nome, cpf, end, setor, salario);
		
        bd.gravarPassoa(f1);
        System.out.println("Funcionário Gravado com Sucesso!\n\n\n\n");
        
    }
    
    
    
    
}




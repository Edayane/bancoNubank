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
        System.out.println("|******* Op��o 01- Cadastrar Funcion�rio **************************|");
        System.out.println("|******* Op��o 02- Cadastrar Cliente ******************************|");
        System.out.println("|******* Op��o 03- Cadastrar conta sal�rio   **********************|");
        System.out.println("|******* Op��o 04- Cadastrar Conta Corrente ***********************|");
        System.out.println("|******* Op��o 05- Cadastrar Conta Poupan�a ***********************|");
        System.out.println("|******* Op��o 06- Realizar um saque ******************************|");
        System.out.println("|******* Op��o 07- Listar Clientes ********************************|");
        System.out.println("|******* Op��o 08- Listar Funcion�rios ****************************|");
        System.out.println("|******* Op��o 09- Listar Contas **********************************|");
        System.out.println("|******* Op��o 10- Realizar uma transfer�ncia *********************|");
        System.out.println("|******* Op��o 11- Realizar um deposito ***************************|");
        System.out.println("|******* Op��o 12- Sair do Sistema  *******************************|");
        System.out.println("********************************************************************");
        System.out.println("");

			
        System.out.println("Escolha uma Op��o do Menu: ");
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
            System.err.println("Op��o inv�lida, favor escolher outra\n\n\n\n");
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
    	System.out.println("Digite o numero da resid�ncia: ");
    	String numero = teclado.next();
    	System.out.println("Digite o CEP da rua: ");
    	String cep = teclado.next();
    	System.out.println("Digite o bairro: ");
    	String bairro = teclado.next();
    	
    	Endereco end1 = new Endereco(rua, numero, cep, bairro);
    	return end1;
    }

    private static void cadastrarFuncionario(){
    	System.out.println("Digite o nome do funcion�rio: ");
    	String nome = teclado.next();
        System.out.println("Digite o CPF do funcion�rio: ");
        String cpf = teclado.next();
        Endereco end = cadastrarEndereco();
        System.out.println("Digite o nome do setor do funcion�rio: ");
        String setor = teclado.next();
        System.out.println("Digite o sal�rio do funcion�rio: ");
        float salario = teclado.nextFloat();
	
        Funcionario f1 = new Funcionario(nome, cpf, end, setor, salario);
		
        bd.gravarPassoa(f1);
        System.out.println("Funcion�rio Gravado com Sucesso!\n\n\n\n");
        
    }
    
    
    
    
}




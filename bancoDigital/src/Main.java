
public class Main {

	public static void main(String[] args) {
		Banco banco = new Banco("Banco PoupaPouco");

		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		cliente1.setNome("Fulano");
		cliente2.setNome("Ciclano");

		Conta contaCorrente = new ContaCorrente(1, 1001, cliente1);
		Conta contaPoupanca = new ContaPoupanca(1, 2002, cliente2);

		banco.getContas().add(contaCorrente);
		banco.getContas().add(contaPoupanca);

		contaCorrente.depositar(1000.0);
		contaCorrente.imprimirExtrato();

		contaCorrente.sacar(200.0);
		contaCorrente.imprimirExtrato();

		contaCorrente.transferir(300.0, contaPoupanca);
		contaCorrente.imprimirExtrato();
		contaPoupanca.imprimirExtrato();
	}

}

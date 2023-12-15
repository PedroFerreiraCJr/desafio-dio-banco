
public class Main {
	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");

		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100.0d);
		
		Banco meuBanco = new Banco();
		meuBanco.addConta(cc);
		meuBanco.addConta(poupanca);
		meuBanco.listarClientes();
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}

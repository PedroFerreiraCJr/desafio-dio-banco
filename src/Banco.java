import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nome;
	private List<Conta> clientes;

	public Banco() {
		super();
		this.clientes = new ArrayList<>();
	}
	
	public void listarClientes() {
		for (Conta conta: clientes) {
			System.out.printf("Cliente		: %s%n", conta.getCliente().getNome());
		}
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getClientes() {
		return clientes;
	}

	public void addConta(Conta cc) {
		this.clientes.add(cc);
	}
}

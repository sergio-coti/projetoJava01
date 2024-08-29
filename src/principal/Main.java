package principal;

import java.util.UUID;

import javax.swing.JOptionPane;

import entities.Cliente;
import repositories.ClienteRepository;

//definição da classe
public class Main {

	// método para execução da classe
	public static void main(String[] args) {

		System.out.println("Sistema para cadastro de clientes");
		System.out.println("Turma de Java WebDeveloper - COTI Informática");

		// criando um objeto para a classe Cliente
		var cliente = new Cliente();

		// preenchendo os atributos do objeto
		cliente.setId(UUID.randomUUID());
		cliente.setNome(JOptionPane.showInputDialog("Informe o nome:"));
		cliente.setCpf(JOptionPane.showInputDialog("Informe o cpf:"));
		cliente.setEmail(JOptionPane.showInputDialog("Informe o email:"));
		cliente.setTelefone(JOptionPane.showInputDialog("Informe o telefone:"));

		// imprimindo os dados do cliente
		System.out.println("\nDados do cliente:");
		System.out.println("\tId........: " + cliente.getId());
		System.out.println("\tNome......: " + cliente.getNome());
		System.out.println("\tCPF.......: " + cliente.getCpf());
		System.out.println("\tEmail.....: " + cliente.getEmail());
		System.out.println("\tTelefone..: " + cliente.getTelefone());
		
		//criando um objeto para a classe de repositório
		var clienteRepository = new ClienteRepository();
		clienteRepository.exportarDados(cliente);		
	}

}

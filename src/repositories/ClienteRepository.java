package repositories;

import java.io.PrintWriter;

import entities.Cliente;

//Classe para gravação dos dados do cliente em arquivos
public class ClienteRepository {

	//Método para receber um objeto cliente e gravar os dados
	public void exportarDados(Cliente cliente) {
		
		try {
			
			//criando um arquivo TXT na máquina local
			PrintWriter printWriter = new PrintWriter("c:\\temp\\cliente_" + cliente.getId() + ".txt");
			
			//escevendo os dados do arquivo
			printWriter.write("\nID do cliente....: " + cliente.getId());
			printWriter.write("\nNome.............: " + cliente.getNome());
			printWriter.write("\nCPF..............: " + cliente.getCpf());
			printWriter.write("\nEmail............: " + cliente.getEmail());
			printWriter.write("\nTelefone.........: " + cliente.getTelefone());
			
			//fechando o arquivo
			printWriter.close();
			
			System.out.println("\nDados gravados com sucesso!");
		}
		catch(Exception e) {
			//exibindo mensagem de erro para o usuário:
			System.out.println("\nFalha ao gravar o arquivo: " + e.getMessage());
		}
	}
}

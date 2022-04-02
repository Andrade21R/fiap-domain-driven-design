package br.com.fiap.classes;

public class Teste {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();

		Endereco endereco = new Endereco();

		ContaCorrente cc = new ContaCorrente();

		endereco.rua = "Av Lins de Vasconcelos";
		endereco.bairro = "Aclimação";
		endereco.cep = "12354-540";
		endereco.numero = 1222;

		cliente.nome = "Joazinho";
		cliente.cpf = "123.234.234-23";
		cliente.endereco = endereco;

		cc.saldo = 1500;
		cc.titular = cliente;
	}
}

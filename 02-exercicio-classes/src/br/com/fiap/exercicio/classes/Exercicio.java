package br.com.fiap.exercicio.classes;

public class Exercicio {

	public static void main(String[] args) {
		// Instanciar o Elevador
		Elevador elevador = new Elevador();

		// Inicializar o total de andares e a capacidade
		elevador.inicializa(15, 8);

		// Subir um andar
		elevador.sobe();

		// Adicionar uma pessoa
		elevador.entra();

		// Exibir o andar atual e a qtd de pessoas no elevador
		System.out.printf("Andar n° %d com %d pessoas.\n", elevador.andarAtual, elevador.quantidadePessoaAtual);

		// Exibir o total de andares e a capacidade
		System.out.printf("Total de andares %d com capacidade de %d pessoas.\n", elevador.totalAndares,
				elevador.capacidade);
	}
}
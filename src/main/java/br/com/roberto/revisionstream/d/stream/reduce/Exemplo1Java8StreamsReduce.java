package br.com.roberto.revisionstream.d.stream.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Exemplo1Java8StreamsReduce {

	private static List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6);

	/**
	 * O Reduce trabalha com dados imutáveis
	 * Trabalhando com Streams_Reduce usando apenas o acumulador
	 * 
	 * reduce => Pega todos os elementos de um Stream, juntar eles; em seguida
	 * agrupa de alguma forma, depois disponibiliza em uma saída.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		impressaoSimplesDaLista();
		impressaoReduceSoma();
		impressaoReduceMultiplicacao();
		impressaoReduceConcatenacaoStrings();
		/*impressaoReduceSubtracao();*/

	}

	private static void impressaoSimplesDaLista() {
		lista.stream().forEach(System.out::println); // Method Reference
	}

	private static void impressaoReduceSoma() {

		Optional<Integer> soma = lista.stream()
					.reduce((n1, n2) -> n1 + n2);
		System.out.println(soma.get());
	}

	private static void impressaoReduceMultiplicacao() {

		Optional<Integer> multiplicacao = lista.stream()
					.reduce((n1, n2) -> n1 * n2);
		System.out.println(multiplicacao.get());
	}
	
	private static void impressaoReduceConcatenacaoStrings() {
		String s = "Meu nome é Carlos Roberto Medeiros";
		String[] split = s.split(" "); // O split com Espaço Junta tudo 
		//String[] split = s.split(""); // O split sem espaço mantém o elemento como está
		List<String> listaStr = Arrays.asList(split);
		
		Optional<String> concatenacao = listaStr.stream()
					.reduce((s1,s2) -> s1.concat(s2));
		
		System.out.println(listaStr);
		System.out.println(concatenacao.get());
	}
	
	
	/**
	 * Aqui da problema pois a função não é associativa
	 * o reduce não consegue dividir para executar em partes 
	 * SE LIGAR EM FUNÇÕES ASSOCIATIVAS
	 */
	/*private static void impressaoReduceSubtracao() {
	
		Optional<Integer> subtracao = lista.stream()
				.parallel()	
				.reduce((n1, n2) -> n1 - n2);
		System.out.println(subtracao.get());
	}*/
	
	

}
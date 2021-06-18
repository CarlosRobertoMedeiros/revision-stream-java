package br.com.roberto.revisionstream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class Java8StreamsReduce2 {

	private static List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6);

	/**
	 * Trabalhando com Streams_Reduce usando a sobrecarga identidade e acumulador
	 * 
	 * O valor de identidade tem que ser um valor que quando eu chamo ele ou outro valor, "tem que ser o outro valor"
	 * 
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
		impressaoReduceComMenorValor();
		impressaoReduceSomaComCombinacao();
		impressaoReduceMapComCombinacao();

	}

	/**
	 * A Combinação é a função que o reduce chama ao dividir em partes
	 * a execução do stream
	 */
	private static void impressaoReduceSomaComCombinacao() {
		Integer somaComCombinacao = lista.stream()
				.reduce(0, (n1,n2) -> n1+n2, (n1,n2) -> n1 + n2);
		System.out.println(somaComCombinacao);	
		
	}

	private static void impressaoReduceComMenorValor() {
		
		/* Jeito 1
		OptionalDouble menorValor = DoubleStream.of(1.5,2.9,6.7)
			.reduce((d1,d2) -> Math.min(d1, d2));
		System.out.println(menorValor);
		*/
		
		//Uma alternativa nos casos onde o valor de identidade não é tão óbvio
		double menorValor = DoubleStream.of(1.5,2.9,6.7)
			.reduce(Double.POSITIVE_INFINITY,(d1,d2) -> Math.min(d1, d2));
		System.out.println(menorValor);
		
		
	}

	private static void impressaoSimplesDaLista() {
		lista.stream().forEach(System.out::println); // Method Reference
	}

	private static void impressaoReduceSoma() {

		Integer soma = lista.stream()
					.reduce(0,(n1, n2) -> n1 + n2);
		System.out.println(soma);
	}

	private static void impressaoReduceMultiplicacao() {

		Integer multiplicacao = lista.stream()
					.reduce(1,(n1, n2) -> n1 * n2);
		System.out.println(multiplicacao);
	}
	
	private static void impressaoReduceConcatenacaoStrings() {
		String s = "Meu nome é Carlos Roberto Medeiros";
		String[] split = s.split(" "); // O split com Espaço Junta tudo 
		//String[] split = s.split(""); // O split sem espaço mantém o elemento como está
		List<String> listaStr = Arrays.asList(split);
		
		String concatenacao = listaStr.stream()
					.reduce("",(s1,s2) -> s1.concat(s2));
		
		System.out.println(listaStr);
		System.out.println(concatenacao);
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
	
	private static void impressaoReduceMapComCombinacao() {
		
		/*Alternativa 1
		Optional<String> reduce = lista.stream()
			.map(n1 -> n1.toString())
			.reduce((n1, n2) -> n1.concat(n2));
		System.out.println(reduce);
		*/
		// Detalhe só é usado em paralelo 
		String reduce = lista.stream()
			.reduce("",
					(n1, n2) -> n1.toString().concat(n2.toString()),
					(n1, n2) -> n1.concat(n2) 
			);
		System.out.println(reduce);
	}
	
	

}
package br.com.roberto.revisionstream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Java8StreamsCollect2 {

	private static List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6);

	/**
	 * Trabalhando com Streams_Collect O Collect trabalha com dados mutáveis(Lista,
	 * Mapa, um Set etc)
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		retornaListaComtoList();
		retornaListaComtoSet();
		retornaListaUsandoUmCollectionEmLamda();
		retornaListaUsandoUmCollectionParaString();
		retornaListaCalculandoMedia();
		retornaListaCalculandoSoma();
		retornaListacomSumarizacao();
		retornaListacomCounting();
		retornaListacomMax();
		retornaListacomMin();

	}

	/**
	 * Retorna da lista todos os números pares e imprime Retorna um Collector já
	 * implementado para to List
	 */
	private static void retornaListaComtoList() {

		List<Integer> collect = lista.stream().filter((n) -> n % 2 == 0).collect(Collectors.toList());

		System.out.println(collect);

	}

	/**
	 * Retorna da lista todos os números pares e imprime Retorna um Collector já
	 * implementado para to set
	 */
	private static void retornaListaComtoSet() {

		Set<Integer> collect = lista.stream().filter((n) -> n % 2 == 0).collect(Collectors.toSet());
		System.out.println(collect);

	}

	private static void retornaListaUsandoUmCollectionEmLamda() {

		Set<Integer> collect = lista.stream().filter((n) -> n % 2 == 0)
				// .collect(Collectors.toCollection(() -> new TreeSet<Integer>()));
				.collect(Collectors.toCollection(() -> new LinkedHashSet<Integer>()));
		// .collect(Collectors.toCollection(() -> new ArrayDeque()));
		System.out.println(collect);

	}

	/**
	 * Retorna uma lista de coleções tratadas como String
	 */
	private static void retornaListaUsandoUmCollectionParaString() {

		// Melhor que o joining do Reduce pois internamente no Collect utiliza um
		// StringBuilder
		// Que é muito mais performático
		String join = lista.stream().map(n -> n.toString()).collect(Collectors.joining(";"));// Pode-se usar com ou sem
																								// delimitador

		System.out.println(join);

	}

	private static void retornaListaCalculandoMedia() {

		Double media = lista.stream().collect(Collectors.averagingInt(n -> n.intValue()));
		System.out.println(media);

	}
	
	private static void retornaListaCalculandoSoma() {

		Integer soma = lista.stream().collect(Collectors.summingInt(n -> n.intValue()));
		System.out.println(soma);

	}
	
	private static void retornaListacomSumarizacao() {
		//Traz uma grande quantidade de dados já implementada
		IntSummaryStatistics statistics = lista.stream().collect(Collectors.summarizingInt(n -> n.intValue()));
		System.out.println("IntSummaryStatistics");
		System.out.println(statistics.getAverage());
		System.out.println(statistics.getCount());
		System.out.println(statistics.getMax());
		System.out.println(statistics.getMin());
		System.out.println(statistics.getSum());
	}
	
	private static void retornaListacomCounting() {
		Long qtdeItens = 
				lista.stream()
					.filter((n) -> n % 2 == 0 )
					.collect(Collectors.counting());
		
		System.out.print(qtdeItens);
	}
	
	private static void retornaListacomMax() {
		 System.out.println("retornaListacomMax");
		//O ifPresent é levando em consideração <Optional>Stream
		lista.stream()
			.filter((n) -> n % 2 == 0 )
			.collect(Collectors.maxBy(Comparator.naturalOrder()))
			.ifPresent(System.out::println);
	}
	
	private static void retornaListacomMin() {
		System.out.println("retornaListacomMin");
		//O ifPresent é levando em consideração <Optional>Stream
		lista.stream()
			.filter((n) -> n % 2 == 0 )
			.collect(Collectors.minBy(Comparator.naturalOrder()))
			.ifPresent(System.out::println);
	}
	
	
	
	

}
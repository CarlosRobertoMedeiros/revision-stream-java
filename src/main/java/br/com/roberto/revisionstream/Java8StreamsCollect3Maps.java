package br.com.roberto.revisionstream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8StreamsCollect3Maps {

	private static List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6);

	/**
	 * Trabalhando com Streams_Collect O Collect - Maps	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		usandoGroupingBy();
		usandoPartitioningBy();
		usandotoMap();
	}
	
	/**
	 * Detalhamento do Resultado
	 * Foi pedido para agrupar os dados da lista de acordo com os números que são resto da divisão de 3
	 * Ex.
	 * {0=[3, 6], 1=[1, 4], 2=[2, 5]}
	 */
	private static void usandoGroupingBy() {
		
		Map<Integer, List<Integer>> 
			collect = lista.stream()
				.collect(Collectors.groupingBy((n) -> n % 3 ));
		System.out.println(collect);
		
	}
	
	
	/**
	 * Detalhamento do Resultado
	 * Foi pedido para agrupar os dados da lista de acordo com os números que são resto da divisão de 3
	 * Porém para o método PartitioningBy é devolvido um map com True e False
	 * Ex.
	 * {false=[1, 2, 4, 5], true=[3, 6]}
	 */
	private static void usandoPartitioningBy() {
		
		Map<Boolean,List<Integer>> collect =  lista.stream()
				.collect(Collectors.partitioningBy((n) -> n % 3 == 0 ));
		System.out.println(collect);
		
	}
	
	/**
	 * Detalhamento do Resultado
	 * Usa-se as 2 expressões Chave e valor e passa-se ambas como lambda expressions  
	 * Ex.
	 * {1=2, 2=4, 3=6, 4=8, 5=10, 6=12}
	 * 
	 * Ex2.
	 * {1=1.0, 2=32.0, 3=243.0, 4=1024.0, 5=3125.0, 6=7776.0}
	 */
	private static void usandotoMap() {
		
		Map<Integer,Double> collect =  lista.stream()
				//.collect(Collectors.toMap(n -> n, n -> n * 2));
				.collect(Collectors.toMap(
							n -> n, 
							n -> Math.pow(n, 5)));
		
		System.out.println(collect);
		
	}
	
}
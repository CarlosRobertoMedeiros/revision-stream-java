package br.com.roberto.revisionstream.d.stream.collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Exemplo1Java8StreamsCollect {

	private static List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6);


	/**
	 * Trabalhando com Streams_Collect
	 * O Collect trabalha com dados mutáveis(Lista, Mapa, um Set etc)
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		retornaListaEmCollect();
		retornaListaEmCollectComSet();
		
	
	}
	
	private static void retornaListaEmCollect() {
		
		//fornecedor(Um objeto que vai ser usado para armazenar o resultado ) - acumulação - combinação
		List<Integer> collect =  lista.stream()
			.collect(
					() -> new ArrayList<>(), 
					(l , e) -> l.add(e),
					(l1,l2) -> l1.addAll(l2)
				);
		
		System.out.println(lista);
		System.out.println(collect);
		
	}
	
	private static void retornaListaEmCollectComSet() {

		// fornecedor(Um objeto que vai ser usado para armazenar o resultado ) 
		// acumulação (Como armazeno o resultado la dentro) 
		// combinação(Como eu combino os valores para gerar o resultado)
		Set<Integer> collectSet =  lista.stream()
			.collect(
					() -> new HashSet<>(), 
					(l , e) -> l.add(e),
					(l1,l2) -> l1.addAll(l2)
				);
		
		System.out.println(lista);
		System.out.println(collectSet);

	}


}
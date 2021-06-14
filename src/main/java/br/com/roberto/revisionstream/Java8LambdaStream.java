package br.com.roberto.revisionstream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Java8LambdaStream {
	
	/**
	 * Exemplo 3
	 * Iniciando a utilização de funções Lambda 
	 * através da API DE STREAMS
	 *  
	 * @param args
	 */
	public static void main(String[] args) {
		//Java 8 : Funções
		//Api de Stream
		//Stream - Fluxo de Dados
		
		List<Integer> asList = Arrays.asList(1,2,3,4);
		
		//Java 4
		for (Iterator iterator = asList.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer); 
			
		}
		
		//Java 5
		for (Integer integer : asList) {
			System.out.println(integer); 	
		}
		
		//Java 8
		asList.forEach((e) -> System.out.println(e));
		
		//Java 8 => Usando Fluxo de Dados(Stream) para Imprimir apenas números Pares
		asList.stream()
			.filter(e -> e % 2 == 0)
			.forEach(e -> System.out.println(e));
			
		
		
		
		
		
		
		
		
	}

}

package br.com.roberto.revisionstream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Examplo 4 - Trabalhando com Streams
 * @author carlos
 *
 */
public class Java8Streams {
	
	public static void main(String[] args) {
		
		List<Integer> lista = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9);
		
		//Iteração Java 4
		for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
		
		//Iteração Java 5
		for (Integer integer : lista) {
			System.out.println(integer);
		}
		
		//Java 8 -> Streams Básico
		//No javaDoc está definido que Usamos Operações Intermediárias e Operações Finais
		lista.stream()
			.forEach(e -> System.out.println(e));
		
		//Java 8 -> Streams Básico
		lista.stream()
			.skip(2) //Ignora os 2 primeiros Elementos Operação Intermediária
			.forEach(e -> System.out.println(e));
		
		lista.stream()
			.limit(2) //Contrário do skip vou processar os 2 primeiros e desconsidero os outros números
			.forEach(e -> System.out.println(e));
		
		lista.stream()
			.distinct() //Mesmo conceito do SQL //Equals e hashcode devem ser implementados
			.forEach(e -> System.out.println(e));
		
		//Pode-se misturar as coisa
		lista.stream()
			.skip(2)
			.limit(3)
			.distinct() //Mesmo conceito do SQL //Equals e hashcode devem ser implementados
			.forEach(e -> System.out.println(e));
		
		//Imprime somente os Pares
		//Os números passados pelo filter vão para o foreach, os outros vão ser jogados fora
		lista.stream()
			.filter(e -> e % 2 == 0)
			.forEach(e -> System.out.println(e));
		
	
		
		
		
		
		
		
		
		
		
		
		
	}

}

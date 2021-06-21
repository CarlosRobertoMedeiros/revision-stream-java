package br.com.roberto.revisionstream;

import java.util.Arrays;
import java.util.List;

//Código Imperativo é o Padrão
//Código Declarativo é o código da programação funcional
//Link: https://www.youtube.com/watch?v=lJjNDnqXUsw&list=PLuYctAHjg89ZkhgOQo0zcTtmHY5nuRYud&index=9
//Continuar a partir dos 5 minutos


/**
 * Como Debugar Código Declarativo
 * @author carlo
 *
 */
public class Java8StreamDebug {

	private static List<Integer> LISTA = Arrays.asList(1,2,5,8,9);

	public static void main(String[] args) {
		
		LISTA.stream()
			.map((n) -> new StringBuilder().append(n).append("s").append("a"))
			.forEach(System.out::println);
		
	}
}

package br.com.roberto.revisionstream.f.stream.degubber;

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
		
		debugandoNormalmenteaStream();
		debugandoEmBlocoaStream();
		debugandoEmMetodo();
		debugandoUsandoPeek();
		
		
		
	}
	
	private static void debugandoNormalmenteaStream() {
		LISTA.stream()
		.map((n) -> new StringBuilder().append(n).append("s").append("a"))
		.forEach(System.out::println);
	}
	
	private static void debugandoEmBlocoaStream() {
		LISTA.stream().
			map((n) -> {
					StringBuilder builder = new StringBuilder();
					builder.append(n);
					builder.append("s");
					builder.append("a") ;
					return builder;
				})
			.forEach(System.out::println);
	}

	private static void debugandoEmMetodo() {
		LISTA.stream()
			.map(n -> converteParaStringBuilder(n))
			.forEach(System.out::println);
	
	}
	
	private static StringBuilder converteParaStringBuilder(Integer n) {
		StringBuilder builder = new StringBuilder();
		builder.append(n);
		builder.append("s");
		builder.append("a") ;
		return builder;
	}
	
	private static void debugandoUsandoPeek() {
		//O peek serve como log para ser mostrado o que está ocorrendo.
		LISTA.stream()
			.peek(n -> System.out.println(n + "antes do map"))
			.map(n -> converteParaStringBuilder(n))
			.peek(n -> System.out.println(n + "depois do converte para String"))
			.forEach(System.out::println);
		
	}


	
	
}

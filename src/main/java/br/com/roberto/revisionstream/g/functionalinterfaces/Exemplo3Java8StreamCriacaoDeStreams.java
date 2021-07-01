package br.com.roberto.revisionstream.g.functionalinterfaces;

import java.util.Arrays;
import java.util.List;

//Continuar a Partir de 1:30 - https://www.youtube.com/watch?v=GXfPBb-8YOE&list=PLuYctAHjg89ZkhgOQo0zcTtmHY5nuRYud&index=11
public class Exemplo3Java8StreamCriacaoDeStreams {

	public static void main(String[] args) {
		criacaodeStreamUsandoCollection();
	}

	private static void criacaodeStreamUsandoCollection() {
		// Basta olhar as Collection da Interface List
		List<Integer> lista = Arrays.asList(1, 2, 3, 4);
		lista.stream().forEach(System.out::println);

	}

}

package br.com.roberto.revisionstream;

import java.util.Optional;
import java.util.stream.Stream;

public class Java8Optional2findFirst {

	public static void main(String[] args) {
	
		//Exemplo 1
		Optional<Integer> numero = 
				Stream.of(1,2,3)
					.findFirst();
		
		System.out.println(numero.get());
		
		//Exemplo 2 --Assim fica mais declarativo e melhor
		//Caso não exista o primeiro elemento ele não faz absolutamente nada
		Stream.of(1,2,3)
			.findFirst()
			.ifPresent(n -> System.out.println(n));
		

	}

}

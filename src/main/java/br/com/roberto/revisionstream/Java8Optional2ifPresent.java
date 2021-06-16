package br.com.roberto.revisionstream;

import java.util.Optional;

public class Java8Optional2ifPresent {

	public static void main(String[] args) {
		//String s ="1";
		String s ="teste de mensagem";
		
		
		//Usando Função Lambda para Validar o Valor da Mensagem
		//Caso consiga converter (String s ="1") ele imprime devido a ifPresent
		//Caso não consiga ele desconsidera (String s ="teste de mensagem")
		converteEmNumero(s)
			.ifPresent( n -> System.out.println(n));

	}

	private static Optional<Integer> converteEmNumero(String s) {
		try {
			Integer integer = Integer.valueOf(s);
			return Optional.of(integer);
		} catch (Exception e) {
			return Optional.empty();
		}
	}

}

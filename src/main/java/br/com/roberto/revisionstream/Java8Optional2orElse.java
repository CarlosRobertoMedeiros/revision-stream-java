package br.com.roberto.revisionstream;

import java.util.Optional;

public class Java8Optional2orElse {

	public static void main(String[] args) {
		String s ="1";
		//String s ="teste de mensagem";
		
		
		//Usando Função Lambda para Validar o Valor da Mensagem
		//Caso consiga converter (String s ="1") ele imprime o valor
		//Caso não consiga ele imprime (String s ="teste de mensagem") 2
		//Interessante em casos onde o método pode te tornar um valor null 
		Integer numero = converteEmNumero(s).orElse(2);
		System.out.println(numero);

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

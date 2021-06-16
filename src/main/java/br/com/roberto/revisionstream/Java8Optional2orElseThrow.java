package br.com.roberto.revisionstream;

import java.util.Optional;

public class Java8Optional2orElseThrow {

	public static void main(String[] args) {
		String s ="1";
		//String s ="teste de mensagem";
		
		
		//Caso consiga converter (String s ="1") ele imprime o valor
		//Caso não consiga ele imprime (String s ="teste de mensagem") 2
		//Interessante em casos onde o método pode te tornar um valor null
		//Porém aqui ao usar o orElseThrow ele lança uma exceção caso o Optional esteja vazio
		Integer numero = converteEmNumero(s).orElseThrow(() -> new NullPointerException("Valor Vazio"));
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

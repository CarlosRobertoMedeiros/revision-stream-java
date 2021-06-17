package br.com.roberto.revisionstream;

import java.util.OptionalInt;

public class Java8Optional2PrimitiveTypes {

	public static void main(String[] args) {
		String s ="1";
		//String s ="teste de mensagem";
		
		
		int numero = converteEmNumero(s).orElseThrow(() -> new NullPointerException("Valor Vazio"));
		System.out.println(numero);

	}

	private static OptionalInt converteEmNumero(String s) {
		try {
			int integer = Integer.parseInt(s);
			return OptionalInt.of(integer);
		} catch (Exception e) {
			return OptionalInt.empty();
		}
	}

}
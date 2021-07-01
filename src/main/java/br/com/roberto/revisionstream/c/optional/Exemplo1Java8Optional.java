package br.com.roberto.revisionstream.c.optional;

import java.util.Optional;

/**
 * Utilizando Optional para substituir os "null"
 * {@link} https://www.youtube.com/watch?v=hmU2QEEc4sU&list=PLuYctAHjg89ZkhgOQo0zcTtmHY5nuRYud&index=4	
 * Continuar a partir de 1:43	
 * @author carlos
 *
 */
public class Exemplo1Java8Optional {
	
	public static void main(String[] args) {
		
		//Utilizando como Java 7
		String s = "1";
		Integer converteEmNumero = converteEmNumero(s);
		System.out.println(converteEmNumero);
		
		//Utilizando como Java 8
		s = "1";
		Optional<Integer> numero = converteParaNumero(s);
		System.out.println(numero);
		
		
		//Utilizando como Java 7 try catch para testar valores
		s = "Apenas um teste";
		Optional<Integer> converteEmNumero2 = converteParaNumero2(s);
		System.out.println(converteEmNumero2);
		
		//Utilizando como Java 8 try catch para testar valores
		s = "Apenas um teste";
		Optional<Integer> converteEmNumero2Java8 = converteParaNumero2Java8(s);
		System.out.println(converteEmNumero2Java8);
		
		s = "Apenas um teste";
		Optional<Integer> converteEmNumeroValoresQuePodemSerNullJava8 = converteParaNumeroValoresQuePodemSerNullJava8(s);
		System.out.println(converteEmNumeroValoresQuePodemSerNullJava8);
		
		
	}
	

	/***
	 * Usado Assim Até o Java 7
	 * @param numeroStr
	 * @return
	 */
	public static Integer converteEmNumero(String numeroStr) {
		return Integer.valueOf(numeroStr);
	}
	
	/**
	 * Usando Assim Para Java 8
	 * @param numeroStr
	 * @return
	 */
	public static Optional<Integer> converteParaNumero(String numeroStr){
		Integer numeroConvertido = Integer.valueOf(numeroStr);
		return Optional.of(numeroConvertido);
		
	}
	
	/**
	 * Usando Assim para Java 7 Convertendo com try catch
	 * @param numeroStr
	 * @return
	 */
	public static Optional<Integer> converteParaNumero2(String numeroStr){
		try {
			Integer integer = Integer.valueOf(numeroStr);
			return Optional.of(integer);
		}catch (Exception e) {
			return null;
		}
		
	}
	
	/**
	 * Usando Assim para Java 8 try catch tratando com Optional
	 * @param s
	 * @return
	 */
	private static Optional<Integer> converteParaNumero2Java8(String numeroStr) {
		try {
			Integer integer = Integer.valueOf(numeroStr);
			return Optional.of(integer);
		}catch (Exception e) {
			return Optional.empty();
		}
	}
	
	/**
	 * Usando Assim para Java 8 em casos de conversão de valores que podem ser null
	 * @param s
	 * @return
	 */
	private static Optional<Integer> converteParaNumeroValoresQuePodemSerNullJava8(String numeroStr) {
		try {
			Integer integer = Integer.valueOf(numeroStr);
			return Optional.ofNullable(null);
		}catch (Exception e) {
			return Optional.empty();
		}
	}
	

}

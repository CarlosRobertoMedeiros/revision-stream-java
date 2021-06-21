package br.com.roberto.revisionstream;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * Method Reference é uma forma alternativa de representar as funções Lambda
 * O  System.out::println é um méthod reference de instância única
 * @author carlos
 *
 */
public class Java8MethodReference {

	private static List<Integer> LISTA = Arrays.asList(1,2,3,4,5);
	
	public static void main(String[] args) {
		System.out.println("Método Reference");

		exemplo1MethodReference();
		chamadorMultipliquePorDois();
		chamadordeConstrutores();
		chamadordeVariasInstancias();
		chamadordeUnicaInstancia();

	}
	
	private static void exemplo1MethodReference() {
		
		//Sem Method Reference
		LISTA.stream()
			.forEach((n) -> System.out.println(n)); //:: -> Seria o 2 pontos
		
		//Com Method Reference
		LISTA.stream()
			.forEach(System.out::println); //:: -> Seria o 2 pontos
	}
	
	/**
	 * Utilizando Método Estático
	 * @param i
	 * @return
	 */
	private static Integer multipliquePorDois(Integer i) {
		return i * 2;
	}
	
	private static void chamadorMultipliquePorDois() {
		//Sem Method Reference
		/*
		LISTA.stream()
			.map((n) -> multipliquePorDois(n))
			.forEach(System.out::println);
		*/
		
		//Com Method Reference .. veja que não é necessário informar o n
		LISTA.stream()
			.map(Java8MethodReference::multipliquePorDois)
			.forEach(System.out::println);
		
		
	}
	
	private static void chamadordeConstrutores() {
		System.out.println("Método Reference chamador de construtores");
		//Sem Method Reference
		/*
		LISTA.stream()
			.map((n) -> new BigDecimal(n))
			.forEach(System.out::println);
		*/
		
		//Com Method Reference
		LISTA.stream()
			.map(BigDecimal::new)
			.forEach(System.out::println);
		
	}
	
	private static void chamadordeVariasInstancias() {
		System.out.println("Método Reference chamador de várias Instâncias");
		//Sem Method Reference
		/*
		LISTA.stream()
			.map((n) -> n.doubleValue())
			.forEach(System.out::println);
		*/
		
		//Com Method Reference
		LISTA.stream()
			.map(Integer::doubleValue)
			.forEach(System.out::println); 
				
	}
	
	private static void chamadordeUnicaInstancia() {
		System.out.println("Método Reference chamador de Única Instância");
		
		//Sem Method Reference
		BigDecimal dois = new BigDecimal(2);
		/*
		LISTA.stream()
			.map(BigDecimal::new)
			.map((b)-> dois.multiply(b))
			.forEach(System.out::println);
		*/
		
		//Com Method Reference
		LISTA.stream()
			.map(BigDecimal::new)
			.map(dois::multiply)
			.forEach(System.out::println); //Obs: sobre essa linha funciona por ser uma instância estática

	}
	
}

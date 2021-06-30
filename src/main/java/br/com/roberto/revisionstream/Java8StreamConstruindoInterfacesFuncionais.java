package br.com.roberto.revisionstream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

//Código Imperativo é o Padrão
//Código Declarativo é o código da programação funcional



/**
 * Construindo Interfaces funcionais
 * Link: https://www.youtube.com/watch?v=Ht0eto2mEpc&list=PLuYctAHjg89ZkhgOQo0zcTtmHY5nuRYud&index=10
 * Continuar a partir dos 04:30
 * @author carlos
 *
 */
public class Java8StreamConstruindoInterfacesFuncionais {

	private static List<Integer> LISTA = Arrays.asList(1, 2, 3, 4, 5);

	public static void main(String[] args) {
		
		testandoUmSupplier();
		testandoUmConsumer();
		testandoUmBiConsumer();
		testandoUmPredicate();
		testandoUmBiPredicate();
		
		


	}



	private static void testandoUmSupplier() {
		//Supplier Interface Fornecedor
		//Sempre retorna alguma coisa e não passa nada
		Stream.generate(() -> new Random().nextInt())
			.limit(5)
			.forEach(System.out::println);
	}
	
	private static void testandoUmConsumer() {
		//Consumer Interface Consumidor
		// void accept(T t); => Conforme assinatura
		//exemplo o forEach
		Stream.generate(() -> new Random().nextInt())
		.limit(5)
		.forEach((e) -> System.out.println(e));
	}
	
	private static void testandoUmBiConsumer() {
		//BiConsumer Interface Bi Consumidor
		// void accept(T t, U u); => Conforme assinatura
		//Não achei um teste simples para implementação 
	}
	
	private static void testandoUmPredicate() {
		//Predicate Recebe um valor e retorna um boolean
		//Filter 
		//boolean test(T t);
		LISTA.stream()
			.filter(e -> e % 2 == 0)
			.forEach(System.out::println);
	}
	
	private static void testandoUmBiPredicate() {
		//BiPredicate Interface BiPredicate
		// boolean test(T t, U u); => Conforme assinatura
		//Não achei um teste simples para implementação
	}
	
	
	
	
	
}

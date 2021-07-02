package br.com.roberto.revisionstream.j.parallelstream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//https://www.youtube.com/watch?v=MPvZLz6Veac&list=PLuYctAHjg89ZkhgOQo0zcTtmHY5nuRYud&index=13
//Continuar a partir de 1:19
public class Exemplo1Java8ParallelStream {

	private static List<Integer> LISTA = Arrays.asList(1,2,3,4);
	
	public static void main(String[] args) {
		
		
		// Para objetos lista use lista.parallelStream()
		// Para objetos que não são lista tem que usar o IntStream.range(0, 5).parallel() 
		// List<Integer> lista = Arrays.asList(1,2,3,4);
		// lista.parallelStream()
		// IntStream.range(0, 5).parallel().
		exemplosDeForEachParalelo();
		exemploDeFindAny();
		exemploUnOrdered();
		exemploReduce();
		exemploCollectToMapAndGroupingBy();
		
				
	}

	private static void exemplosDeForEachParalelo() {
		
		//forEach vs forEachOrdered
		//forEach imprime em qualquer ordem por ser processamento paralelo
		LISTA
			.parallelStream()
			.forEach(System.out::println);
		
		//forEachOrdered imprime na ordem correta "Verificar Performance"
		LISTA
		.parallelStream()
		.forEachOrdered(System.out::println);
	

	}
	
	private static void exemploDeFindAny() {
		
		//findAny retorna o primeiro número que a thread disponibilizar
		//findAny encontra qualquer objeto da stream e finaliza ele
		
		//Usando Stream Paralela
		LISTA.parallelStream()
			.findAny()
			.ifPresent(System.out::println);
		
		//Usando Stream
		LISTA.stream()
			.findAny()
			.ifPresent(System.out::println);
		
	}
	
	private static void exemploUnOrdered() {
		//unordered
		// Ele indica que o skip pode pular qualquer elemento que chegar primeiro na thread
		// Ele indica que o limit pode limitar qualquer elemento que chegar primeiro na thread
		// foco performance
		// Serve para o distinct também
		LISTA.parallelStream()
			.unordered()  
			.skip(1)
			.limit(2)
			.forEach(System.out::println);
		
	}
	
	private static void exemploReduce() {
		// a função é associativa, não importa como agrupar o resultado sempre vai ser o mesmo
		// não funciona para subtração
		//Ex.: reduce
		// (1+2) + (3+4) = 10 - em qualquer ordem o resultado é o mesmo *Testar retirando o parêntesis
		// (1-2) - (3-4) != -8 não é associativa *Testar retirando o parêntesis
		LISTA.parallelStream()
			.reduce((n1, n2) -> n1 + n2)
			.ifPresent(System.out::println);
			
	}
	
	private static void exemploCollectToMapAndGroupingBy() {
		Map<Integer, Boolean> collect = 
				LISTA.parallelStream()
					.collect(
							Collectors
								//.toMap(n -> n, n -> n % 2 == 0 )
								.toConcurrentMap(n -> n, n -> n % 2 == 0 ) //Thread Safe usar ao invés de toMap
							);
		System.out.println(collect);	
		
		//groupingBy --> Não existe garantia da ordem, buscando performance
		Map<Boolean, List<Integer>> collectGb = 
				LISTA.parallelStream()
					.collect(
							Collectors
								.groupingByConcurrent(n -> n % 2 == 0) //Thread Safe usar ao invés de groupingBy
							);
		System.out.println(collectGb);
					
	}

}


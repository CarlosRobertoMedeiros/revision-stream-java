package br.com.roberto.revisionstream;

import java.util.Arrays;
import java.util.List;

public class Java8Streams2 {

	private static List<Integer> lista = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9);
	
	
	/**
	 * Trabalhando com Operações Intermediárias
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		transformaDadosMap();

	}

	private static void transformaDadosMap() {
		//Organize as transformações colocando primeiro os filtros
		lista.stream()
			.limit(3)
			.map(e -> e * 2) // a lista não é modificada
			.skip(2)
			.distinct()
			.forEach(e -> System.out.println(e));
	}

}

//Resumo Simples: https://rinaldo.dev/java-8-streams-pare-de-usar-for-e-simplifique-seu-codigo/
// Continuar daqui: https://www.youtube.com/watch?v=1febjDMVMnc&list=PLuYctAHjg89ZkhgOQo0zcTtmHY5nuRYud&index=3

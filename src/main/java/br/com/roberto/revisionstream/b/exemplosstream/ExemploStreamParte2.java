package br.com.roberto.revisionstream.b.exemplosstream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Trabalhando com Streams 3 - Operações Finais
 * @author carlos
 *
 *
 * O Stream = Loop Implícito = Não se sabe como é feito o stream decide isso
 * for - while - do..while = loops explícitos, você que gerencia
 * 
 * Para trabalhar com thread através de Stream utilize a classe parallelStream() só prestar a atenção 
 */
public class ExemploStreamParte2 {
	
	private static List<Integer> lista = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9);
	
	public static void main(String[] args) {
			
		demonstrandoaOperacaoFinalForEach();
		demonstrandoaOperacaoFinalCount();
		demonstrandoaOperacaoFilterNumerosPares();
		demonstrandoaOperacaoFilterComMenorValorPar();
		demonstrandoaOperacaoFilterComMaiorValorPar();
		demonstrandoaOperacaoFilterComValorParRetornandoEmColecoes();
		demonstrandoaOperacaoComValorColetandoComGroupByTrueParaPareFalseParaImpar();
		demonstrandoaOperacaoComValorColetandoComGroupByAgrupadosPeloRestoDaDivisao();
		demonstrandoaOperacaoComValorJoinSempreAgrupaStrings();
		
	}
	
	private static void demonstrandoaOperacaoFinalForEach() {
		lista.stream()
			.limit(3)
			.map(e -> e *2 )
			.forEach(e -> System.out.println(e));
	};
	
	private static void demonstrandoaOperacaoFinalCount() {
		long count = lista.stream()
			.limit(3)
			.map(e -> e *2 )
			.count();
		
		System.out.println(" demonstrandoaOperacaoFinalCount "+count);
	};
	
	private static void demonstrandoaOperacaoFilterNumerosPares() {
		long count = lista.stream()
			.filter(e -> e % 2 ==0)
			.count();
		System.out.println(" demonstrandoFiltroComNumerosPares "+count);
	};
	
	private static void demonstrandoaOperacaoFilterComMenorValorPar() {
		Optional<Integer> menorValorPar = lista.stream()
			.filter(e -> e % 2 ==0)
			.min(Comparator.naturalOrder());//Obs o naturalOrder vai implementar o Comparator da classe que está usando
		System.out.println(" demonstrandoaOperacaoFilterComMenorValorPar "+menorValorPar.get());
	};
	
	private static void demonstrandoaOperacaoFilterComMaiorValorPar() {
		Optional<Integer> maiorValorPar = lista.stream()
			.filter(e -> e % 2 ==0)
			.max(Comparator.naturalOrder());//Obs o naturalOrder vai implementar o Comparator da classe que está usando
		System.out.println(" demonstrandoaOperacaoFilterComMaiorValorPar "+maiorValorPar.get());
	};
	
	private static void demonstrandoaOperacaoFilterComValorParRetornandoEmColecoes() {
		 List<Integer> novaLista = lista.stream()
			.filter(e -> e % 2 ==0)
			.collect(Collectors.toList());
		System.out.println("demonstrandoaOperacaoFilterComValorParRetornandoColecoesEmNovaLista "+novaLista);
	};
	
	/**
	 * Um dos mais utilizados para realizar transformações
	 */
	private static void demonstrandoaOperacaoComValorColetandoComGroupByTrueParaPareFalseParaImpar() {
		 Map<Boolean, List<Integer>> mapa = lista.stream()
				.map(e -> e * 3)
				.collect(Collectors.groupingBy(e -> e % 2 == 0));
		
		 System.out.println("demonstrandoaOperacaoComValorColetandoComGroupByTrueParaPareFalseParaImpar "+mapa);
	};
	
	/**
	 * Muito Usado para agrupar por qualquer atributo da classe que eu queira
	 */
	private static void demonstrandoaOperacaoComValorColetandoComGroupByAgrupadosPeloRestoDaDivisao() {
		 Map<Integer, List<Integer>> mapa = lista.stream()
		 .collect(Collectors.groupingBy(e -> e % 3));
		
		 System.out.println("demonstrandoaOperacaoComValorColetandoComGroupByAgrupadosPeloRestoDaDivisao "+mapa);
	};
	
	private static void demonstrandoaOperacaoComValorJoinSempreAgrupaStrings() {
		 String collect = lista.stream()
		 	.map(e -> String.valueOf(e)) //Converti para String
		 	.collect(Collectors.joining(";"));
		
		 System.out.println("demonstrandoaOperacaoComValorJoinSempreAgrupaStrings "+collect);
	};
	
	
	
	
	

}

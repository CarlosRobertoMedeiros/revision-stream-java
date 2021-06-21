package br.com.roberto.revisionstream;

import java.util.stream.IntStream;

public class Java8StreamsVariacoesEscritaLambda {
	
	
	public static void main(String[] args) {
		
		expressaoLambdaPadrao();
		expressaoLambdaTrabalhandoComParentesis();
		funcaoSemArgumento();
		funcoesUsandoChaves();
		funcoesUsandoChavesComMaisdeUmaLinha();
				
	}
	
	private static void expressaoLambdaPadrao() {

		IntStream.range(0, 5)
			.filter(n -> n % 2 == 0)
			.forEach(System.out::println);

	}
	
	private static void expressaoLambdaTrabalhandoComParentesis() {
		
		IntStream.range(0, 5)
			.filter((int n ) -> n % 2 == 0) //Usa-se o parenteses para informar o tipo do parâmetro
			.reduce((n1 , n2) -> n1+n2) //Usa-se o parênteses quando existem mais de um parâmetro para ser enviado
			.ifPresent(System.out::println);
		
	}
	
	private static void funcaoSemArgumento() {
		
		Runnable runnable = () -> System.out.println("Função sem argumentos para a Lambda");
		
	}
	
	private static void funcoesUsandoChaves() {
		IntStream.range(0,5)
			.filter((int n) -> {return n % 2 ==0; }) //Ao usar {} tem que ter o return e o ; no final da expressao
			.forEach(System.out::println);
	}
	
	private static void funcoesUsandoChavesComMaisdeUmaLinha() {
		IntStream.range(0,5)
		.filter((int n) -> {
			System.out.println("Apenas um teste usando chaves com mais de uma linha");
			return n % 2 ==0; 
		})
		.forEach(System.out::println);//Ao usar {} tem que ter o return e o ; no final da expressao

		
	}

	
	
	
	

}

package br.com.roberto.revisionstream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Java8Streams4 {

	private static List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6);

	/**
	 * Trabalhando com Streams_Reduce usando a sobrecarga identidade e acumulador
	 * 
	 * O valor de identidade tem que ser um valor que quando eu chamo ele ou outro valor, "tem que ser o outro valor"
	 * 
	 * 
	 * reduce => Pega todos os elementos de um Stream, juntar eles; em seguida
	 * agrupa de alguma forma, depois disponibiliza em uma saída.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		impressaoSimplesDaLista();
		impressaoReduceSoma();
		impressaoReduceMultiplicacao();
		impressaoReduceConcatenacaoStrings();
		/*impressaoReduceSubtracao();*/

	}

	private static void impressaoSimplesDaLista() {
		lista.stream().forEach(System.out::println); // Method Reference
	}

	private static void impressaoReduceSoma() {

		Integer soma = lista.stream()
					.reduce(0,(n1, n2) -> n1 + n2);
		System.out.println(soma);
	}

	private static void impressaoReduceMultiplicacao() {

		Integer multiplicacao = lista.stream()
					.reduce(1,(n1, n2) -> n1 * n2);
		System.out.println(multiplicacao);
	}
	
	private static void impressaoReduceConcatenacaoStrings() {
		String s = "Meu nome é Carlos Roberto Medeiros";
		String[] split = s.split(" "); // O split com Espaço Junta tudo 
		//String[] split = s.split(""); // O split sem espaço mantém o elemento como está
		List<String> listaStr = Arrays.asList(split);
		
		String concatenacao = listaStr.stream()
					.reduce("",(s1,s2) -> s1.concat(s2));
		
		System.out.println(listaStr);
		System.out.println(concatenacao);
	}
	
	
	/**
	 * Aqui da problema pois a função não é associativa
	 * o reduce não consegue dividir para executar em partes 
	 * SE LIGAR EM FUNÇÕES ASSOCIATIVAS
	 */
	/*private static void impressaoReduceSubtracao() {
	
		Optional<Integer> subtracao = lista.stream()
				.parallel()	
				.reduce((n1, n2) -> n1 - n2);
		System.out.println(subtracao.get());
	}*/
	
	

}

// Resumo Simples: https://rinaldo.dev/java-8-streams-pare-de-usar-for-e-simplifique-seu-codigo/
// Continuar daqui: https://www.youtube.com/watch?v=2aHElyENpuM&list=PLuYctAHjg89ZkhgOQo0zcTtmHY5nuRYud&index=5
// A partir de 19:20

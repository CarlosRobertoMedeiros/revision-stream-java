package br.com.roberto.revisionstream.h.streamcreation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//Continuar a Partir de 1:30 - https://www.youtube.com/watch?v=GXfPBb-8YOE&list=PLuYctAHjg89ZkhgOQo0zcTtmHY5nuRYud&index=11
public class Exemplo1Java8StreamCriacaoDeStreams {

	public static void main(String[] args) {
		criacaodeStreamUsandoCollection();
		criandoStreamUsandoArrays();
		criandoStreamUsandoStreamOf();
		criandoStreamUsandoIntStream();
		criandoStreamComIterate();
		//lendoLinhasDeArquivoComoStream();
		criandoStreamComNumeroRandomico();
		criandoStremComExpressoesRegulares();
		
	}

	private static void criacaodeStreamUsandoCollection() {
		// Basta olhar as Collection da Interface List
		List<Integer> lista = Arrays.asList(1, 2, 3, 4);
		lista.stream().forEach(System.out::println);

	}
	
	private static void criandoStreamUsandoArrays() {
		Integer[] intArray = new Integer[] {1,2,3,4};
		Arrays.stream(intArray).forEach(System.out::println);
		
	}
	
	/*
	 * Pode Passar qualquer objeto não apenas String
	 * Pode ser qualquer tipo
	 */
	private static void criandoStreamUsandoStreamOf() {

		Stream
			.of("Carlos","Roberto","Medeiros")
			.forEach(System.out::println);
		
	}
	
	private static void criandoStreamUsandoIntStream() {
		///range e rangeClosed
		IntStream.range(0,5)
			.forEach(System.out::println);
		
	}
	
	private static void criandoStreamComIterate() {
		Stream
			.iterate(5, n -> n * 2) //Cria um Stream Infinito
			.limit(10)
			.forEach(System.out::println);
		
	}
	
	private static void lendoLinhasDeArquivoComoStream() throws IOException {
		//arquivo.txt tem 3 linhas com os valores 11, 12 e 13
		File file = new File("arquivo.txt");
		FileReader in = new FileReader(file);
		try (BufferedReader br = new BufferedReader(in)){
			br.lines().forEach(System.out::println);
		}
		
		//Usando Files
		Path p = Paths.get("");
		Files.list(p).forEach(System.out::println);
		
	}
	
	private static void criandoStreamComNumeroRandomico() {
		new Random()
			.ints()
			.limit(10)
			.forEach(System.out::println);
	}
	
	private static void criandoStremComExpressoesRegulares() {
		String s = "Carlos Roberto Medeiros";
		Pattern p = Pattern.compile(" ");
		p.splitAsStream(s).forEach(System.out::println);
	}

}

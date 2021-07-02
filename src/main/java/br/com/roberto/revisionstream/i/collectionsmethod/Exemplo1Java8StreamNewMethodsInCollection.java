package br.com.roberto.revisionstream.i.collectionsmethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//https://www.youtube.com/watch?v=J_v0tq-T1lM&list=PLuYctAHjg89ZkhgOQo0zcTtmHY5nuRYud&index=12
//Continuar a partir de 6:34
public class Exemplo1Java8StreamNewMethodsInCollection {

	public static void main(String[] args) {
	
		//Exemplos Utilizando List
		List<Integer> lista = new ArrayList<>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		
		lista.forEach(n -> System.out.println(n));//forEach
		
		lista.removeIf(n -> n % 2 == 0); //removeif
		lista.forEach(n -> System.out.println(n));
		lista.replaceAll(n -> n * 2); //replaceAll
		lista.forEach(n -> System.out.println(n));
		
		//Exemplos Utilizando Mapas
		HashMap<Integer, String> mapa = new HashMap<>();
		mapa.put(0, "Carlos");
		mapa.put(1, "Roberto");
		mapa.put(2, "Medeiros");
		
		//forEach
		mapa.forEach((k,v) -> System.out.println(k +" "+ v));//BiComsumer
		
		//compute
		//mapa.compute(1,  (k , v) -> v + " agora");//compute, pega o elemento de chave 1 e concatena com agora
		mapa.forEach((k,v) -> System.out.println(k +" "+ v));//BiComsumer
		
		//merge //Usado tanto se valor estiver no mapa ou não
		mapa.merge(2,"!", (v1 , v2) -> v1 + v2);
		mapa.forEach((k,v) -> System.out.println(k +" "+ v));//BiComsumer
		
		//replaceAll
		mapa.replaceAll((k , v) -> v + " !" );
		mapa.forEach((k,v) -> System.out.println(k +" "+ v));//BiComsumer
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
}

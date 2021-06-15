package br.com.roberto.revisionstream;


/**
 * Utilizando Optional para substituir os "null"
 * {@link} https://www.youtube.com/watch?v=hmU2QEEc4sU&list=PLuYctAHjg89ZkhgOQo0zcTtmHY5nuRYud&index=4	
 * Continuar a partir de 1:43	
 * @author carlos
 *
 */
public class Java8Optional {
	
	public static void main(String[] args) {
		
		String s = "1";
		Integer converteEmNumero = converteEmNumero(s);
		System.out.println(converteEmNumero);
		
	}
	
	
	/***
	 * Usado Assim Até o Java 7
	 * @param numeroStr
	 * @return
	 */
	public static Integer converteEmNumero(String numeroStr) {
		return Integer.valueOf(numeroStr);
	}

}

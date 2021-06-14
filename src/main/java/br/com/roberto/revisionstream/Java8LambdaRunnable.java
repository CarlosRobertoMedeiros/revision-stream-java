package br.com.roberto.revisionstream;

public class Java8LambdaRunnable {
	
	public static void main(String[] args) {
		
		/**
		 * Método Utilizando o Java 7
		 * Método SAM (Single Abstract Method)
		 * */
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Olá Mundo Thread Java 7 ");	
			}
		}).run();
		
		/**
		 *  Método Utilizando as Interfaces Funcionais do Java 8
		 * SAM (Single Abstract Method)
		 * Lambda @FunctionalInterface
		 * 
		 * */
		new Thread(() -> System.out.println("Olá Mundo Thread Java 8 ")).run();
	
	}
}

//Continuar a partir daqui
//https://www.youtube.com/watch?v=lbCYLgoVpfQ&list=PLuYctAHjg89ZkhgOQo0zcTtmHY5nuRYud&index=1

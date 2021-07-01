package br.com.roberto.revisionstream.a.entendimento;

public class Exemplo2Java8LambdaRunnable {
	
	/**
	 * Exemplo 2 => Utilizando o Padrão SAM
	 * @param args
	 */
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
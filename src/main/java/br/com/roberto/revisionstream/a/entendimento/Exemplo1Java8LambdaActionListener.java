package br.com.roberto.revisionstream.a.entendimento;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Exemplo1Java8LambdaActionListener {


	/**
	 * Exemplo 1
	 * 
	 * Usando um ActionListener apenas para demonstrar a utilização entre java 7 e 8
	 * Nesse exemplo a Interface ActionListener não é abstrata, porém tem apenas um método, o que se torna viável para a programação funcional
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		JButton jButton = new JButton();
		
		/**
		 * Método Utilizando Java 7
		 */
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Olá Mundo !");		
				
			}
		});
		
		/**
		 * Método Utilizando Java 8
		 */
		JButton jbutton2 = new JButton();
		jbutton2.addActionListener(e -> System.out.println("Olá Mundo !"));

	}

}

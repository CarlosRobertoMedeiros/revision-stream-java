package br.com.roberto.revisionnewapidate.a;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Continuar daqui: https://www.youtube.com/watch?v=YHVD8PW97y4&list=PLuYctAHjg89Z6BDg319ADULCmIQJ2y0yE&index=4
 * @author carlos
 * Continuar a partir de 3 minutos
 *
 */
public class Exemplo4FormatacaoeParseDataeHora {
	
	public static void main(String[] args) {
		
		// DateTimeFormatter = Classe de formatação de datas em formatos String
		
		DateTimeFormatter isoDateTime = DateTimeFormatter.ISO_DATE_TIME;
		
		LocalDateTime ldtNow = LocalDateTime.now();
		System.out.println(ldtNow);
		
		String format = isoDateTime.format(ldtNow);
		System.out.println(format);

		 

	}

}

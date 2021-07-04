package br.com.roberto.revisionnewapidate.a;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
import java.util.Locale;

/**
 * Continuar daqui: https://www.youtube.com/watch?v=YHVD8PW97y4&list=PLuYctAHjg89Z6BDg319ADULCmIQJ2y0yE&index=4
 * @author carlos
 * Continuar a partir de 3 minutos
 *
 */
public class Exemplo4FormatacaoeParseDataeHora {
	
	public static void main(String[] args) {
		
		// Antigamente usava DateFormat e SimpleDateFormat
		// DateTimeFormatter = Classe de formatação de datas em formatos String
		
		exemploComDateFormat();
		exemploComDateFormatUsandoFormatStyle();
		exemploComDataAplicandoFormatadorParaString();
		exemploComStringAplicandoFormatadorData();
		
		

		 

	}

	private static void exemploComDateFormat() {
		DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
		
		LocalDateTime ldtNow = LocalDateTime.now();
		System.out.println(ldtNow);
		
		String format = formatter.format(ldtNow);
		System.out.println(format);
		
	}
	
	private static void exemploComDateFormatUsandoFormatStyle() {
		
		//Cuidado da Dependência do Locale
		//Locale.setDefault(Locale.US);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		
		LocalDateTime ldtNow = LocalDateTime.now();
		System.out.println(ldtNow);
		
		String format = formatter.format(ldtNow);
		System.out.println(format);
		
	}
	
	private static void exemploComDataAplicandoFormatadorParaString() {
		//Data para String
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		LocalDateTime ldtNow = LocalDateTime.now();
		System.out.println(ldtNow);
		
		String format = formatter.format(ldtNow);
		System.out.println(format);
	}
	
	private static void exemploComStringAplicandoFormatadorData() {
	
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		LocalDateTime ldtNow = LocalDateTime.now();
		System.out.println(ldtNow);
		
		String format = formatter.format(ldtNow);
		System.out.println(format);
		
		TemporalAccessor parse = formatter.parse("04/07/2021 12:14:18");
		
		LocalDateTime from = LocalDateTime.from(parse);
		System.out.println(from);
		
	}

}

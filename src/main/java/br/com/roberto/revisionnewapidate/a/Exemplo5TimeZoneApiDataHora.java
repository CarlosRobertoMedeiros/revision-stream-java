package br.com.roberto.revisionnewapidate.a;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.util.Locale;

/**
 * Continuar daqui: https://www.youtube.com/watch?v=YHVD8PW97y4&list=PLuYctAHjg89Z6BDg319ADULCmIQJ2y0yE&index=4
 * @author carlos
 * Continuar a partir de 3 minutos
 *
 */
public class Exemplo5TimeZoneApiDataHora {
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.forLanguageTag("pt-BR"));
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		DateFormat dateFormatter = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
				
		
		
		LocalDate localDate = LocalDate.of(1899, 8, 6);
		LocalTime localTime = LocalTime.of(23,59);
		ZoneId zoneId = ZoneId.of("America/Sao_Paulo");
		
		ZonedDateTime zdt = ZonedDateTime.of(localDate, localTime, zoneId);
		Date date = new Date(zdt.toInstant().toEpochMilli());
		
		//Formato configurado para "06/08/1899 23:59:00
		System.out.println(dateTimeFormatter.format(zdt));
		System.out.println(dateFormatter.format(date));
		
		System.out.println(zdt.getZone()+ " - "+ zdt.getOffset());
		System.out.println(date.getTimezoneOffset());
		
		//LMT - (Local Mean Time) Era usado assim com a Classe Date antes de 1900
		
			 

	}

	
}

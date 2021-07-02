package br.com.roberto.revisionnewapidate.a;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Exemplo1DateClassesNewApi {
	
	public static void main(String[] args) {
		
		// LocalDate     - representa uma data: 06/08/2010
		// LocalTime     - representa uma hora: 11:40:00
		// LocalDateTime - representa data e hora: 06/08/2010 11:40:00 -> Sem TimeZone(Fuso Horário não faz diferença)
		// Instant       - representa um momento na linha do tempo (começa a partir de 01/01/1970 às 00:00)
		//							Ex. 06/08/2010 11:40:00 GMT/UTC leva em consideração o TimeZone no fuso horário 0
		
		//ZonedDateTime  - represeta uma LocalDateTime com TimeZone(Fuso Horário) 
		// 							Ex. 06/08/2010 11:40:00 GMT-3 (America/Sao_Paulo)
		
		// Métodos of servem 
		
		//A Classe LocalDate é privada
		LocalDate ldNow = LocalDate.now();
		System.out.println(ldNow);
		
		LocalDate minusMonths = ldNow.plusWeeks(3).plusDays(2).minusMonths(-1);
		System.out.println(minusMonths);
		
		LocalDate ld = LocalDate.of(2005,Month.APRIL, 6);
		System.out.println(ld);
		
		LocalTime ltNow = LocalTime.now();
		System.out.println(ltNow);
		
		LocalTime lt = LocalTime.of(10,20,03,100000);
		System.out.println(lt);
		
		LocalDateTime ldtNow = LocalDateTime.now();
		System.out.println(ldtNow);
		LocalDateTime ldt = LocalDateTime.of(ld,lt);
		System.out.println(ldt);
		
		Instant iNow = Instant.now();
		System.out.println(iNow);
		
		Instant ofEpochMilli = Instant.ofEpochMilli(500000L);
		System.out.println(ofEpochMilli);
		
		
		ZonedDateTime zdtNow = ZonedDateTime.now();
		System.out.println(zdtNow);
		
		ZonedDateTime zdt = ZonedDateTime.of(ldt, ZoneId.of("America/Montevideo"));
		System.out.println(zdt);
		
		
	}

}

package br.com.roberto.revisionnewapidate.a;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

/**
 * Continuar daqui: https://www.youtube.com/watch?v=Ck4E3bXkQPI&list=PLuYctAHjg89Z6BDg319ADULCmIQJ2y0yE&index=2
 * @author carlo
 *
 */
public class Exemplo2DateClassesNewApiPeriodoAndDuration {
	
	public static void main(String[] args) {
		//Period = valores baseados em datas (dia mes e ano)
		//Duration = valores baseados em tempos (hora minuto segundo e nanosegundo)		
		exemplosPeriod();
		exemplosDuration();
		exemploCalculandoIdade();
		
	}

	private static void exemplosPeriod() {
		Period of = Period.of(1, 5, 3);
		System.out.println(of); //P1Y5M3D Período 1 ano 5 meses 3 dias
		
		Period ofMonths = Period.ofMonths(5);
		System.out.println(ofMonths); //P5M Período 5 meses
		
		Period ofWeeks = Period.ofWeeks(5);
		System.out.println(ofWeeks); //P35D Período de 35 dias
		
		Period ofYears = Period.ofYears(5);
		System.out.println(ofYears); //P5Y Período 5 anos
		
		LocalDate ld = LocalDate.of(1990, Month.AUGUST , 6);
		LocalDate ld2 = ld.plusWeeks(2).plusDays(1).minusMonths(1);
		
		Period periodBetween = Period.between(ld, ld2);//P-16D  Período de 16 Dias
		System.out.print(periodBetween);
		
		Period plusDays = periodBetween.plusDays(15);
		System.out.println(plusDays); //P-16DP-1D Acrescenta por fora
		
		Period until = ld.until(ld2);
		System.out.println(until); //P-16D
		
		LocalDate plus = ld.plus(ofYears);
		System.out.println(plus); //1995-08-06 soma cinco anos

		
	}
	
	private static void exemplosDuration() {
		Duration ofDays = Duration.ofDays(1);
		System.out.println(ofDays); //PT24H
		
		Duration ofHours = Duration.ofHours(1);
		System.out.println(ofHours); //PT1H
		
		Duration ofMinutes = Duration.ofMinutes(500);
		System.out.println(ofMinutes); //PT8H20M
		
		Duration ofSeconds = Duration.ofSeconds(10, 5000);
		System.out.println(ofSeconds); //PT10.000005S
		
		LocalTime ltNow = LocalTime.now();
		LocalTime lt = LocalTime.of(11,10,01);
		System.out.println(lt); //11:10:01.000100
		
		Duration between = Duration.between(ltNow, lt);
		System.out.println(between); //PT38M45.287S
		
		Duration plusMilis = between.plusMillis(500);
		System.out.println(plusMilis); //PT37M19.484S 

	}
	
	private static void exemploCalculandoIdade() {
		LocalDate hoje = LocalDate.now();
		LocalDate dtNascimento = LocalDate.of(1981, 12, 12);
		
		Period minhaIdade = Period.between(dtNascimento, hoje);
		System.out.println(minhaIdade); //P39Y6M21D
		
	}

}

package br.com.roberto.revisionnewapidate.a;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Continuar daqui: https://www.youtube.com/watch?v=Ck4E3bXkQPI&list=PLuYctAHjg89Z6BDg319ADULCmIQJ2y0yE&index=2
 * @author carlos
 *
 */
public class Exemplo3InstantLocalDateouZonedDateTime {
	
	public static void main(String[] args) {
		
		// LocalDateTime = Data + Hora
		// ZonedDateTime = Data + Hora + Fuso Horário Específico
		// Instant       = Data + Hora + UTC/GMT //Representa eventos na linha do tempo
		
		Instant now = Instant.now();
		System.out.println(now);
		
		//Para somar usa-se as funções específicas
		ZonedDateTime atZone = now.atZone(ZoneId.of("America/Sao_Paulo"));
		ZonedDateTime plusMonths = atZone.plusMonths(1);
		
	}

}

package data_hora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DataHora {

    public static void main(String[] args) {
        
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

        System.out.println("Instanciação");
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2025-02-05T01:30:26");
        Instant d06 = Instant.parse("2025-02-05T01:30:26Z");
        Instant d07 = Instant.parse("2025-02-05T01:30:26-03:00"); // Horário de São Paulo
        LocalDate d08 = LocalDate.parse("20/07/2022",fmt1);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30",fmt2);
        LocalDate d10 = LocalDate.of(2022, 07,20);
        LocalDateTime d11 = LocalDateTime.of(22,07,20,1,30);

        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);
        System.out.println("d10 = " + d10);
        System.out.println("d11 = " + d11);
        System.out.println();

        System.out.println("Formatação");
        System.out.println("d04 = " + d04.format(fmt1));
        System.out.println("d04 = " + fmt1.format(d04));
        System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("d05 = " + d05.format(fmt1));
        System.out.println("d05 = " + d05.format(fmt2));
        System.out.println("d05 = " + d05.format(fmt4));
        System.out.println("d06 = " + fmt3.format(d06));
        System.out.println("d06 = " + fmt5.format(d06));

        System.out.println();
        System.out.println("Convetendo data-hora local para global");
        //for(String z : ZoneId.getAvailableZoneIds()) {
        //   System.out.println(z); 
        //}

        LocalDate r1 = LocalDate.ofInstant(d06,ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06,ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06,ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06,ZoneId.of("Portugal"));


        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);
        System.out.println();

        System.out.println("Obter dados de uma hora local");
        System.out.println("d04 dia = " + d04.getDayOfMonth());
        System.out.println("d04 mes = " + d04.getMonthValue());
        System.out.println("d04 ano = " + d04.getYear());

        System.out.println("d05 hora = " + d05.getHour());
        System.out.println("d05 minutos = " + d05.getMinute());
        System.out.println();

        System.out.println("Calculo com datas");
        
        LocalDate pastWeekLocalDate = d04.minusWeeks(1);
        System.out.println("D04 = " + d04);
        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);

        LocalDate nextWeekLocalDate = d04.plusWeeks(1);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
        System.out.println();

        LocalDateTime pastWeekLocalDateTime = d05.minusWeeks(1);
        System.out.println("D05 = " + d05);
        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);

        LocalDateTime nextWeekLocalDateTime = d05.plusWeeks(1);
        System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
        System.out.println();

        Instant pastWeekInstant = d06.minus(7,ChronoUnit.DAYS);
        System.out.println("D06 = " + d06);
        System.out.println("pastWeekInstant = " + pastWeekInstant);

        Instant nextWeekInstant = d06.plus(7,ChronoUnit.DAYS);
        System.out.println("nextWeekInstant = " + nextWeekInstant);
        System.out.println();

        System.out.println("Duracao entre datas");
        Duration t1 = Duration.between(pastWeekLocalDate.atTime(0,0), d04.atTime(0,0));
        Duration t1_1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t1_1 dias = " + t1_1.toDays());

        Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
        System.out.println("t2 dias = " + t2.toDays());

        Duration t3 = Duration.between(pastWeekInstant, d06);
        Duration t4 = Duration.between(d06,pastWeekInstant);
        System.out.println("t3 dias = " + t3.toDays());
        System.out.println("t4 dias = " + t4.toDays());
    }
}

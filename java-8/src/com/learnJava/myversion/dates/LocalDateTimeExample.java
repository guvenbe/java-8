package com.learnJava.myversion.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class LocalDateTimeExample {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime=" + localDateTime);

        System.out.println(localDateTime.of(2018, 9, 23 ,12, 00, 00,1000));

        System.out.println(LocalDateTime.of(LocalDate.now(), LocalTime.now()));

        //Getting local time from LocalDateTime

        System.out.println("hour=" + localDateTime.getHour());
        System.out.println("minute=" + localDateTime.getMinute());
        System.out.println("getDayOfMonth=" + localDateTime.getDayOfMonth());
        System.out.println("getDayOfMonth=" + localDateTime.get(ChronoField.DAY_OF_MONTH));

        //Modifying Local datetime
        System.out.println("plus 5 hour =" + localDateTime.plusHours(5));
        System.out.println("minus 5 days =" + localDateTime.minusDays(5));
        System.out.println("month to 12 =" + localDateTime.withMonth(12));

        //converting localdate, localtime tom localdatetime viceversa

        LocalDate localDate = LocalDate.of(2019,02,17);

        LocalTime localTime = LocalTime.of(12,00,05);
        System.out.println("localDate=" +localTime.atDate(localDate));

        LocalDateTime localDateTime1 =localTime.atDate(localDate);
        System.out.println("toLocalDate=" + localDateTime1.toLocalDate());
        System.out.println("toLocalTime=" + localDateTime1.toLocalTime());




    }
}

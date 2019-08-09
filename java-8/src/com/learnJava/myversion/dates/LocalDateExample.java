package com.learnJava.myversion.dates;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println("Current Date is " + localDate);

        LocalDate localDate1 =LocalDate.of(1966,2,17);
        System.out.println("localDate1=" + localDate1);

        LocalDate localDate2= LocalDate.ofYearDay(1966,365);
        System.out.println("localDate2=" + localDate2);

        // Get Values from localDate
        System.out.println("getMonth=" + localDate.getMonth());
        System.out.println("getMonthValue=" + localDate.getMonthValue());
        System.out.println("getDayOfWeek" + localDate.getDayOfWeek());
        System.out.println( "getDayOfYear=" +localDate.getDayOfYear());
        System.out.println( "get  DAY_OF_MONTH=" +localDate.get(ChronoField.DAY_OF_MONTH));
        System.out.println( "get=" +localDate.get(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));

        //Modifying Local Date
        System.out.println("plusDays="  + localDate.plusDays(2));
        System.out.println("plusMonths=" + localDate.plusMonths(2));
        System.out.println("minusMonths=" + localDate.minusMonths(2));
        System.out.println("withYear=" + localDate.withYear(2022));
        System.out.println("with ChronoField=" + localDate.with(ChronoField.YEAR, 2020));
        System.out.println("ChronoUnit minus=" + localDate.minus(1 , ChronoUnit.YEARS));

        //Additional support methods

        System.out.println("isLeapYear=" + localDate.isLeapYear());
        System.out.println("isLeapYear=" + LocalDate.ofYearDay(2020, 01).isLeapYear());

        System.out.println("localDate=" + localDate);
        System.out.println("localDate1=" + localDate1);
        System.out.println("isEqual=" + localDate.isEqual(localDate1));
        System.out.println("isBefore=" + localDate.isBefore(localDate1));
        System.out.println("isBefore=" + localDate.isBefore(localDate1));
        System.out.println("isEqual=" + localDate.isBefore(localDate1));







    }
}

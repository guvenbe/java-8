package com.learnJava.myversion.dates;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println("localTime=" +localTime);

        LocalTime localTime1 = LocalTime.of(12,12,00,10000123);
        System.out.println("localTime1=" + localTime1);

        // Getting the values the localtime instance
        System.out.println("getHour=" +localTime.getHour());
        System.out.println("getMinute=" +localTime.getMinute());

        System.out.println("CLOCK_HOUR_OF_DAY= " +localTime.get(ChronoField.CLOCK_HOUR_OF_DAY));
        System.out.println("toSecondOfDay= " +localTime.toSecondOfDay());

        //Modify value of localtime

        System.out.println("minusHours 2 =" +localTime.minusHours(2));
        System.out.println("minusHours 2 Chronounit =" +localTime.minus(2, ChronoUnit.HOURS));
        System.out.println("Midnight Chronounit =" +localTime.with(LocalTime.MIDNIGHT));
        System.out.println("Change Hour of the =" +localTime.with(ChronoField.HOUR_OF_DAY,20));
        System.out.println("add minutes =" +localTime.plusMinutes(30));
        System.out.println("with hour =" +localTime.withHour(10));

    }
}

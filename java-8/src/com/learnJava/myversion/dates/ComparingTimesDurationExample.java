package com.learnJava.myversion.dates;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class ComparingTimesDurationExample {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(7,20);

        LocalTime localTime1 = LocalTime.of(8,20);

        long minutesDiff= localTime.until(localTime1,ChronoUnit.MINUTES); // the end time is always exclusive
        System.out.println("until Minutes Diff : " + minutesDiff);

        Duration duration = Duration.between(localTime,localTime1);
        System.out.println("duration  : " +  duration.toMinutes());

        Duration duration1 = Duration.ofHours(3);
        System.out.println(duration1.toMinutes());

        Duration duration2 = Duration.ofMinutes(3);
        System.out.println(duration2.toMinutes());


        /**
         * LocalDateTime
         */
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("now=" + localDateTime);
        LocalDateTime localDateTime1 = LocalDateTime.of(2019,8,25,23,59);

        Duration duration3 = Duration.between(localDateTime,localDateTime1);

        System.out.println("duration3days=" +duration3.toDays());
        System.out.println("duration3hour=" +duration3.toHours());

        /**
         * LocalDate - not supported
         */

        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.of(2018, 8,13);

        Duration duration4 = Duration.between(localDate,localDate1);
        System.out.println(duration4.toDays());

    }
}

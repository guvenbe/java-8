package com.learnJava.myversion.dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
        G	Era designator	Text	AD
        y	Year	Year	1996; 96
        Y	Week year	Year	2009; 09
        M	Month in year (context sensitive)	Month	July; Jul; 07
        L	Month in year (standalone form)	Month	July; Jul; 07
        w	Week in year	Number	27
        W	Week in month	Number	2
        D	Day in year	Number	189
        d	Day in month	Number	10
        F	Day of week in month	Number	2
        E	Day name in week	Text	Tuesday; Tue
        u	Day number of week (1 = Monday, ..., 7 = Sunday)	Number	1
        a	Am/pm marker	Text	PM
        H	Hour in day (0-23)	Number	0
        k	Hour in day (1-24)	Number	24
        K	Hour in am/pm (0-11)	Number	0
        h	Hour in am/pm (1-12)	Number	12
        m	Minute in hour	Number	30
        s	Second in minute	Number	55
        S	Millisecond	Number	978
        z	Time zone	General time zone	Pacific Standard Time; PST; GMT-08:00
        Z	Time zone	RFC 822 time zone	-0800
        X	Time zone	ISO 8601 time zone	-08; -0800; -08:00
*/

public class FormattingLocalDateExample {
    public static void parseLocalDate(){
        /**
         * Using system defined format
         */
        String date = "2018-04-28";
        LocalDate localDate0 =  LocalDate.parse(date);
        System.out.println("localDate0 : " + localDate0);
        LocalDate localDate = LocalDate.parse(date,DateTimeFormatter.ISO_LOCAL_DATE); //ISO_DATE is the same
        System.out.println("localDate " + localDate);

        String isoDate = "20180428";
        System.out.println("BASIC_ISO_DATE : " +LocalDate.parse(isoDate,DateTimeFormatter.BASIC_ISO_DATE));


        /**
         * Custom system defined format
         */
        String date1 = "2018|04|28";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
        LocalDate localDate1 = LocalDate.parse(date1,dateTimeFormatter);
        System.out.println("localDate1 : " + localDate1);

        String date2 = "2018*04*28";
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("uuuu*MM*dd");
        LocalDate localDate2 = LocalDate.parse(date2,dateTimeFormatter1);
        System.out.println("localDate2 : " + localDate2);
    }

    public static void formatLocalDate(){
        //DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd|MM|yyyy");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("YYYY|MM|dd");
        LocalDate localDate = LocalDate.now();
        String formattedDate = localDate.format(dateTimeFormatter);
        System.out.println("formattedDate : " + formattedDate);

    }

    public static void main(String[] args) {
        parseLocalDate();
        formatLocalDate();

    }
}

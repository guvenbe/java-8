package com.learnJava.myversion.numericstreams;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class numericStreamMapExample {

    public static List <Integer> mapToObj(){
        return IntStream.rangeClosed(1,5)
                .mapToObj(i-> {
                    return new Integer(i);
                })
                .collect(toList());
    }

    public static long mapToLongSum(){
        return IntStream.rangeClosed(1,5)//intstream
                //i value is passed from the intStream
                .mapToLong((i) ->i) //convert intstream to longStream
                .sum();
    }

    public static List<Long> mapToLong(){
        return  IntStream.rangeClosed(1,5)
                .mapToObj(i->{
                    return new Long(i);
                }).collect(toList());

    }
    public static List<Double> mapToDouble(){
        return  IntStream.rangeClosed(1,5)
                .mapToObj(i->{
                    return new Double(i);
                }).collect(toList());

    }
    public static double mapToDoubleSum(){
        return  IntStream.rangeClosed(1,5)
                .mapToDouble(i->i)
                .sum();

    }

    public static void main(String[] args) {
        System.out.println("mapToObj : " + mapToObj());
        System.out.println("mapToObjLongSum : " + mapToLongSum());
        System.out.println("mapToObjLong : " + mapToLong());
        System.out.println("mapToObjDouble : " + mapToDouble());
        System.out.println("mapToObjDoubleSum : " + mapToDoubleSum());
    }
}

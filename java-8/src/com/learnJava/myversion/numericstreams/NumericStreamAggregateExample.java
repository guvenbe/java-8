package com.learnJava.myversion.numericstreams;


import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {
    public static void main(String[] args) {

        int sum= IntStream.rangeClosed(1,50).sum();

        System.out.println("sum is :" + sum);

        OptionalInt maxAsOptionalInt = IntStream.rangeClosed(1,50).max();
        System.out.print("max value is :");
        System.out.println(maxAsOptionalInt.isPresent() ?maxAsOptionalInt.getAsInt() : 0);

        OptionalLong minOptionalLong = LongStream.rangeClosed(50,100).min();
        System.out.print("min Long value is :");
        System.out.println(minOptionalLong.isPresent() ?minOptionalLong.getAsLong() : 0);


        OptionalDouble AvgAsOptionalDouble = IntStream.rangeClosed(1,50).average();
        System.out.print("Avg As Double is :");
        System.out.println(AvgAsOptionalDouble.isPresent() ?AvgAsOptionalDouble.getAsDouble() : 0);

    }
}

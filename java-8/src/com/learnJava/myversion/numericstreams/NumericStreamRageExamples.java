package com.learnJava.myversion.numericstreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRageExamples {

    public static void main(String[] args) {

        IntStream intStream= IntStream.range(1,50);
        System.out.println("Range Count:" +intStream.count());

        IntStream.range(1,50).forEach(value -> System.out.print(value + ", "));
        System.out.println();
        System.out.println("Range closed count:" + IntStream.rangeClosed(1,50).count());
        IntStream.rangeClosed(1,50).forEach(value -> System.out.print(value + ", "));

        System.out.println();

        System.out.println("Long Stream Range closed count:" + LongStream.rangeClosed(1,50).count());
        LongStream.rangeClosed(1,50).forEach(value -> System.out.print(value + ", "));

        System.out.println();
        IntStream.range(1,50).asDoubleStream().forEach(value -> System.out.print(value + ", "));

    }
}

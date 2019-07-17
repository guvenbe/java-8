package com.learnJava.myversion.streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfGenerateIterateExample {
    public static void main(String[] args) {
        Stream <String> stringStream=Stream.of("adam", "dan", "julie");
        stringStream.forEach(System.out::println);

        //Infinite without limit
        Stream.iterate(1, x->x*2)
                .limit(10)
                .forEach(System.out::println);

        Supplier<Integer> integerSupplier = new Random()::nextInt;

        //Takes supplier and generates infinite
        Stream.generate(integerSupplier)
                .limit(5)
            .forEach(System.out::println);
    }
}

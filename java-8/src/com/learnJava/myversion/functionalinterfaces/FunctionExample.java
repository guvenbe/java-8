package com.learnJava.myversion.functionalinterfaces;

import java.util.function.Function;

public class FunctionExample {

    static Function<String,String> function =(name)->name.toUpperCase();
    static Function<String,String> addSomeSting =(name)->name.toUpperCase().concat("defult");

    public static void main(String[] args) {
        System.out.println("Result is : " + function.apply("bora"));

        System.out.println("Result with Concat is: " + function.andThen(addSomeSting).apply("bora2"));

        System.out.println("Result with Concat is: " + function.compose(addSomeSting).apply("bora2"));
    }
}

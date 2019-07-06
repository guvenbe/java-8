package com.learnJava.myversion.functionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> predicate1 = (integer) -> integer%2 ==0;


    static Predicate<Integer> predicate2 = (integer) -> integer%2 ==0;

    static Predicate<Integer> predicate3 = (integer) -> integer%5 ==0;

    public static void  predicateAnd(){
        System.out.println("predicateAnd result 10 is "+predicate2.and(predicate3).test(10));
        System.out.println("predicateAnd result 9 is "+predicate2.and(predicate3).test(9));
    }

    public static void  predicateOr(){
        System.out.println("predicateOr result 10 is "+predicate2.or(predicate3).test(12));
        System.out.println("predicateOr result 9 is "+predicate2.or(predicate3).test(9));
    }

    public static void  predicateNegate(){

        System.out.println("predicateNegate result 10 is "+predicate2.or(predicate3).negate().test(10));
    }
    public static void main(String[] args) {


        System.out.println(predicate1.test(7));


        System.out.println(predicate2.test(7));
        System.out.println(predicate1.test(8));

        predicateAnd();
        predicateOr();
        predicateNegate();
        };


    }



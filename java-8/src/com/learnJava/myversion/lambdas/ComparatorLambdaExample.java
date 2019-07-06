package com.learnJava.myversion.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {

        /**
        * Prior java 8
        */

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);    //O -> 01==02
                                            //1 -> o1>02
                                            //-1 -> o1<o2

            }
        };

        System.out.println("Result of the comparator is: " + comparator.compare(3,2));


        /**
        * Lambda way java 8
        */

        Comparator<Integer> comparatorLambda1 = (Integer a , Integer b) -> a.compareTo(b);
        System.out.println("Result of the comparator using lambda1 is: " + comparatorLambda1.compare(3,2));

        Comparator<Integer> comparatorLambda2 = (a,b) -> a.compareTo(b);
        System.out.println("Result of the comparator using lambda2 is: " + comparatorLambda2.compare(3,2));


    }
}

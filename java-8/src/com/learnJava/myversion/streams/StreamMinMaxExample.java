package com.learnJava.myversion.streams;

import java.util.*;

public class StreamMinMaxExample {
    public static int findMaxValue(List<Integer> integerList){
        return integerList.stream().reduce(0, (x,y)-> x>y ? x:y);
    }

    //Below yeild wrong results: This is the value from identity result. Alway use optional
    //for min
    public static int findMinValue(List<Integer> integerList){
        return integerList.stream().reduce(0, (x,y)-> x<y ? x:y);
    }

    public static Optional <Integer> findMaxValueOptional(List<Integer> integerList){
        return integerList.stream().reduce((x,y)-> x>y ? x:y);
    }

    public static Optional <Integer> findMinValueOptional(List<Integer> integerList){
        return integerList.stream().reduce((x,y)-> x<y ? x:y);
    }

    public static void main(String[] args) {
        List<Integer> integerList =  Arrays.asList(6,7,8,9,10);
//        List<Integer> integerList =  new ArrayList <>();

        int maxValue = findMaxValue(integerList);
        System.out.println(" max value is " + maxValue);

        Optional<Integer> maxValueOptional = findMaxValueOptional(integerList);
        System.out.println("Optional max is:" + maxValueOptional);
        if(maxValueOptional.isPresent()){
            System.out.println("max with optional: " +maxValueOptional.get());
        }
        else{
            System.out.println("No value found in list");
        }


        int minValue = findMinValue(integerList);
        System.out.println(" min value is " + minValue);

        Optional<Integer> minValueOptional = findMinValueOptional(integerList);
        System.out.println("Optional min is:" + minValueOptional);
        if(minValueOptional.isPresent()){
            System.out.println("min with optional: " +minValueOptional.get());
        }
        else{
            System.out.println("No value found in list");
        }
    }
}

package com.learnJava.myversion.defaults;

import java.util.List;

public interface Multiplier {
    int multiply(List <Integer> integerList);

    default int size(List<Integer>  integerList){
        System.out.println("Inside Multlier Interface");
        return integerList.size();
    }

    default int sum(List<Integer> integerList){
        return integerList.stream().reduce(0,(x,y)->x+y);
    }

    static boolean isEmpty(List<Integer> integerList){
        return integerList!=null && integerList.size()>0;
    }
}

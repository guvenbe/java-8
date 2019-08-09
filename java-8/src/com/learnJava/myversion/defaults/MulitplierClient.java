package com.learnJava.myversion.defaults;

import java.util.Arrays;
import java.util.List;

public class MulitplierClient {
    public static void main(String[] args) {
        Multiplier multiplier = new MultiplierImpl();
        List <Integer> integerList = Arrays.asList(1,3,5);

        System.out.println("Result is :" + multiplier.multiply(integerList));
        System.out.println("default method size is :" + multiplier.size(integerList));

        System.out.println("Static method is empty:" + Multiplier.isEmpty(integerList));
    }
}

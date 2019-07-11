package com.learnJava.myversion.functionalinterfaces;

public class FunctionExample1 {

    public static String performConcat(String str){
        return FunctionExample.addSomeSting.apply(str);


    }
    public static void main(String[] args) {
        String result= performConcat("Hello");
        System.out.println(result);
    }
}

package com.learnJava.myversion.functionalinterfaces;

import java.util.function.Predicate;

public class Util {

    Predicate<String> isVowel =(s -> {
        if("aeiou".contains(s)){
            return true;
        }
        return false;
    });

}

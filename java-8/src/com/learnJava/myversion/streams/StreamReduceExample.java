package com.learnJava.myversion.streams;

import com.learnJava.myversion.data.Student;
import com.learnJava.myversion.data.StudentDataBase;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

     public static int perfomeMultiplication(List<Integer> integerList){
         return integerList.stream()
                 .reduce(1, (a,b) ->a*b);
    }

    public static Optional<Integer> perfomeMultiplicationWithoutidentity(List<Integer> integerList){
        return integerList.stream()
                .reduce((a,b) ->a*b);
    }

    public static Optional<Student> getHighestGPAStudent(){


         return  StudentDataBase.getAllStudents().stream().reduce((s1,s2) -> {

             if(s1.getGpa()>s2.getGpa()){
                 return s1;
             }else {
                 return s2;
             }

         });
    }

    public static Optional<Student> getHighestGPA2Student(){


        return  StudentDataBase.getAllStudents().stream().reduce((s1,s2) -> (s1.getGpa()>s2.getGpa() ?s1:s2));
    }

    public static void main(String[] args) {
        List <Integer> integers =  Arrays.asList(1,3,5,7);
        List <Integer> integers1 =  Arrays.asList();
        System.out.println(perfomeMultiplication(integers));
        Optional <Integer> result = perfomeMultiplicationWithoutidentity(integers);
        Optional <Integer> result1 = perfomeMultiplicationWithoutidentity(integers1);
        System.out.println();
        System.out.println(result.isPresent());
        System.out.println(result.get());

        System.out.println(result1.isPresent());

        if(result1.isPresent()){
            System.out.println(result1.get());
        }

        Optional<Student> studentOptional =getHighestGPAStudent();
        if(studentOptional.isPresent()){
            System.out.println(studentOptional.get());
        }


        Optional<Student> studentOptional2 =getHighestGPA2Student();
        if(studentOptional2.isPresent()){
            System.out.println(studentOptional2.get());
        }
     }
}

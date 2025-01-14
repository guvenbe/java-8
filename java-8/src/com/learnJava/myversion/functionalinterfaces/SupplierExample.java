package com.learnJava.myversion.functionalinterfaces;

import com.learnJava.myversion.data.Student;
import com.learnJava.myversion.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    static Supplier<Student> studentSupplier = () ->{
        return  new Student("Adam",2,3.6, "male", Arrays.asList("swimming", "basketball","volleyball"));
    };

    static Supplier<List<Student>> listSupplier = ()-> StudentDataBase.getAllStudents();

    public static void main(String[] args) {
        System.out.println(studentSupplier.get());
        System.out.println(listSupplier.get());
    }
}

package com.learnJava.myversion.optional;

import com.learnJava.myversion.data.Student;
import com.learnJava.myversion.data.StudentDataBase;

import java.util.Optional;

public class OptionalMapFlatMapExample {

    public static void optionalFilter(){
        Optional<Student> studentOptional=
                Optional.ofNullable(StudentDataBase.studentSupplier.get()); //Optional<Student>

        studentOptional.filter(student -> student.getGpa()>=3.5)
                .ifPresent(s-> System.out.println(s));
    }

    public static void optionalMap(){
        Optional<Student> studentOptional=
                Optional.ofNullable(StudentDataBase.studentSupplier.get());

        if (studentOptional.isPresent()){
            Optional<String> stringOptional = studentOptional
                    .filter(student -> student.getGpa()>=3.5)
                    .map(Student::getName);

            System.out.println(stringOptional.get());

        }
    }

    public static void optionalFlatMap(){
        Optional<Student> studentOptional=
                Optional.ofNullable(StudentDataBase.studentSupplier.get()); //Optional<Student>

        Optional<String> name =studentOptional.filter(student -> student.getGpa()>=3.5)//Optional<Student> <Optional<Bike>>
                .flatMap(Student::getBike) //returns -> Optional<Bike>
                .map(student -> student.getName());

        name.ifPresent(s -> System.out.println(s));


    }

    public static void main(String[] args) {
        optionalFilter();
        optionalMap();
        optionalFlatMap();
    }
}

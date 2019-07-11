package com.learnJava.myversion.functionalinterfaces;

import com.learnJava.myversion.data.Student;
import com.learnJava.myversion.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerWithBiExample {



    BiPredicate<Integer,Double> biPredicate =(gradeLevel, gpa) -> gradeLevel>=3 && gpa>=3.9;

    BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> System.out.println(name + ": "+ activities);

    Consumer<Student> studentConsumer = (student -> {
        if(biPredicate.test(student.getGradeLevel(),student.getGpa())){
            studentBiConsumer.accept(student.getName(),student.getActivities());
        }
    });

    public void printNameAndActivities(List<Student> students){

        students.forEach(studentConsumer);
    }
    public static void main(String[] args) {
        List<Student> studentList =StudentDataBase.getAllStudents();
        new PredicateAndConsumerWithBiExample().printNameAndActivities(studentList);

    }
}

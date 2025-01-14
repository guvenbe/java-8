package com.learnJava.myversion.functionalinterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    static Consumer<Student> c2 = (student)-> System.out.println(student);
    static Consumer<Student>  c3 = (student) -> System.out.print(student.getName());
    static Consumer<Student>  c4 = (student) -> System.out.println(student.getActivities());

    public static void printName(){


        List<Student> studentList =StudentDataBase.getAllStudents();
        studentList.forEach(c2);

    }

    public static void printNameandActivities(){

        System.out.println("printNameandActivities:");
        List<Student> studentList =StudentDataBase.getAllStudents();
        studentList.forEach(c3.andThen(c4)); //Consumer Chain

    }

    public static void printNameandActivitiesUsingCondition(){
        System.out.println("printNameandActivitiesUsingCondition :");
        List<Student> studentList =StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if (student.getGradeLevel()>=3  && student.getGpa()>=3.9){
                c3.andThen(c4).accept(student);
            }
        }); //Consumer Chain

    }

    public static void main(String[] args) {
        Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
        c1.accept("bora");

        printName();
        printNameandActivities();
        System.out.println("\n");
        printNameandActivitiesUsingCondition();


    }
}

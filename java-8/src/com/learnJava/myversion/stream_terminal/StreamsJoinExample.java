package com.learnJava.myversion.stream_terminal;

import com.learnJava.myversion.data.Student;
import com.learnJava.myversion.data.StudentDataBase;

import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

public class StreamsJoinExample {

    public static String joininig_1(){

        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(joining());

    }
    public static String joininig_2(){

        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(joining("-"));

    }
    public static String joininig_3(){

        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(joining("-","(",")"));

    }

    public static void main(String[] args) {

        System.out.println("joining_1:" + joininig_1());
        System.out.println("joining_2:" + joininig_2());
        System.out.println("joining_3:" + joininig_3());
    }
}

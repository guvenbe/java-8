package com.learnJava.myversion.stream_terminal;

import com.learnJava.data.StudentDataBase;

import static java.util.stream.Collectors.counting;

public class StreamCountingExample {

    public static long count(){
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa()>=3.9)
                .collect(counting());
    }

    public static void main(String[] args) {
        System.out.println(count());
    }
}

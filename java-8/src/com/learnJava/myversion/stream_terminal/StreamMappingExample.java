package com.learnJava.myversion.stream_terminal;

import com.learnJava.myversion.data.Student;
import com.learnJava.myversion.data.StudentDataBase;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.*;

public class StreamMappingExample {
    public static void main(String[] args) {
        List<String> nameList = StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::getName,toList()));

        Set <String> nameSet = StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::getName,toSet()));

        System.out.println(nameList);
        System.out.println(nameSet);

    }
}

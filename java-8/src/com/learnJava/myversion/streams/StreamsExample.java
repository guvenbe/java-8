package com.learnJava.myversion.streams;

import com.learnJava.myversion.data.Student;
import com.learnJava.myversion.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {
        //student name and their activities in a map

        Predicate<Student> studentGradeLevelPredicate = student -> student.getGradeLevel()>=3;
        Predicate<Student> studentGPAPredicate = student -> student.getGpa()>=3.9;


        Map<String, List <String>> studentMap = StudentDataBase.getAllStudents()
                .stream()
//                .peek((student -> {
//                    System.out.println(student);
//                }))
                .filter(studentGradeLevelPredicate)
//                .peek((student -> {
//                    System.out.println("after first filter " +student);
//                }))

                .filter(studentGPAPredicate)

                .peek((student -> {
                    System.out.println("after second filter " +student);
                }))

                .collect(Collectors.toMap(Student::getName,Student::getActivities));

        System.out.println(studentMap);

    }
}

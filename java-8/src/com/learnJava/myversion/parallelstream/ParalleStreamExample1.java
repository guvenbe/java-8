package com.learnJava.myversion.parallelstream;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class ParalleStreamExample1 {

    public static List <String> sequentialPrintStudentActivities() {

        long startTime = System.currentTimeMillis();
        List<String> studentActivities = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream) //<Stream<String>
                .collect(toList());

        long endTime = System.currentTimeMillis();
        System.out.println("Duration sequential: " + (endTime-startTime));

        return studentActivities;

    }

    public static List <String> parallelPrintStudentActivities() {
        long startTime = System.currentTimeMillis();

        List<String> studentActivities = StudentDataBase.getAllStudents()
                .stream()
                .parallel()
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream) //<Stream<String>
                .collect(toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Duration parallel: " + (endTime-startTime));

        return studentActivities;

    }

    public static void main(String[] args) {
        sequentialPrintStudentActivities();
        parallelPrintStudentActivities();

    }
}

package com.learnJava.myversion.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class StreamComparatorExample {

    public static List<Student> sortStudentByName(){
        List<Student> sortedStudents = StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(toList());

        return sortedStudents;
    }

    public static List<Student> sortStudentByGPA(){
        List<Student> sortedStudents = StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(toList());

        return sortedStudents;
    }
    public static List<Student> sortStudentByGPADesc(){
        List<Student> sortedStudents = StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(toList());

        return sortedStudents;
    }

    public static void main(String[] args) {
        System.out.println("Students sorted by name : ");
        sortStudentByName().forEach(System.out::println);
        System.out.println("Students sorted by GPA : ");
        sortStudentByGPA().forEach(System.out::println);
        System.out.println("Students sorted by GPA Desc : ");
        sortStudentByGPADesc().forEach(System.out::println);

    }
}

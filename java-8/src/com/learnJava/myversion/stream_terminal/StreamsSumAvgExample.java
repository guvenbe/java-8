package com.learnJava.myversion.stream_terminal;

import com.learnJava.myversion.data.Student;
import com.learnJava.myversion.data.StudentDataBase;

import static java.util.stream.Collectors.*;

public class StreamsSumAvgExample {
    public static int sum(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(summingInt(Student::getNoteBooks));
    }

    public static double avarege(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(averagingInt(Student::getNoteBooks));
    }

    public static double avaregeGrade(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(averagingDouble(student -> student.getGpa()));
    }

    public static void main(String[] args) {
        System.out.println("Total number of notebooks:" + sum());
        System.out.println("Avg number of notebooks:" + avarege());
        System.out.println("Avg number grades:" + avaregeGrade());
    }
}

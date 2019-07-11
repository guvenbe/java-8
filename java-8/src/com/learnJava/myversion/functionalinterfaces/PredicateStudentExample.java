package com.learnJava.myversion.functionalinterfaces;

import com.learnJava.myversion.data.Student;
import com.learnJava.myversion.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;
    static Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;

    public static void filterStudentByGradeLevel(){
        System.out.println("filterStudentByGradeLevel:");
        List<Student> studentList =StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if(p1.test(student)){
                System.out.println(student);
            }
        });

    }

    public static void filterStudentByGpa(){
        System.out.println("filterStudentByGpa:");
        List<Student> studentList =StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if(p2.test(student)){
                System.out.println(student);
            }
        });

    }

    public static void filterStudents(){
        System.out.println("filterStudents:");
        List<Student> studentList =StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if(p1.and(p2).test(student)){
                System.out.println(student);
            }
        });
    }

    public static void filterStudents2(){
        System.out.println("filterStudents:");
        List<Student> studentList =StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if(p1.or(p2).test(student)){
                System.out.println("3rd above or gpa >3.9" +student);
            }else{
                System.out.println("not 3rd above or gpa >3.9" +student);
            }
        });
    }

    public static void filterStudentsNegate(){
        System.out.println("filterStudents:");
        List<Student> studentList =StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if(p1.and(p2).negate().test(student)){
                System.out.println("not 3rd above and gpa >3.9" +student);
            }else{
                System.out.println("3rd above and gpa >3.9" +student);
            }
        });
    }

    public static void main(String[] args) {
        filterStudentByGradeLevel();
        filterStudentByGpa();
        filterStudents();
        filterStudents2();
        filterStudentsNegate();
    }
}

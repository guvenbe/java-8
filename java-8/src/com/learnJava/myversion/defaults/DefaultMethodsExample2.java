package com.learnJava.myversion.defaults;

import com.learnJava.myversion.data.Student;
import com.learnJava.myversion.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodsExample2 {

    static  Consumer<Student> studentConsumer = (student -> System.out.println(student));
    static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
    static Comparator<Student> gradeComparator = Comparator.comparing(Student::getGradeLevel);

    public static void sortByName(List <Student> studentList){

        System.out.println("After sort");
        Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
        studentList.sort(nameComparator);
        studentList.forEach(studentConsumer);

    }

    public static void sortByGPA(List <Student> studentList){

        System.out.println("After sort by GPA");
        Comparator<Student> nameComparator = Comparator.comparingDouble(Student::getGpa);
        studentList.sort(nameComparator);
        studentList.forEach(studentConsumer);

    }

    public static void comparatorChaining(List<Student> studentList){
        System.out.println("After Comparator Chaining");
        studentList.sort(gradeComparator.thenComparing(nameComparator));
        studentList.forEach(studentConsumer);

    }

    public static void sortWithNullValues(List<Student> studentList){
        System.out.println("After sort with nulls first");
        Comparator<Student> studentComparator = Comparator.nullsFirst(nameComparator);
        studentList.sort(studentComparator);
        studentList.forEach(studentConsumer);
    }

    public static void main(String[] args) {

        List <Student> studentList =StudentDataBase.getAllStudents();
        System.out.println("Before sort");
        studentList.forEach(studentConsumer);

//        sortByName(studentList);
//        sortByGPA(studentList);
//        comparatorChaining(studentList);
        sortWithNullValues(studentList);

    }
}

package com.learnJava.myversion.stream_terminal;

import com.learnJava.myversion.data.Student;
import com.learnJava.myversion.data.StudentDataBase;

import java.util.*;

import static java.util.stream.Collectors.*;

public class SreamGroupingByExample {

    public static void groupStudentsByGender(){
        Map <String, List<Student>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGender));

        System.out.println(studentMap);
    }

    public static void cusomizedGroupingBy(){
        Map <String, List<Student>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(student -> student.getGpa() >=3.8 ? "OUTSTANDING":"AVARAGE"));

        System.out.println(studentMap);
    }

    public static void twoLevelGrouping_1(){
        Map<Integer, Map<String, List<Student>>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        groupingBy(student -> student.getGpa() >=3.8 ? "OUTSTANDING":"AVARAGE")));

        System.out.println(studentMap);
    }

    public static void twoLevelGrouping_2(){
        Map<String, Integer> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getName,
                        summingInt(Student::getNoteBooks)));

        System.out.println();

        System.out.println(studentMap);
    }
    public static void threeArgumentGroupBy(){
        LinkedHashMap<String, Set <Student>> studentLinkedHashMapMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getName,
                        LinkedHashMap::new, toSet()));

        System.out.println();

        System.out.println(studentLinkedHashMapMap);
    }

    public static void calculateTopGPA(){
        Map<Integer, Optional<Student>> integerOptionalMap =StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,  maxBy(Comparator.comparing(Student::getGpa))));

        System.out.println(integerOptionalMap);

        Map<Integer, Student> integerStudentMap =StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,  collectingAndThen(maxBy(Comparator.comparing(Student::getGpa)),Optional::get
                )));

        System.out.println(integerStudentMap);
    }

    public static void calculateLeastGPA(){
        Map<Integer, Optional<Student>> integerOptionalMap =StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,  minBy(Comparator.comparing(Student::getGpa))));

        System.out.println(integerOptionalMap);

        Map<Integer, Student> integerStudentMap =StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,  collectingAndThen(minBy(Comparator.comparing(Student::getGpa)),Optional::get
                )));

        System.out.println(integerStudentMap);
    }


    public static void main(String[] args) {
        groupStudentsByGender();
        cusomizedGroupingBy();
        twoLevelGrouping_1();
        twoLevelGrouping_2();
        threeArgumentGroupBy();
        calculateTopGPA();
        calculateLeastGPA();
    }
}

package com.learnJava.myversion.methodreference;

import com.learnJava.myversion.data.Student;
import com.learnJava.myversion.data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReference {

    public static boolean greaterThanGradeLevel(Student s){
        return s.getGradeLevel() >=3;
    }

    static Predicate <Student> p1 = (s) -> s.getGradeLevel() >=3;

    static Predicate <Student> p2 = RefactorMethodReference::greaterThanGradeLevel;
    public static void main(String[] args) {

        System.out.println(p2.test(StudentDataBase.studentSupplier.get()));

    }
}

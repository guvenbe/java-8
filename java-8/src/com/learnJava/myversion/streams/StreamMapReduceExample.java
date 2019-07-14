package com.learnJava.myversion.streams;

import com.learnJava.myversion.data.Student;
import com.learnJava.myversion.data.StudentDataBase;

public class StreamMapReduceExample {

    private static int noOfNoteBooks(){

        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGradeLevel()>=3)
                .filter(Student->Student.getGender().equals("female"))
                .map(Student::getNoteBooks)
                //.reduce(0,(a,b)->a+b);
                .reduce(0,Integer::sum);



    }

    public static void main(String[] args) {
        System.out.println("noOfNoteBooks=" +noOfNoteBooks());
    }
}

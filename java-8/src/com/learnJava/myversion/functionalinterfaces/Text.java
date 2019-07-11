package com.learnJava.myversion.functionalinterfaces;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Text {

    public List<String>readLines(){

        List <String> lines=new ArrayList<>();

        for (String line : AsYouLikeIt.text) {
            lines.add(line);
        }
        return lines;
    }


    public static void main(String[] args) throws IOException {
       // Text text = new Text();


        FileReader fr =
                new FileReader("./test.txt");

        int i;
        while ((i=fr.read()) != -1){

//            char[] ca =null;
//            ca[i] = (char) i;

            System.out.print((char) i);
        }
    }
}


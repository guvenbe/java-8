package com.learnJava.myversion.innerclass;

// Output =Udayan

class Outer{
    private String  name = "Udayan";

    public class Inner {
        private String test;
        public void printName() {
            //insert inner class definition here for Udayan
            System.out.println(name);
        }
    }

}
public class OuterInner1 {

    public static void main(String[] args) {
        new Outer().new Inner().printName();

    }
}

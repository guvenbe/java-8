package com.learnJava.myversion.innerclass;

class Test {
    class A{
        void m(){
            System.out.println("INNER");
        }

    }

}

public class OuterInner2 {
    public static void main(String[] args) {
        //To print "INNER
        new Test().new A().m();

        Test.A a2 = new Test().new A();
        a2.m();

        //Does not works since A is not in scope
        // A a1 = new Test().new A();
        // a1.m();
        // or
        // A a3 = this.new A();
        // a3.m();
        // or
        // Test.A a4 = this.new A();
        // a4.m();

    }
}

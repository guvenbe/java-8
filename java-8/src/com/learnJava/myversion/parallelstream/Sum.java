package com.learnJava.myversion.parallelstream;

public class Sum {
    private int total;

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotal(){
        return total;
    }


    public  void  performSum(int input){
        total+=input;
    }
}

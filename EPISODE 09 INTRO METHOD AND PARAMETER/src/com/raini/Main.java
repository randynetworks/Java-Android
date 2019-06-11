package com.raini;

public class Main {
    //METHOD
    public static void myName(String myName){
        System.out.println(myName);
    }

    public static void anotherMethod(){
        System.out.println("Another method");
    }
    public static void addNum(int a, int b){
        System.out.println(a + b);
    }

    //======================================
    public static void main(String[] args) {
	// write your code her
        myName("Randy");
        anotherMethod();
        addNum(4,3);
    }


}

package com.raini;

public class Main {

    public static void main(String[] args) {

        // write your code here
        myName("RANDY");

        int finalResult = addNums(4, 5);

        System.out.println( finalResult);


        System.out.println( fullName("Randy", "Ramadhan"));

        System.out.println(showChar('D'));


    }

    //Method
    public static void myName(String mName) {

        System.out.println(mName);

    }

    // Return an integer

    public static int addNums(int a, int b) {
        int result;
        result = a + b;
        //  System.out.println(" Sum = "  + (a + b));

        return result ; // (a+b)
    }

    //Return a string

    public static String fullName(String firstName, String lastName){

        return firstName + " " + lastName;
    }

    // Return Character
    public static char showChar(char c) {
        return c;
    }



}
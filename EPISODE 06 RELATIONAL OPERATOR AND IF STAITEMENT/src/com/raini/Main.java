package com.raini;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // == relational operators ==
        /*
            - == (comparation, not assignment)
            - != not equal
            - > greater than
            - < lass than
            - >= greater than or equal
            - <= less than or equal

         */
        double firstNum = 10;
        double secondNum = 3;
        double result;

        result = firstNum % secondNum;

        //if statement
        if (firstNum != secondNum){
            System.out.println("The remainder is " + result );
        } else{
            System.out.println("Hello");
        }




    }
}

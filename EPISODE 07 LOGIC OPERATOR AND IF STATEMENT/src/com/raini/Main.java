package com.raini;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        == LOGICAL OPERATOR ==
        - AND && == both sides need tu be TRUE in order for the whole epressin to return
        - OR ||
        - NOT !
         */

        double firstNum = 10;
        double secondNum = 3;
        double result;

        boolean isOld = true;
        boolean isYoung = false;

        if ((isOld && !isYoung) && (firstNum < secondNum)){
            System.out.println("Hello");
        }else{

            System.out.println("It's Wrong");
        }

    }
}

package com.raini;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ball myBall = new ball();
        ball secondBall = new ball();
        secondBall.color = "brown";
        secondBall.name = "second Basketball";


        myBall.color = "Blue";
        myBall.name = "Basketball";

        System.out.println(myBall.name);
    }
}

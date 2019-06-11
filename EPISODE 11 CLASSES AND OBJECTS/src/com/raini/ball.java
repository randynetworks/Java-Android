package com.raini;

public class ball { //blueprint
    //properties or intance variables
    public String color;
    public String name;
    public int bounceRate;

    //behaviors
    public void bounce(){
        System.out.println("Bouncing");
    }

    public void deflate(){
        System.out.println("Defloating...");
    }

    public void inflates(){
        System.out.println("Infloating... ");
    }

}

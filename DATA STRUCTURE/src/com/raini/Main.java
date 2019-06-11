package com.raini;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //ARRAYLISTS
        ArrayList animals = new ArrayList();
        animals.add("pig");
        animals.add("Cow");
        animals.add("Parrot");

        for (int i = 0; i < animals.size(); i++){
            System.out.println("Animals: " + animals.get(i));
        }

        //cleaver for loop
        for (Object animal : animals){
            System.out.println(animal);
        }




//        //ARRAY DECLARATION
//        int [] myArray = {1,2, 3, 4,5,6,7};
//        String[] myStringArray = {"hello", "Hi", "what"};
//
//        int[] newArray = new int[5];
//        String[] newStringArray = new String[5];
//
//        newArray[0] = 3;
//        newArray[1] = 4;
//        newArray[2] = 5;
//        newArray[3] = 1;
//        newArray[4] = 12;
//
//
//
//        // array have length.
//        for (int i = 0; i < newArray.length; i++){
//            System.out.println("Item " + newArray[i]);
//        }


    }
}

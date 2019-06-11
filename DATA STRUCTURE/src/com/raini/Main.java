package com.raini;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //ARRAYLISTS
        ArrayList animals = new ArrayList();
        animals.add("pig");
        animals.add("Cow");
        animals.add("Pig");
        animals.add("Cheetah");

//        animals.remove(0);
//        animals.add(0, "Dog");
//        animals.remove("Cow");
        if (animals.contains("Parrot")){
            animals.remove("Parrot");
        }else{
            System.out.println("Nope");
        }

        System.out.println(animals.size());

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

//        // array have length.
//        for (int i = 0; i < newArray.length; i++){
//            System.out.println("Item " + newArray[i]);
//        }
    }
}

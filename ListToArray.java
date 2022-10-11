package com.java11;
import java.util.ArrayList;
import java.util.Arrays;
public class ListToArray {




    public static void main(String[] args) {

        //Converting List to Array With Library Function

        //Declaration of Array List
        ArrayList<String> List = new ArrayList<>();

        //Adding Elements to Array List
        List.add("A");
        List.add("quick");
        List.add("brown");
       List.add("fox");
        List.add("jumps");
        List.add("over");
       List.add("the");
       List.add("lazy");
       List.add("dogs");
        //Printing the Array List
        System.out.println("Elements of List: " + List);

        String[]arr = List.stream().toArray(Size->new String[Size]);
   System.out.println("Elements in the array" + Arrays.toString(arr));
       
    }
}
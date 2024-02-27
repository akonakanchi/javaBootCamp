package org.akonakanchi.java.DataStructures;

import java.util.Stack;

public class ArrayDataStructure {

    public static void main(String[] args) {

//        int[] singleDimensionalArray = new int[5];
        int[] singleDimensionalArray = {1,2,3};
        int[][] multiDimensionalArray = new int[5][5];

        System.out.println(singleDimensionalArray);


        char[] tokenCharArray = {'!',',','?','.','_','\'','@'};

        System.out.println(tokenCharArray);

        String s1  ="?";
        String s2  ="com";
        String [] s = {"as","?","sds"};
        System.out.println(s1.contains(String.valueOf(tokenCharArray[1])));
        String[] finalArray= {};

s1.split("['a','b','c']");
        String s3 = new String("Test");
        String s4 = new String(s1);
        System.out.println((s1.hashCode() == s2.hashCode() )+ " "+( s3.hashCode() == s4.hashCode()));
        System.out.println(s1.compareTo(s2));
        System.out.println(tokenCharArray.hashCode());


    }
}

package org.akonakanchi.java;

import org.akonakanchi.java.codingExercises.Loops;
import org.akonakanchi.java.codingExercises.StringExercises;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

//        Below steps call methods in Loops class
       /* Loops l = new Loops();
        System.out.println(l.isPrime(9));
        System.out.println(l.sumUpToN(10));*/


//        Below steps are for methods in String Exercises/**/
        StringExercises se = new StringExercises("     ");
        System.out.println(se.countUpperCaseLetters(se.getStr1()));
        System.out.println(se.hasConsecutiveIdenticalChar(se.getStr1()));
        System.out.println(se.getRightMostDigit(se.getStr1()));
    }

}
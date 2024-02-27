package org.akonakanchi.java.algorithms;

import java.util.Collections;

public class AlgorithmsRunner {

    public static void main(String[] args) {

        AnagramChecker anagramChecker = new AnagramChecker("a  b1c","1 bca");
        System.out.println(anagramChecker.isAnagram());


       StringBuilder sb = new StringBuilder();
       sb.append("AJ we");
       sb.reverse();

        System.out.println(sb);
    }
}

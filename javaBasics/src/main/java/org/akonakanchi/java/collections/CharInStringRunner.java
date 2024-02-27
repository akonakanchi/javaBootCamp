package org.akonakanchi.java.collections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class ForEachConsumenr implements Consumer<Integer> {

    @Override
    public void accept(Integer integer) {
        System.out.println(integer);
    }
}

class CharInStringRunner {
    public static void main(String[] args) {

        OccuranceOfCharInString string = new OccuranceOfCharInString("This is an awesom occasion. This has never happened before.");

        System.out.println(string.getEachWordCount());
        System.out.println(string.getEachCharCount());

        String s = "aa";
        s.equals(" ");

        List n = Arrays.asList(1,2,3);
        n.stream().forEach(new ForEachConsumenr());


//        void forEach(Consumer<? super T> action);
    }
}

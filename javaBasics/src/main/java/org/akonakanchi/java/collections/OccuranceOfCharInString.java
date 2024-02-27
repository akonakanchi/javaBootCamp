package org.akonakanchi.java.collections;

import java.util.*;

public class OccuranceOfCharInString {

    private String stringSentence;

    public OccuranceOfCharInString(String stringSentence){
        this.stringSentence = stringSentence;
    }

    private String[] sentenceToWordBreaker(){
        String sentenceToBreak = stringSentence.trim();
        return sentenceToBreak.split(" ");
    }

    private List<Character> wordToCharBreaker(){
        char[] chars = stringSentence.trim().toLowerCase().toCharArray();
        List<Character> cList = new ArrayList<>();
        for(char c : chars){
            cList.add(c);
        }
        return cList;
    }

    public Map<String,Integer> getEachWordCount(){
        List<String> sentenceWords = List.of(sentenceToWordBreaker());

        System.out.println(sentenceWords);
        Map<String,Integer> eachWordCount = new HashMap<>();

        for(String word: sentenceWords){

            if(eachWordCount.containsKey(word)){
                System.out.println(word);
                int temp= eachWordCount.get(word);
                eachWordCount.replace(word,temp+1);
            }else{
                eachWordCount.put(word,1);
            }
        }
        return eachWordCount;
    }


    public Map<Character,Integer> getEachCharCount(){
        SortedSet<String> test;
        Collection<String> s;
        Map<Character,Integer> eachCharCount = new HashMap<>();
        List<Character> allChars = wordToCharBreaker();
        for(Character c: allChars){
            if(eachCharCount.containsKey(c)){
                int temp = eachCharCount.get(c);
                eachCharCount.replace(c,temp+1);
            }else{
                eachCharCount.put(c,1);
            }
        }
        return eachCharCount;
    }



}

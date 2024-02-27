package org.akonakanchi.java.codingExercises;

public class StringExercises {

    private String str1;
    private String str2;
    public String getStr1() {
        return str1;
    }

    public String getStr2() {
        return str2;
    }

    public StringExercises(String str1){
        this.str1 = str1;
    }

    public StringExercises(String str1, String str2){
        this.str1 = str1;
        this.str2 = str2;
    }


    public int countUpperCaseLetters(String input){
        if(input.length()<=0 || input == null) return 0;
        int upperCaseLetterCount = 0;
        for(int i=0; i<input.length(); i++){
            if(Character.isUpperCase(input.charAt(i))){
                upperCaseLetterCount++;
            }
        }
        return upperCaseLetterCount;
    }

    public boolean hasConsecutiveIdenticalChar(String input){
        if(input.length() <= 1 || input == null || input.trim().length() <=1) return false;
        for (int i=0; i < input.length()-1; i++){
            if(input.charAt(i) == input.charAt(i+1)){
                return true;
            }
        }
        return false;
    }

    public int getRightMostDigit(String input){
        if(input.length() <=  0 || input == null || input.equals("")) return -1;
        for(int i=input.length()-1; i >= 0 ; i--){
            if(Character.isDigit(input.charAt(i))){
                return Character.getNumericValue(input.charAt(i));
            }
        }
        return -1;
    }

}

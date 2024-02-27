package org.akonakanchi.java.algorithms;

import java.util.Arrays;
import java.util.List;

public class AnagramChecker {
    private String string1;
    private String string2;
    public AnagramChecker(String str1,String str2){
        this.string1 = str1;
        this.string2 = str2;
    }


    public boolean isAnagram(){
        //Edge Case if strings are empty or null, if both string sizes are not same
        if((string1.equals(null) || string2.equals(null)) || (string1.length() == 0 || string2.length() == 0) || (string1.length()!= string2.length()))
            return false;

        char[] stringOneChars = string1.trim().toLowerCase().replaceAll(" ","").toCharArray();
        char[] stringTwoChars = string2.trim().toLowerCase().replaceAll(" ","").toCharArray();

        Arrays.sort(stringOneChars);
        Arrays.sort(stringTwoChars);

        return Arrays.equals(stringOneChars,stringTwoChars);
    }
}

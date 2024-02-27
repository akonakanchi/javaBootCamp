package org.akonakanchi.java.codingExercises;

public class Loops {

    public boolean isPrime(int num){

        for (int i=2;i<num;i++){
             if(num % i == 0){
                 return false;
             }
        }
        return true;
    }

    public int sumUpToN(int num){
        if(num == 0 || num <0 ) return 0;
        int sum= 0;
        for(int i=0;i<=num;i++){
            sum += i;
        }
        return sum;

    }
}

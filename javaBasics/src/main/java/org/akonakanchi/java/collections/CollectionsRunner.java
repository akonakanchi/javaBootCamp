package org.akonakanchi.java.collections;

import java.sql.SQLOutput;
import java.util.*;

public class CollectionsRunner {

    public static void main(String[] args) {

        int[] testArray = {1, 2, 3, 5};

//        List<Character> charList = new ArrayList<>();
        List<Character> charList = List.of('A', 'Z', 'A', 'B', 'Z', 'F', 'A', 'F', 'B', 'K', 'Q');

        List<Student> studentsList = List.of(new Student(23, "Aj"),
                new Student(52, "Sha"),
                new Student(32, "Aj"),
                new Student(01, "Konakanchi"),
                new Student(25, "Sha"),
                new Student(15, "Aadvik"),
                new Student(12, "Srihan"));

//        System.out.println(testArray);
        System.out.println("Orginal char list                                  " + charList);
        Set<Character> uniqCharList = new HashSet<>();
        uniqCharList.addAll(charList);

        Set<Character> uniqInsertionOrder = new LinkedHashSet<>();
        uniqInsertionOrder.addAll(charList);

        Set<Character> uniqSortedOrderCharList = new TreeSet<>();
        uniqSortedOrderCharList.addAll(charList);

        System.out.println("Unique characters in the char list                 " + uniqCharList);

        System.out.println("Unique characters in the char list Insertion Order " + uniqInsertionOrder);

        System.out.println("Unique characters in the char list Sorted Order    " + uniqSortedOrderCharList);


        System.out.println(studentsList.hashCode());
        for(Student student:studentsList){
            System.out.println("hash code is "+ student.hashCode());
        }
        /*Set<Student> studentUniqList = new HashSet<>();
        studentUniqList.addAll(studentsList);

        System.out.println(studentUniqList);

        Set<Student> studentUniqInsertedOrder = new LinkedHashSet<>();
        studentUniqInsertedOrder.addAll(studentsList);
        System.out.println(studentUniqInsertedOrder);*/

//        Set<Student> studentUniqSortOrder = new TreeSet<>();
//        studentUniqSortOrder.addAll(studentsList);
//        System.out.println(studentUniqSortOrder);
    }
}

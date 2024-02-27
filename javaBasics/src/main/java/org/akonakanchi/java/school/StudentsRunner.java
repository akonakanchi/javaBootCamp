package org.akonakanchi.java.school;

public class StudentsRunner {

    public static void main(String[] args) {
        Students student = new Students("AJ", 1,6,5,1,55);
        System.out.println(student.getNumberOfMarks());
        System.out.println(student.getSumOfMarks());
        System.out.println(student.getMaxMark());
        System.out.println(student.getMinMark());
        System.out.println(student.getAvgMarks());
    }
}

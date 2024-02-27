package org.akonakanchi.java.school;

import java.util.*;

public class Students {

    private String name;
    private int age;
    private int studentId;
    private ArrayList<Integer> marks = new ArrayList<>();

    public Students(String name, int... marks) {
        this.name = name;
        for (int mark : marks)
            this.marks.add(mark);
    }

    int getNumberOfMarks() {
        return marks.size();
    }

    int getSumOfMarks() {
        int sum = 0;
        for (int mark : marks)
            sum = sum + mark;
        return sum;
    }

    int getMaxMark() {
        /*int maxMark = marks.get(0);
        for (int mark : marks)
            if (maxMark < mark) maxMark = mark;
        return maxMark;*/
        return Collections.max(marks);
    }

    int getMinMark() {
        /*int minMark = marks.get(0);
        for (int mark : marks)
            if (minMark > mark) minMark = mark;
        return minMark;*/
        return Collections.min(marks);
    }

    double getAvgMarks() {
        double sum = getSumOfMarks();
        double num = getNumberOfMarks();
        double d = (sum / num);
        return d;
    }
}

package org.akonakanchi.java.collections;

class Student {
    private int id;
    private String name;

    public Student(int id,String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "[ID = "+ this.id + " Name = "+this.name+"]";
    }
}

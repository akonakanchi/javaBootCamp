package org.akonakanchi.java.oops.level2;

public abstract class Animal {

    public Animal(){
        System.out.println("This is Absrtact Constructor" + getClass());
    }

    abstract void bark();

}

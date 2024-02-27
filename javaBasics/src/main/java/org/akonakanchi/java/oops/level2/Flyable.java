package org.akonakanchi.java.oops.level2;

public interface Flyable {
    public void fly();
    default void message(){
        System.out.println("Congratulations that you can fly");
    }

}

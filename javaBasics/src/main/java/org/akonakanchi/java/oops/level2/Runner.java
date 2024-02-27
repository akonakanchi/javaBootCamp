package org.akonakanchi.java.oops.level2;

public class Runner {
    public static void main(String[] args) {
        Flyable[] flyingObjects = {new Bird(), new Aeroplane()};
        for (Flyable fly: flyingObjects){
            fly.fly();
        }

        Animal[] animals = {new Cat(), new Dog()};
        for (Animal animal:animals){
            animal.bark();
        }
    }
}

package org.example;


public class Main {
    public static void main(String[] args)
    {
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();
        animal.MakeSound();
        dog.MakeSound();
        cat.MakeSound();
    }

}
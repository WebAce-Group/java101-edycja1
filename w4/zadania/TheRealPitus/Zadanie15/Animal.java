package org.example;

public class Animal {
    public void MakeSound()
    {
        System.out.println("Animal sound");
    }
}
class Dog extends Animal
{
    @Override
    public void MakeSound()
    {
        System.out.println("Bark");
    }
}
class Cat extends Animal
{
    @Override
    public void MakeSound()
    {
        System.out.println("Meow");
    }
}

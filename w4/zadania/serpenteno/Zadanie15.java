import java.util.*;

class Animal
{
	void makeSound()
	{
		System.out.println("Animal sound.");
	}
	
	public static void main(String args[])
	{
		Animal animal = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();
		animal.makeSound();
		dog.makeSound();
		cat.makeSound();
    }
}

class Dog extends Animal
{
	void makeSound() 
	{
		System.out.println("Woof");
	}
}

class Cat extends Animal
{
	void makeSound()
	{
	System.out.println("Meow");
	}
}

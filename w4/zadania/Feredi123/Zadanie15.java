package zadania.Feredi123;

public class Zadanie15 {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Dog animal2 = new Dog();
        Cat animal3 = new Cat();

        animal1.makeSound();
        animal2.makeSound();
        animal3.makeSound();
    }
}

class Animal {
    public void makeSound(){
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    public void makeSound(){
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    public void makeSound(){
        System.out.println("Meow");
    }
}

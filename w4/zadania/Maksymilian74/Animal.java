package w4.zadania.Maksymilian74;

public class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow");
    }
}

class zad15{
    public static void main(String[] args) {
        Dog pies = new Dog();
        Cat kot = new Cat();
        pies.makeSound();
        kot.makeSound();
    }
}

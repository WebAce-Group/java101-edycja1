public class Animal {
    public void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {

    public void makeSound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {

    public void makeSound() {
        System.out.println("Meow");
    }
}


public class Zadanie15 {

    public static class Animal {
        public void makeSound() {
            System.out.println("Animal sound");
        }
    }

    public static class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Meow");
        }
    }

    public static class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Woof");
        }
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        animal.makeSound();
        dog.makeSound();
        cat.makeSound();

    }

}

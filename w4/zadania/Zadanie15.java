public class Zadanie15 {
    public static void main(String[] args) {
        class Animal {

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
        Dog animal1 = new Dog();
        Cat animal2 = new Cat();
        animal1.makeSound();
        animal2.makeSound();
    }
}

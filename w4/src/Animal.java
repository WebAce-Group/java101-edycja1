package w4.zadania.Ksromek;
public class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }

    class Dog extends Animal {
        void Dog_S() {
                System.out.println("Woof");
            }
    }
    class Cat extends Animal {
        void Cat_S() {
            System.out.println("Meow");
        }
    }

    public void main(String[] args) {
        Dog animal1 = new Dog();
        Cat animal2 = new Cat();

        animal1.makeSound();
        animal2.makeSound();
    }




}

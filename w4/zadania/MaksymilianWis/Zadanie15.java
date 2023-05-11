public class Zadanie15 {
    public static void main(String args[])
    {
        Animal a1 = new Animal();
        Cat c1 = new Cat();
        Dog d1 = new Dog();

        a1.makeSound();
        c1.makeSound();
        d1.makeSound();

        


    }
    
    public static class Animal
    {
        void makeSound()
        {
            System.out.println("Animal sound");
        }
    };

    public static class Cat extends Animal
    {
        void makeSound()
        {
            System.out.println("Meow");
        }
    };

    public static class Dog extends Animal
    {
        void makeSound()
        {
            System.out.println("Woof");
        }
    };
}

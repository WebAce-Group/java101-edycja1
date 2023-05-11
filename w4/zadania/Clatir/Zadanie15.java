public class Zadanie15 {

    public static class Animal
    {
        public void makeSound()
        {
            System.out.println("Animal sound");

        }
    }

    public static class Dog extends Animal
    {
        @Override
        public void makeSound()
        {
        System.out.println("Woof");
        }
    }

    public static class Cat extends Animal
    {
        @Override
        public void makeSound()
        {
            System.out.println("Meow");
        }
    }


    public static void main(String Args[])
    {
        new Animal().makeSound();
        new Dog().makeSound();
        new Cat().makeSound();

    }
}

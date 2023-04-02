public class Main 
{
    private Main() throws InstantiationError
    {
        throw new InstantiationError("This is static class!");
    }

    public static void main(String[] args)
    {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }

}
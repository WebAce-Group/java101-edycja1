package w4.zadania.JBar02;

public class Animal {

    public void makeSound(){
         System.out.println("Animal sound");
    }
}

class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Woof");
    }

}

class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Meow");
    }

    public static void main(String[] args){
        Dog dog1=new Dog();
        dog1.makeSound();
        Cat cat1=new Cat();
        cat1.makeSound();
        Animal animal=new Animal();
        animal.makeSound();

    }



}


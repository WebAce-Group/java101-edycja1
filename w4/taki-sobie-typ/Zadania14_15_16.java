//ZADANIE 14
class Rectangle {
    public int width;
    public int height;
    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public int getArea(){
        return width*height;
    }

    public int getPerimeter(){
        return 2*width+2*height;
    }

}


//ZADANIE 15
class Animal {
    public void makeSound(){
        System.out.println("Animal sound");
    }
}
class Dog extends Animal{
    public void makeSound(){
        System.out.println("Woof");
    }

}
class Cat extends Animal{
    public void makeSound(){
        System.out.println("Meow");
    }

}


//ZADANIE 16
class KontoBankowe{
    private int numerKonta;
    private int saldo;
    public KontoBankowe(int numerKonta, int saldo){
        this.numerKonta = numerKonta;
        this.saldo = saldo;
    }
    public void wplac(int wplata){
        saldo+=wplata;
        System.out.println("wplata przebiegla pomyslnie");
    }
    public void wyplac(int wyplata){
        if(saldo>wyplata){
            saldo-=wyplata;
            System.out.println("wyplata przebiegla pomyslnie oto twoje: "+wyplata);
        }
        else {
            System.out.println("za mala ilosc srodkow na koncie");
        }
    }
    public int pokazSaldo(){
        return saldo;
    }
}


public class Zadania14_15_16{
    public static void main(String[] args){

        //ZADANIE 14
        Rectangle kwadrat = new Rectangle(20,30);
        System.out.println(kwadrat.getArea());
        System.out.println(kwadrat.getPerimeter());


        //ZADANIE 15
        Cat kot = new Cat();
        Dog pies = new Dog();
        Animal zwierze = new Animal();

        kot.makeSound();
        pies.makeSound();
        zwierze.makeSound();


        //ZADANIE 16
        KontoBankowe mojeKonto = new KontoBankowe(213742069, 1337);
        System.out.println(mojeKonto.pokazSaldo());
        mojeKonto.wplac(69);
        System.out.println(mojeKonto.pokazSaldo());
        mojeKonto.wyplac(420);
        System.out.println(mojeKonto.pokazSaldo());
    }
}

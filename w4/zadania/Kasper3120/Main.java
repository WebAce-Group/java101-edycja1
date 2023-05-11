import java.io.*;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

class Rectangle {
    int length;
    int width;
    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    int getArea() { return length*width; }
    double getPerimeter() { return 2*length+2*width; }
}

abstract class Animal {
    abstract void makeSound();
}
class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof!");
    }
}
class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow!");
    }
}
class KontoBankowe {
    private String numerKonta;
    private float saldo;
    public void wplata(float kwota) {
        if (kwota > 0)
            this.saldo += kwota;
        else
            System.out.println("Błąd wpłaty");
    }
    public void wyplata(float kwota) {
        if (kwota > 0 && kwota < this.saldo )
            this.saldo -= kwota;
        else
            System.out.println("Błąd wypłaty");
    }
    public float getSaldo() { return this.saldo; }
}
class FileHandler {
    String file_name;
    FileReader fileReader;
    BufferedReader bufferedReader;
    FileWriter fileWriter;
    BufferedWriter bufferedWriter;
    ArrayList<String> lines = new ArrayList<String>();

    FileHandler(String file_name_in) {
        try {
            this.file_name = file_name_in;
            fileReader = new FileReader(this.file_name);
            bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fatal error! File not found!");
            System.out.println(e);
            System.exit(-1);
        } catch (IOException e) {
            System.out.println(e);
            System.exit(-1);
        }
    }
    void revWords() {
        try {
            fileWriter = new FileWriter(this.file_name);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (int o = 0; o < lines.size(); o++) {
                String line = lines.get(o);
                String[] words = line.split(",");
                String[] words_rev = new String[words.length];
                int j;
                for (int i = words.length-1; i >= 0; i--) {
                    j = words.length-i-1; // (0,1...words.length-1)
                    words_rev[j] = words[i];
                }
                bufferedWriter.write(String.join(",", words_rev) + "\n");
            }
            bufferedWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fatal error! File not found!");
            System.out.println(e);
            System.exit(-1);
        } catch (IOException e) {
            System.out.println(e);
            System.exit(-1);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle test_rec = new Rectangle(2, 3);
        System.out.println("Prostokąt 2 na 3");
        System.out.println("Pole: "+test_rec.getArea());
        System.out.println("Obwód: "+test_rec.getPerimeter());
        Dog burek = new Dog();
        Cat miauczek = new Cat();
        burek.makeSound();
        miauczek.makeSound();
        KontoBankowe konto = new KontoBankowe();
        System.out.println("Wpłata na konto 100 zl");
        konto.wplata(100);
        System.out.println("Wypłata z konta 50 zł");
        konto.wyplata(50);
        System.out.println("Saldo: " + konto.getSaldo());
        FileHandler handler = new FileHandler("students.csv");
        handler.revWords();
    }
}
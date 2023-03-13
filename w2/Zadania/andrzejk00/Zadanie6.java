package w2.Zadania.andrzejk00;

import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean flag = true;
        int value;
        while(flag){
            System.out.print("Podaj liczbe: ");
            value = scanner.nextInt();
            if(value == 0)
                flag = false;
        }
    }
}

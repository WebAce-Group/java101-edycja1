//import java.util.ArrayList;
//import java.util.Scanner;
import java.util.*;
public class Zadanie12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> namesArr = new ArrayList<String>();
        String nameInput;

//        fill
        for (int i = 0; i < 10; i++) {
            nameInput = scanner.nextLine();
            namesArr.add(nameInput);
        }
        System.out.println("Filled names array");
        for (String el : namesArr) {
            System.out.print(el + " ");
        }
        System.out.print("\n");

//        sort
        System.out.println("Sorted names array");
        Collections.sort(namesArr);
        for (String el : namesArr) {
            System.out.print(el + " ");
        }
        System.out.print("\n");
//        remove first element
        System.out.println("After removing 1st element");
        namesArr.remove(0);
        for (String el : namesArr) {
            System.out.print(el + " ");
        }
    }
}

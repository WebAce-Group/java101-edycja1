package zadanie17;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<String> tekst = new ArrayList<>();
    public static void main(String[] args) {
        try {
            wczytajPlik("students.csv");
            wpiszLinie();
        } catch (FileNotFoundException e) {
            System.err.println("nie można otworzyć pliku");
        }

        System.err.println("Chyba wszystko sie udalo");
    }




    public static void wczytajPlik(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner sc = new Scanner(file);

        while(sc.hasNextLine()){
            tekst.add(sc.nextLine());
        }
    }

    public static void wpiszLinie() throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("nowyPlik.txt");
        for(int i=tekst.size()-1;i>=0;i--){
            pw.println(tekst.get(i));
        }
        pw.close();
    }
}

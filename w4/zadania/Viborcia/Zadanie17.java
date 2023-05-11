package w4.zadania.Viborcia;

import java.io.*;
import java.util.ArrayList;

public class Zadanie17 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("java101-edycja1/w4/zadania/Viborcia/students.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        int licznikLinii = 0;
        ArrayList<String> tablica = new ArrayList<String>();
        while ((line = bufferedReader.readLine()) != null) {
            tablica.add(line);
            licznikLinii ++;
            System.out.println(line);

        }

        bufferedReader.close();

        FileWriter fileWriter = new FileWriter("java101-edycja1/w4/zadania/Viborcia/students2.csv",false );
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (int i=licznikLinii; i>0; i--)
        {
            bufferedWriter.write(tablica.get(i-1) + "\n");
        }

        bufferedWriter.close();

        System.out.println("\n"+"/////////////////////Drugi plik:///////////////////////////"+"\n");
        FileReader fileReader2 = new FileReader("java101-edycja1/w4/zadania/Viborcia/students2.csv");
        BufferedReader bufferedReader2 = new BufferedReader(fileReader2);
        String line2;

        while ((line2 = bufferedReader2.readLine()) != null) {
            System.out.println(line2);

        }

        bufferedReader2.close();
    }
}

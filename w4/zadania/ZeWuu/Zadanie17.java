import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zadanie17 {
   public static void main(String[] args) {
    try {
        File inputFile = new File("input.txt");
        Scanner reader = new Scanner(inputFile);

        int linie = 0;
        while (reader.hasNextLine()) {
            reader.nextLine();
            linie++;
        }
        reader.close();

        File outputFile = new File("output.txt");
        PrintWriter writer = new PrintWriter(outputFile);

        String[] linia = new String[linie];
        reader = new Scanner(inputFile);
        for (int i = 0; i < linie; i++) {
           linia[i] = reader.nextLine();
        }

        for(int i=linie-1; i>=0; i--){
            writer.print(linia[i] + "\n");
        }
        reader.close();
        writer.close();
        System.out.println("Plik został zmieniony");
    } catch (FileNotFoundException e) {
        System.out.println("Nie znaleziono pliku");
    }

    }
}


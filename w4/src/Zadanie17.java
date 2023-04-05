package w4.zadania.Ksromek;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Zadanie17 {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";
        int counter = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                counter++;
            }
        } catch (IOException e) {
            System.err.println("Błąd odczytu pliku: " + e.getMessage());
            System.exit(1);
        }

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             FileWriter fw = new FileWriter(outputFile)) {
            String line;
            for (int i = counter; i > 0; i--) {
                line = br.readLine();
                StringBuilder sb = new StringBuilder(line);
                fw.write(sb.reverse().toString() + "\n");
            }
        } catch (IOException e) {
            System.err.println("Błąd zapisu pliku: " + e.getMessage());
            System.exit(1);
        }

        System.out.println("Liczba linii w pliku wejściowym: " + counter);
        System.out.println("Plik wyjściowy został utworzony: " + outputFile);
    }
}


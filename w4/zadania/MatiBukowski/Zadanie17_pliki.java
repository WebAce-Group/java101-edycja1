package w4.zadania.MatiBukowski;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadanie17_pliki {

    private static String filename;
    private static List<String> list;
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj nazwę pliku, z którego chcesz odczytywać dane: ");
        filename = scanner.nextLine();
        read_data();
    }

    public static void read_data() throws IOException {
        int ilosc_lini = 0;
        list = new ArrayList<>();

        try {
            File file = new File(filename + ".txt");
            Scanner scanner = new Scanner(file);

            while(scanner.hasNext()) {
                String linia = scanner.nextLine();
                list.add(linia);
                ilosc_lini ++;
            }
            System.out.println("Ilość lini w pliku: " + ilosc_lini);
            scanner.close();

        }
        catch (Exception e) {
            System.out.println("Błędna nazwa pliku");
        }

        save_results(ilosc_lini);
    }

    public static void save_results(int ilos_lini) throws IOException {
        try {
            PrintWriter save = new PrintWriter("Zapis.txt");
            for(int i=ilos_lini-1; i>=0; i--) {
                save.write(list.get(i) + "\n");
            }
            save.close();
        }
        catch (Exception e) {
            System.out.println("Błąd w zapisie");
        }

    }
}

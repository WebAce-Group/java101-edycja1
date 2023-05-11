package zadania.Feredi123;
import java.io.*;
import java.util.ArrayList;

public class Zadanie17 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("students.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        ArrayList<String> linie = new ArrayList<String>();

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
            linie.add(line);
        }

        bufferedReader.close();

        System.out.println("Liczba lini w pliku: " + linie.size());



        FileWriter fileWriter = new FileWriter("students2.csv", true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for(int i = (linie.size()-1); i>0 ;i--){
            bufferedWriter.write(linie.get(i) + "\n");
        }

        bufferedWriter.close();

    }
}

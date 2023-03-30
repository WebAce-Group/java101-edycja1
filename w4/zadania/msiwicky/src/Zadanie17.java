import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Zadanie17 {
    public static void main(String[] args) throws IOException{
        FileReader fileReader = new FileReader("students.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        ArrayList<String> lista = new ArrayList<String>();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            lista.add(line);
        }
        bufferedReader.close();

        FileWriter fileWriter = new FileWriter("students2.csv", true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        Collections.reverse(lista);
        for (String element: lista) {
            bufferedWriter.write(element + "\n");
        }
        bufferedWriter.close();
    }
}

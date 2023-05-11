package wyklad4;
import java.io.*;
import java.util.HashMap;

public class zadanie17 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("zadanie.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        int counter = 0;
        HashMap<Integer, String> lines = new HashMap<Integer, String>();
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
            lines.put(counter, line);
            counter++;
        }
        bufferedReader.close();
        FileWriter filewriter = new FileWriter("zadanie.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(filewriter);
        int i;
        for (i = counter-1; i >= 0; i--) {
            bufferedWriter.write(lines.get(i));
            bufferedWriter.newLine();
            System.out.println(lines.get(i));
        }
        bufferedWriter.close();


    }
}
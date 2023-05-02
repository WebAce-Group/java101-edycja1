import java.io.*;
import java.util.ArrayList;

public class Zadanie17 {
    public static void main(String[] args) throws IOException{
        FileReader fileReader = new FileReader("students.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String linia;
        ArrayList<String> wszystkieLinie = new ArrayList<String>();
        int liczbaLinii=0;
        while ((linia=bufferedReader.readLine()) != null) {
            System.out.println(linia);
            wszystkieLinie.add(linia);
            liczbaLinii++;
        }
        bufferedReader.close();

        FileWriter fileWriter = new FileWriter("students2.csv", false);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (int i=liczbaLinii; i>0; i--)
        {
            bufferedWriter.write(wszystkieLinie.get(i-1) + "\n");
        }

        bufferedWriter.close();



        System.out.println();
        FileReader fileReader2 = new FileReader("students2.csv");
        BufferedReader bufferedReader2 = new BufferedReader(fileReader2);
        while ((linia=bufferedReader2.readLine()) != null) {
            System.out.println(linia);
        }
        bufferedReader.close();


    }
}
package w4.zadania.d9one;

import java.io.*;
import java.util.ArrayList;

public class z17 {
        public static void main(String[] args) throws IOException {
            FileReader fileReader = new FileReader("students.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linijka;
            ArrayList<String> tab = new ArrayList<>();
            int counter=0;
            while((linijka = bufferedReader.readLine()) != null){
                tab.add(linijka);
                counter++;
            }
            bufferedReader.close();

            FileWriter fileWriter = new FileWriter("students2.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for(int i=counter; i>0; i--){
                bufferedWriter.write(tab.get(i-1));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();

            System.out.println();

        }

    }


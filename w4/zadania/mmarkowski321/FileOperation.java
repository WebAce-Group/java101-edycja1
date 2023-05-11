package w4.zadania.mmarkowski321;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class FileOperation {
    public static void main(String[] args){
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader("file1.txt"));
            String line;
            ArrayList<String> array = new ArrayList<>();
            int numberOfLines=0;

            while ((line=bufferedReader.readLine()) != null) {
                System.out.println(line);
                array.add(line);
                numberOfLines++;
            }
            bufferedReader.close();

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file2.txt"));

            while(numberOfLines != 0){
                bufferedWriter.write(array.get(numberOfLines-1) + "\n");
                numberOfLines--;
            }
            bufferedWriter.close();

            BufferedReader bufferedReader2 = new BufferedReader(new FileReader("file2.txt"));

            while ((line=bufferedReader2.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

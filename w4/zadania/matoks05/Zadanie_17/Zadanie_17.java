package Zadanie_17;

import java.io.*;

public class Zadanie_17 {
    public static void main(String[]args) throws IOException {
        FileReader filereader = new FileReader("Tekst.txt");
        BufferedReader bufferedreader = new BufferedReader(filereader);
        String line;
        while((line = bufferedreader.readLine()) != null){
            System.out.println(line);
        }
        bufferedreader.close();
        FileWriter filewriter = new FileWriter("Tekst.txt",true);
        BufferedWriter bufferedwriter = new BufferedWriter(filewriter);
        bufferedwriter.write("Tekst.txt.txt");
        bufferedwriter.close();
    }
}

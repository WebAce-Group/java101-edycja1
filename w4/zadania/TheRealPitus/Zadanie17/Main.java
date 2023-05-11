package org.example;
import java.io.*;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        FileReader fileReader = new FileReader("liczby.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int lines = 0;
        String line;
        ArrayList<String> arrayList = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null)
        {
            arrayList.add(line);
            lines++;
        }
        bufferedReader.close();
        FileWriter fileWriter = new FileWriter("liczby_od_tylu.txt", true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (int i=lines-1; i>=0; i--)
        {
            bufferedWriter.write( arrayList.get(i)+"\n");
        }
        bufferedWriter.close();
    }
}

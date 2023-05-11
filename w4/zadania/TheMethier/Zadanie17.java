import java.io.IOException;
import  java.io.*;
import java.util.*;
;
public class Zadanie17 {
    public static void main(String[] args) throws IOException
    {
        FileReader fileReader = new FileReader("plik.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int n=0;
        Stack<String> lines=new Stack<String>();
        String line;
        int numberoflines=0;
        while ((line = bufferedReader.readLine()) != null) {
            lines.push(line);
            numberoflines++;
        }
        bufferedReader.close();
        int i=0;
        System.out.println(lines.peek());
        FileWriter fileWriter = new FileWriter("plikout.txt", true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        while(!(lines.empty()))
        {
            bufferedWriter.write(lines.peek());
            bufferedWriter.newLine();
            lines.pop();
            i++;
        }
        bufferedWriter.close();

    }

}

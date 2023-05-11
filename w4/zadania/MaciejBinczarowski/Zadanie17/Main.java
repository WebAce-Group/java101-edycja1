import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        FileReader fileReader = new FileReader("/home/maciej/studia/java101-edycja1/w4/zadania/MaciejBinczarowski/Zadanie17/students.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        ArrayList<String> lines = new ArrayList<String>();
        String line;

       while ((line = bufferedReader.readLine()) != null)
       {
            lines.add(line);
       } 

       bufferedReader.close();

       FileWriter fileWriter = new FileWriter("reversed students.csv");
       BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

       final int linesNumber = lines.size() - 1;
       for (int i = linesNumber; i >= 0; i--)
       {
            bufferedWriter.write(lines.get(i));
            bufferedWriter.newLine();
       }

       bufferedWriter.close();
    }
}
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class zadanie17 {
    public static void main(String[] args) throws IOException{
        
        FileReader fileReader = new FileReader("studenci.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        ArrayList<String> list = new ArrayList<String>();

        while ( (line = bufferedReader.readLine()) != null){
            list.add(line);
        }

        bufferedReader.close();


        Collections.reverse(list);


        FileWriter fileWriter = new FileWriter("students_rev.csv", true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (String newLine : list){
            bufferedWriter.write(newLine + '\n');
        }

        bufferedWriter.close();
    }
    
}

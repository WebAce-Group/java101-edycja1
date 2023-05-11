import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class zadanie17 {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("src/text.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        var array = new ArrayList<String>();
        String line = "";

        int i = 0;
        while ((line = bufferedReader.readLine()) != null){
            array.add(line);
        }

        bufferedReader.close();

        FileWriter fileWriter = new FileWriter("src/text.csv", false);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (int j = array.size()-1; j >= 0; j--) {
            bufferedWriter.write(array.get(j) + "\n");
        }

        bufferedWriter.close();
    }
}

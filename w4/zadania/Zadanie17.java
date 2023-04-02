import java.io.*;
import java.util.ArrayList;

public class Zadanie17 {
    public static void main(String[] args) throws IOException{
        FileReader fileReader = new FileReader("plikin.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        FileWriter fileWriter = new FileWriter("plikout.txt", true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        ArrayList<String> lista = new ArrayList<String>();
        String line;
        int iloscLini = 0;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
            lista.add(line);
            iloscLini++;
        }
        for(int i = (iloscLini - 1); i >= 0; i--){
            bufferedWriter.write(lista.get(i) + "\n");
        }
        System.out.println(iloscLini);

        bufferedReader.close();
        bufferedWriter.close();

    }
}

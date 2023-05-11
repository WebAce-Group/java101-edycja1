import java.io.*;
import java.util.ArrayList;

public class Zadanie17 {
    public static void main(String[] args) throws IOException{

        String filePath = "/home/user/IdeaProjects/java101-w4/src/students.csv";
        String filePathReversed = "/home/user/IdeaProjects/java101-w4/src/studentsReversed.txt";

        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        FileWriter fileWriter = new FileWriter(filePathReversed, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        ArrayList arrayList = new ArrayList<String>();
        int lineCount = 0;
        String line;

        while ((line = bufferedReader.readLine()) != null){
            lineCount++;
            System.out.println(line);
            arrayList.add(line);
        }
        System.out.println("Liczba lini w pliku to: "+lineCount);
        bufferedReader.close();

        for(int i = arrayList.size() - 1 ; i >= 0 ; i--){
            bufferedWriter.append((String) arrayList.get(i)).append("\n");
        }
        bufferedWriter.close();
    }
}

import java.io.*;
import java.util.ArrayList;

public class zadanie17
{
    public static void main(String[] args) throws IOException
    {
        FileReader fileReader = new FileReader("student.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        ArrayList<String> list = new ArrayList<>();

        String line;
        int n=0;

        while ((line = bufferedReader.readLine()) != null)
        {
            System.out.println(line);
            n++;
            list.add(line);
        }

        bufferedReader.close();

        System.out.println();
        System.out.println("----------------------");
        System.out.println();

        PrintWriter zapisz = new PrintWriter("student_new.txt");

        for (int i = (list.size()-1); i>0; i--)
        {
            zapisz.println(list.get(i));   
        }

        zapisz.close();

        FileReader fileReader_new = new FileReader("student_new.txt");
        BufferedReader bufferedReader_new = new BufferedReader(fileReader_new);

        while ((line = bufferedReader_new.readLine()) != null)
        {
            System.out.println(line);
            n++;
            list.add(line);
        }

        bufferedReader_new.close();
    }
}
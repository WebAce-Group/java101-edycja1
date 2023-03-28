import java.io.*;
import java.util.ArrayList;

public class Zadanie17
{

    public static void main(String[] args) throws IOException
    {

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Szymon\\OneDrive\\Java101\\W4\\src\\students.csv"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("studentsOUT.txt"));
        String line;
        int liczbaLini=0;
        ArrayList<String> linie = new ArrayList<>();
        while((line = br.readLine())!=null)
        {
            liczbaLini++;
            linie.add(line);
        }

        br.close();

        for (int i =linie.size()-1;i>=0;i--)
        {
            bw.write(linie.get(i));
            bw.write("\n");

        }
        bw.close();



    }






}

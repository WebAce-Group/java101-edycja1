import java.io.*;

public class Zadanie17 {
    public static void main(String args[]) throws IOException
    {
        FileReader fr = new FileReader("students1.txt");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter("students2.csv", true);
        BufferedWriter bw = new BufferedWriter(fw);

        String line;
        int nrOfLines=0;

        while((line = br.readLine()) != null)
        {
            System.out.println(line + "\n Line number: " + nrOfLines);
            nrOfLines++;
            //bw.write(line + "\n");
        }
        String[] tab = new String[nrOfLines];

        for(int i=nrOfLines-1; i>0; i--)
        {
            tab[i] = br.readLine();
        }
        for(int i=0; i<nrOfLines; i++)
        {
            bw.write(tab[i]);
        }


        br.close();
        bw.close();
    }
}

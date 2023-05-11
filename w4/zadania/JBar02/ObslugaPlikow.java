package w4.zadania.JBar02;

import java.io.*;
import java.util.Scanner;

public class ObslugaPlikow {

    public ObslugaPlikow() throws IOException {
    }

    public static String reverse(String tekst){
        char [] litery =new char[tekst.length()];
        int letterIndex=0;
        for(int i=tekst.length()-1;i>=0 ;i--){
           litery[letterIndex]= tekst.charAt(i);
            letterIndex++;
        }
        String odwrocony="";
        for(int i=0;i<tekst.length();i++){
            odwrocony=odwrocony+litery[i];
        }
        return odwrocony;
    }

    static int ilelinii;
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("C:/Users/kbarc/OneDrive/Pulpit/captmidn.txt");
        Scanner scan =new Scanner(file);

        String fileContent="";
        while (scan.hasNextLine()) {
          fileContent=fileContent.concat(scan.nextLine()+"\n");
            ilelinii++;
        }
        System.out.println("ile linii w tekscie"+ilelinii);


        //obrocenie pliku
        fileContent= reverse(fileContent);

        System.out.println(fileContent);


        //zapis pliku
        FileWriter writer = new FileWriter("C:/Users/kbarc/OneDrive/Pulpit/tekstObrocony.txt");
        writer.write((fileContent));
        writer.close();
        }
}

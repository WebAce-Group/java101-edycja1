package w4.zadania.hjxxzk;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Zadanie17 {

    public static void main(String[] args)  throws Exception {

        ArrayList<String> list = new ArrayList<>();
        int how_many = 0;

        String filename = "C:\\Users\\user\\Documents\\java101-edycja1\\w4\\students.csv";
        File file = new File(filename);
        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine())    {

           list.add(scanner.nextLine());
           ++how_many;

        }

        System.out.println("There are " + how_many + " lines in the file.");

        try {
            FileWriter writer = new FileWriter("output.txt");

            for(int i = how_many - 1; i >= 0; i--)   {

                writer.write(list.get(i) + "\n");

            }

            writer.close();

        } catch (IOException e) {

            e.printStackTrace();

        }

        scanner.close();

    }

}

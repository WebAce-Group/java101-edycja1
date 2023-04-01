import java.nio.file.Files;
import java.util.Collections;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Zadanie17 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        List<String> lines = new ArrayList<String>();
        int linesCounter = 0;

        System.out.println("Give filename with file extension to read data: ");
        String filename = scanner.nextLine();
        Path path = Paths.get(filename);
        boolean fileExists = Files.exists(path);

        // read from file
        try {
            FileReader fileReader = new FileReader(filename);
            bufferedReader = new BufferedReader(fileReader);
            System.out.println("Reading data from file...");

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                lines = bufferedReader.lines().collect(Collectors.toList());
                linesCounter++;
            }
            System.out.println("Lines in file: " + linesCounter);
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File does not exist");
        } catch (IOException e) {
            System.err.println("File exists, but there was IOException");
        }
        // write to file
        if (fileExists) {
            try {
                String outFilename = "output_" + filename;
                FileWriter fileWriter = new FileWriter(outFilename);
                bufferedWriter = new BufferedWriter(fileWriter);
                Collections.reverse(lines);
                System.out.println("Writing data to file...");
                for (String line : lines) {
                    bufferedWriter.write(line);
                    bufferedWriter.newLine();
                }
                System.out.println("Data written to: " + outFilename);
                bufferedWriter.close();
            } catch (FileNotFoundException e) {
                throw e;
            } catch (IOException e) {
                System.err.println("Something went wrong");
            }
        }
    }
}
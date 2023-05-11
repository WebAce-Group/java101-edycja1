import java.util.*;
import java.io.*;

class FileManagement
{
	public static void main(String args[]) throws IOException
	{
		FileReader fileReader = new FileReader("odczyt.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		FileWriter fileWriter = new FileWriter("zapis.txt", true);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		ArrayList<String> lines = new ArrayList<>(); 
		
		String line;
		while ((line = bufferedReader.readLine()) != null)
		{
			System.out.println(line);
			lines.add(line);
		}
		
		System.out.println("Liczba linii: " + lines.size());
		
		bufferedReader.close();
		
		for (int i=lines.size(); i>0; i--)
		{
			bufferedWriter.write(lines.get(i-1) + "\n");
		}
		
		bufferedWriter.close();
	}
}

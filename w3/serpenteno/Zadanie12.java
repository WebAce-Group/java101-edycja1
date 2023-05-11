import java.util.*;

public class Zadanie12
{
    public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> imiona = new ArrayList<String>();
		for (int i=0; i<10; i++)
		{
			System.out.println("Podaj imię nr " + (i+1) + ": ");
			imiona.add(scanner.nextLine());
		}
		Collections.sort(imiona);
        imiona.remove(0);
        for(String element: imiona)
		{
            System.out.println(element);
		}
	}
}

import java.util.*;

public class Zadanie13
{
    public static void main(String[] args) 
	{
		int wynik = 0;
		boolean warunek = true;
		Scanner scanner = new Scanner(System.in);
		Map<String, Integer> mapa = new HashMap<>();
		mapa.put("How much is the cost of the course?", 0);
		mapa.put("How much is 2 + 2?", 4);
		mapa.put("How much is 54 * 4?", 216);
		mapa.put("How much is 3 - 5?", -2);
		mapa.put("What is the suffix of our course name? (Java...)", 101);
		mapa.put("What is the current year?", 2023);
		mapa.put("How old is the lecturer", 21);
		
		while (warunek)
		{
			for (Map.Entry<String, Integer> pytania : mapa.entrySet())
			{
				System.out.print(pytania.getKey() + "\n");
				if (scanner.nextInt() == pytania.getValue())
					wynik++;
			}
			
			switch (wynik)
			{
				case 7:
					System.out.println("Uzyskana ocena: 6");
					break;
				case 6:
					System.out.println("Uzyskana ocena: 5");
					break;
				//Nie można uzyskać oceny 4
				case 5:
					System.out.println("Uzyskana ocena: 3");
					break;
				case 4:
					System.out.println("Uzyskana ocena: 2");
					break;
				default:
					System.out.println("Uzyskana ocena: 1");
			}
			wynik = 0;
			
			System.out.println("Zagrać ponownie? (1/0)");
			if (scanner.nextInt() == 0)
			{
				warunek = false;
			}
			else
				continue;

		}
	}
}

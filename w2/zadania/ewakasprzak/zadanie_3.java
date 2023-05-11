import java.util.Scanner;

public class zadanie_3
{
	public static boolean rownoboczny(int a, int b, int c)
	{
		if(a==b && b==c)
		{
			return true;
		}
		else return false;
	}

	public static boolean rownoramienny(int a, int b, int c)
	{
		if(a==b || b==c || a==c)
		{
			return true;
		}
		else return false;
	}

	public static boolean trojkat(int a, int b, int c)
	{
		if(a+b>=c && a+c>=b && b+c>=a)
		{
			System.out.print("da się utworzyć trójkąt ");
			return true;
		}
		else 
		{
			System.out.println("nie da się utworzyć trójkąta");
			return false;
		}
	}

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("podaj długość pierwszego boku: ");
                int  a = scan.nextInt();
		System.out.print("podaj długość drugiego boku: ");
                int b = scan.nextInt();
		System.out.print("podaj długość trzeciego boku: ");
                int c = scan.nextInt();

		if(trojkat(a,b,c))
		{
			if(rownoboczny(a,b,c)) System.out.println("równoboczny");
				else if(rownoramienny(a,b,c)) System.out.println("równoramienny");
					else System.out.println("różnoboczny");
		}
	}
}



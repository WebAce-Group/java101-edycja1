package w3.zadania.MaksymilianWis;
import java.util.Scanner;

public class ZadanieDodatkowe { //nie działa, nie mam czasu idę robić dyskretną
    static String SpinWords()
    {
        Scanner scan = new Scanner(System.in);

        String in = scan.nextLine();
        scan.close();

        int i=0, startIndex=0;
        for(char c:in.toCharArray())
        {
            System.out.println("test");
            if(in.charAt(i+1)==' ' && i>=5)
            {
                for(int k=0; k<i; k++)
                //{in.replace(in.charAt(startIndex+k), in.charAt(i-k));in.}
                System.out.println("test2");

                startIndex = i+1;
            }
            else i++;

        }

        return in;
    }

    public static void main(String[] args){
    System.out.println(SpinWords());
    }
}

import java.util.ArrayList;

public class Zadanie12
{
    public static void main(String[] args)
    {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Maciek");
        arrayList.add("Kamil");
        arrayList.add("Ola");
        arrayList.add("Adrian");
        arrayList.add("Paweł");
        arrayList.add("Antek");
        arrayList.add("Ewa");
        arrayList.add("Szymon");
        arrayList.add("Gosia");
        arrayList.add("Zuza");

        arrayList.sort(null);;

        arrayList.remove(0);

        for (String name: arrayList)
        {
            System.out.println(name);
        }

    }
}
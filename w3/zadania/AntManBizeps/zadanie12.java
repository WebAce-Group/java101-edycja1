import java.util.ArrayList;

public class zadanie12 {
    public static void main(String[] args) {
        ArrayList<String> listaImion = new ArrayList<String>();
        listaImion.add("Jan");
        listaImion.add("Stefan");
        listaImion.add("Marek");
        listaImion.add("Kuba");
        listaImion.add("Eminem");
        listaImion.add("Shrek");
        listaImion.add("Zygzak");
        listaImion.add("Twoja");
        listaImion.add("Stara");
        listaImion.add("Bartek");

        listaImion.sort(String::compareToIgnoreCase);
        listaImion.remove(0);

        for (String imie : listaImion){
            System.out.println(imie);
        }

    }
}

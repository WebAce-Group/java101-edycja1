import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class zadanie12 {
    public static void main(String[] args) {
        String[] name = {"ala", "ma", "kota", "maciej", "marcin", "krzysiek", "grzegorz", "brzeczyszczykiewicz", "max", "zbychu"};

        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < name.length; i++) {
            list.add(name[i]);
        }

        Collections.sort(list);
        list.remove(0);

        for (String _name : list) {
            System.out.print(_name + ", ");
        }
    }
}

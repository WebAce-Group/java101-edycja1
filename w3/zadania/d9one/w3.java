package w3.zadania.d9one;

import java.util.*;

import static java.lang.Math.*;
import static java.util.Collections.sort;

public class w3 {
    public static void zad9(){
        int[] tab = new int[10];
        int licznik = 0;
        for(int i=0; i<10; i++){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj liczbe: ");
            tab[i] = scanner.nextInt();
        }
        for(int x : tab){
            System.out.println((int)pow(x, licznik));
            licznik++;
        }

    }
    public static void zad10(){
        int w, k;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe wierszy: ");
        w = scanner.nextInt();
        System.out.println("Podaj liczbe kolumn: ");
        k = scanner.nextInt();
        int[][] tab = new int [w][k];
        int z=0;
        for(int i=0; i<w; i++){
            for(int j=0; j<k; j++){
                tab[i][j] = 1+z;
                z++;

            }
        }
        for(int i=0; i<w; i++){
            for(int j=0; j<k ;j++){
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0; i<w; i++){
            for(int j=0; j<k ;j++){
                System.out.print(tab[j][i] + " ");
            }
            System.out.println();
        }

    }
    public static void zad11(){
        int[] tab = new int[10];
        int[] tab2 = new int[10];
        Arrays.fill(tab, 0);
        for(int i=0; i<10; i++){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj liczbe: ");
            tab2[i] = scanner.nextInt();
        }
        Arrays.sort(tab);
        Arrays.sort(tab2);
//        for(int x : tab){
//            System.out.print(x + " ");
//        }
//        System.out.println();
//        for(int x : tab2){
//            System.out.print(x + " ");
//        }
    }
    public static void zad12(){
        List<String> lista =  new ArrayList<String>();
        lista.add("Basia");
        lista.add("Kasia");
        lista.add("Asia");
        lista.add("Andrzej");
        lista.add("Kuba");
        lista.add("Rafal");
        lista.add("Mikolaj");
        lista.add("Ilona");
        lista.add("Maciej");
        lista.add("Jerzy");
        sort(lista);
        System.out.println(lista);
        lista.remove(0);
        for(String x : lista){
            System.out.println(x);
        }

    }
    public static void zad13(){
        Map<String, Integer>  mapa = new HashMap<String, Integer>();
        mapa.put("How much is the cost of the course?", 0);
        mapa.put("How much is 2 + 2?", 4);
        mapa.put("How much is 54 * 4?", 216);
        mapa.put("How much is 3 - 5?", -2);
        mapa.put("What is the suffix of our course name? (Java...)", 101);
        mapa.put("What is the current year?", 2023);
        mapa.put("How old is the lecturer?", 21);
        int wybor, odp, punkty=0;
        while(true){
            System.out.println("Podaj cyfre 1 jesli chcesz zagrac albo 2 zeby zakonczyc gre");
            Scanner scanner = new Scanner(System.in);
            wybor = scanner.nextInt();
            switch(wybor){
                case 1:
                    for(String key: mapa.keySet()){
                        System.out.println(key);
                        odp = scanner.nextInt();
                        if(odp == mapa.get(key))
                            punkty++;
                    }
                    if(punkty==7)
                        System.out.println("Twoja ocena to: 6");
                    else if(punkty==6)
                        System.out.println("Twoja ocena to: 5");
                    else if(punkty==5 || punkty==4)
                        System.out.println("Twoja ocena to: 3");
                    else if(punkty<4)
                        System.out.println("Twoja ocena to: 1");
                    break;
                case 2:
                    return;
                default:
                    System.out.println("Podales zla cyfre");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        zad9();
        zad10();
        zad11();
        zad12();
        zad13();
    }
}
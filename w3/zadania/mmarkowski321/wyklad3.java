package w3.zadania.mmarkowski321;

import java.util.*;


public class wyklad3 {
    public static void main (String[] args){

        //zadanie 9
        int[] tab9 = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i< tab9.length;i++){
            System.out.println("Enter integer number: ");
            tab9[i] = scanner.nextInt();
            tab9[i] = (int) (Math.pow(tab9[i],i));
        }
        for (int p : tab9){
            System.out.printf("First number bullied by index: %d",p);
        }

        //zadanie 10
        int w,k;
        System.out.println("Enter number of rows in tab: ");
        w = scanner.nextInt();
        System.out.println("Enter number of columns in tab");
        k = scanner.nextInt();
        int z=1;
        int[][] tab10 = new int[w][k];
        for (int i = 0;i < w; i++){
            for (int j = 0;j < k;j++){
                tab10[i][j]=z;
                z++;
            }
        }
        for (int i = 0;i < w; i++){
            for (int j = 0;j < k;j++){
                System.out.print(tab10[i][j]+ " ");
            }
            System.out.println();
            System.out.println();
        }
        System.out.println("---------------------------------------------------------------------------------------");
        for (int i = 0;i < w; i++){
            for (int j = 0;j < k;j++){
                System.out.print(tab10[j][i]+ " ");
            }
            System.out.println();
            System.out.println();
        }
        //zadanie 11
        int[] tab11_1 = new int[10];
        Arrays.fill(tab11_1,0);
        int[] tab11_2 = new int[10];
        for (int i = 0; i < tab11_2.length; i++){

            System.out.println("Enter integer number: ");
            tab11_2[i] = scanner.nextInt();
        }
        Arrays.sort(tab11_1);
        Arrays.sort(tab11_2);
        for (int i = 0; i < tab11_2.length;i++){
            System.out.println(tab11_2[i]);
        }
        //zadanie 12
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Andrew");
        arrayList.add("John");
        arrayList.add("Peter");
        arrayList.add("Brus");
        arrayList.add("Bruno");
        arrayList.add("Jessica");
        arrayList.add("Angelika");
        arrayList.add("Nancy");
        arrayList.add("Jacob");
        arrayList.add("Charlotte");
        Collections.sort(arrayList);
        arrayList.remove(0);
        for (String p : arrayList){
            System.out.println(p);
        }
        //zadanie 13
        Map<String,Integer> map = new HashMap<>();
        map.put("How much is the cost of the course?",0);
        map.put("How much is 2 + 2?", 4);
        map.put("How much is 54 * 4?", 216);
        map.put("How much is 3 - 5?", -2);
        map.put("What is the suffix of our course name? (Java...)", 101);
        map.put("What is the current year?", 2023);
        map.put("How old is the lecturer?", 21);

        System.out.println("-----Let's play a game-----");

        boolean a = true;
        while(a != false){
            int amountOfPkt = 0;
            for (String p : map.keySet()){
                System.out.println("Answer on the question below");
                System.out.println(p);
                int value = scanner.nextInt();
                if (map.get(p) == value){
                    amountOfPkt++;
                }
            }

            double score = ((double) amountOfPkt/map.size())*100;
            System.out.printf("Your score in percents: %d \nYour grade:",Math.round(score));
            score = Math.round(score);
            //w tym miejscu nie wiem jak od razu zmienna score wlozyc do switcha jakbys mial pomysl prosze o komentarz, dzieki!
            int grade;
            if(score>95){
                grade = 6;
            } else if (score>85) {
                grade = 5;
            } else if (score>75) {
                grade = 4;
            } else if (score>65) {
                grade = 3;
            } else if (score>55) {
                grade = 2;
            }else {
                grade=1;
            }
            switch (grade){
                case 6 :
                    System.out.println("6");
                    break;
                case 5 :
                    System.out.println("5");
                    break;
                case 4 :
                    System.out.println("4");
                    break;
                case 3 :
                    System.out.println("3");
                    break;
                case 2 :
                    System.out.println("2");
                    break;
                case 1 :
                    System.out.println("1");
                    break;
                default:
                    System.out.println("No grade");

            }

            System.out.println("Would you like to play again? If yes enter true if no enter false");
            a = scanner.nextBoolean();
        }
    }
}

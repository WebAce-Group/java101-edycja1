public class Zadanie1 {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3, d = 4;
        int ab = a + b;
        int cd = c - d;
        double e = 1.1, f= 2.2, g= 3.3, h= 4.4;
        double ef = e * f;
        double gh = g / h;
        int reszta = ab % b;
        char i = 'A', j = 'a';
        int ij = i + j;
        String k = "Ala", l = "ma";
        String kl = k + l;
        boolean m = true, n = false;
        boolean mn = m && n;

        System.out.println("m: "+m+" n: "+n+" mn: " + mn);
        System.out.println("a:"+a+" b:"+b+ " c:"+c+" d:"+d+ " ab:"+ab+" cd:"+cd);
        System.out.println("e:"+e+" f:"+f+ " g:"+g+" h:"+h+ " ef:"+ef+" gh:"+gh);
        System.out.println("Reszta ab%b:" + reszta);
        System.out.println("i:"+i+" j:"+j+" ij:"+ij);
        System.out.println("k:"+k+" l:"+l+" kl:"+kl);
    }
}

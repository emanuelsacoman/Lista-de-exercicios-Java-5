public class App {
    public static void main(String[] args) {
        double n1 = 10;
        double n2 = 20;
        double n3 = 30;
        double n4 = 40;
        double n5 = 50;
        System.out.println("n1, n2, n3, n4, n5: " + n1 + " " + n2 + " " +
        n3 + " " + n4 + " "+ n5);
        System.out.println("Media de n1, n2, n3, n4 e n5:" +
        media(n1,n2,n3,n4,n5));
    }
    public static double media(double ... numeros) {
        double total = 0;
        for (double d: numeros)
        total += d;
        return total/numeros.length;
    }
}
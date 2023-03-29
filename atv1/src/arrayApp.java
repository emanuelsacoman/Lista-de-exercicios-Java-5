public class arrayApp{
    public static void main (String[ ] args) throws Exception {
        double [ ] array = { 32, 10, 50, 2, 20, 15, 12, 28, 15, 45};
        double Numeros [] = {1,2,3,4,5,6,7,9,8,10,12};
        System.out.printf("%s%8s\n"
        ,
        "Índice"
        ,
        "Valor");
        for (int i = 0; i < array.length; i++)
        System.out.printf("%d\t%f\n", i, array[i]);
        System.out.printf("===================================\n");
        for (int i = 0; i < Numeros.length; i++)
        System.out.printf("%d\t%f\n", i, Numeros[i]);
    }
}
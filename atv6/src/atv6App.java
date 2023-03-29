public class atv6App {
    public static int soma(int... numeros) {
        int resultado = 0;
        for (int numero : numeros) {
            resultado += numero;
        }
            return resultado;
    }
    public static void main(String[] args) {
        int soma1 = soma(1, 2, 3, 4, 5);
        int soma2 = soma(10, 20, 30);
        System.out.println("Soma1: " + soma1);
        System.out.println("Soma2: " + soma2);
    }
}
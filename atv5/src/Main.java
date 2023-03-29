import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int maxDiff = 0, maxDiffIndex = 0;
        System.out.println("Digite 10 números inteiros positivos:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < array.length - 1; i++) {
            int diff = Math.abs(array[i] - array[i + 1]);
            if (diff > maxDiff) {
            maxDiff = diff;
            maxDiffIndex = i;
        }
        }
        System.out.println("O par de posições consecutivas com a maior diferença é: " + maxDiffIndex + " e " + (maxDiffIndex + 1));
        boolean crescente = true, decrescente = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
            crescente = false;
            }
            if (array[i] < array[i + 1]) {
            decrescente = false;
            }
        }
        if (crescente) {
            System.out.println("a array está em ordem crescente.");
        }
        else if (decrescente) {
            System.out.println("a array está em ordem decrescente.");
        }
        else {
            System.out.println("a array não está ordenado.");
        }
            System.out.println("Digite um número inteiro positivo:");
        int x = sc.nextInt();
        int maior = 0, menor = 0, igual = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > x) {
            maior++;
            }
            else if (array[i] < x) {
            menor++;
            }
            else {
            igual++;
            }
        }
    System.out.println("Existem " + maior + " números maiores que " + x + " na array.");
    System.out.println("Existem " + menor + " números menores que " + x + " na array.");
    System.out.println("Existem " + igual + " números iguais a " + x + " na array.");
    }
}
public class atv7App {
    public static void main(String[] args) {
        int[][] A = new int[3][3];
        
        int contador = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
            A[i][j] = contador;
            contador++;
            }
        }
        
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
            System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}
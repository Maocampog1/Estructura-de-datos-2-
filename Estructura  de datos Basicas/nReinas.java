import java.util.Scanner;

public class nReinas {
    static int soluciones = 0;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        //System.out.println("Bienvenido\nIngresa el número de reinas para generar el tablero");
        //int n = scan.nextInt();
        int n = 4;
        int[] reinas = new int[n];
        nReinas(reinas, n, 0);
        System.out.println("Total de soluciones: " + soluciones);
    }

    public static void nReinas(int[] reinas, int n, int q) {
        if (q == n) {
            soluciones++;
            for (int i = 0; i < reinas.length; i++) {
                System.out.print(reinas[i] + " ");
            }
            System.out.println();
        } else {
            for (reinas[q] = 0; reinas[q] < n; reinas[q]++) {
                if (comprobar(reinas, q)) {
                    nReinas(reinas, n, q + 1);
                }
            }
        }
    }

    public static boolean comprobar(int reinas[], int q) {
        for (int i = 0; i < q; i++) {
            if (reinas[i] == reinas[q] || Math.abs(q - i) == Math.abs(reinas[q] - reinas[i])) {
                return false;
            }
        }
        return true;
    }
 
}

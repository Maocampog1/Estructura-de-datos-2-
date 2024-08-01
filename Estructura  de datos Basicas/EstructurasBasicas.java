import java.util.Scanner;

public class EstructurasBasicas {
    
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int[] vector = { 4, 7, 5, 2, 85, 9, 22 };
        System.out.println("Se encontró en la posición: " + busquedaLineal(vector, vector.length, 85));

        int[] vector2 = { 1, 2, 3, 4, 5, 6, 11 };
        System.out.println("Se encontró en la posición: " + busquedaLineal(vector2, vector2.length, 5));
        
    }

    static int busquedaLineal(int[] vector, int len, int v) {
        int i = 0;
        while (i < len && vector[i] != v) {
            i++;
        }
        return i < len ? i : -1;
    }
    static int busquedaBinaria(int[] vector, int len, int v) {
        int i = 0;
        int j=len-1;
        int k=0;
        boolean enc=false;

        while(i <=j && !enc){
            k=(i+j)/2;
            if (vector[k]==v){
                enc=true;
            }else{
                if(vector[k]<v){
                    i=k+1;
                }else{
                    j=k-1;
                }
            }

        }
        return enc?k:-1;

    }

    
}
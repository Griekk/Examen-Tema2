import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n%2 != 0 || n >= 1){
            dibujarVertical(n);
            dibujarHorizontal(n);
            dibujarVertical(n);
        } else System.out.println("Número no válido");

    }

    public static void dibujarVertical(int m){
        int i, j;
        for (i = 0; i < m / 2; i++) {
            for (j = 0; j < m / 2; j++) {
                System.out.print(" ");
            }
            System.out.println("X");
        }
    }

    public static void dibujarHorizontal(int m) {
        for (int i = 0; i < m; i++) {
            System.out.print("X");
        }
        System.out.print("\n");
    }
}

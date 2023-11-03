import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n % 2 == 0) {
            for(int i = 10; i<n; i+=5) {
                System.out.print(i + " ");
            }
        } else {
            for(int i = 10; i<n; i+=3) {
                System.out.print(i + " ");
            }
        }

    }
}
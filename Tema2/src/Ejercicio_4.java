import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        int planta, recorrido = 0, aux=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce las plantas por orden (-1 - SALIR): ");
        planta = sc.nextInt();

        while (planta >= 0) {
            aux = planta;
            planta = sc.nextInt();

            if (planta == -1) break;

            if (planta < 0) System.out.println("La planta no puede ser negativa");
            else {
                recorrido = recorrido + Math.abs(aux - planta);

            }
        }

        System.out.println(recorrido);





    }
}

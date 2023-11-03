import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        float calificacion, media = 0;
        int aprobados = 0, suspensos = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce las calificaciones (-1 - SALIR): ");

         while (true) {
             calificacion = sc.nextFloat();

             if (calificacion == -1) {
                 if(media == 0) System.out.println("No se han introducido calificaciones");
                 break;
             }

             if (calificacion < 0) System.out.println("La calificación no puede ser un numero negativo");
             else {
                 if(calificacion >= 5) aprobados++;
                 else suspensos++;

                 media += calificacion;
             }

         }

         if(media != 0){
            media = media/(aprobados+suspensos);
            System.out.printf("La media es %.2f\n", media);
            System.out.printf("Aprobados: %d - Suspensos: %d", aprobados, suspensos);
         }
    }
}

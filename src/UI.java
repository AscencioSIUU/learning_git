package src;

import java.util.Scanner;

public class UI {
     public static void main(String[] args) {
          Calc calcu = new Calc();
          System.out.println("LA MEJOR CALCU");
          Scanner teclado = new Scanner(System.in);
          int operacion, n1, n2;
          boolean flag = true;
          while (flag) {
               System.out.println("Operacion a realizar:  \n1. Suma \n2. Resta \n3. Multiplicación \n4. Salir");
               operacion = teclado.nextInt();
               switch (operacion) {
                    case 1:
                         System.out.println("Ingrese Primer Numero");
                         n1 = teclado.nextInt();
                         System.out.println("Ingrese Segundo Numero");
                         n2 = teclado.nextInt();
                         System.out.println("El resultado es: " + calcu.suma(n1, n2));
<<<<<<< HEAD

                         // NO SIUUUUUUUUU
=======
                         // SIUUUUUUUUUUU
                         System.out.println("SIUUUUUUUUU");
                         //// SIUuuuuuuuuuuuUUUUUU

>>>>>>> 60f6e69e3a287d5a3293a03f3c2b2d4be42ea57c
                         break;

                    case 2:
                         System.out.println("Ingrese Primer Numero");
                         n1 = teclado.nextInt();
                         System.out.println("Ingrese Segundo Numero");
                         n2 = teclado.nextInt();
                         System.out.println("El resultado es: " + calcu.resta(n1, n2));
                         break;

                    case 3:
                         System.out.println("Ingrese Primer Numero");
                         n1 = teclado.nextInt();
                         System.out.println("Ingrese Segundo Numero");
                         n2 = teclado.nextInt();
                         System.out.println("El resultado es: " + calcu.multiplicacion(n1, n2));
                         break;
                    case 4:
                         System.out.println("saliendo...");
                         flag = false;
                         break;

                    default:
                         System.out.println("Operación no valida XD");
                         break;
               }

          }

     }
}
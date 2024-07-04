import java.util.Scanner;

public class UI {
     public static void main(String[] args) {
          System.out.println("LA MEJOR CALCU");
          Scanner teclado = new Scanner(System.in);
          int operacion, n1, n2;
          while (true) {
               System.out.println("Operacion a realizar:  \n1. Suma \n2. Resta \n3. Multiplicación \n4. Divición");
               operacion = teclado.nextInt();
               switch (operacion) {
                    case 1:
                         System.out.println("Ingrese Primer Numero");
                         n1 = teclado.nextInt();
                         System.out.println("Ingrese Segundo Numero");
                         n2 = teclado.nextInt();

                         break;

                    case 2:
                         System.out.println("Ingrese Primer Numero");
                         n1 = teclado.nextInt();
                         System.out.println("Ingrese Segundo Numero");
                         n2 = teclado.nextInt();

                         break;

                    case 3:
                         System.out.println("Ingrese Primer Numero");
                         n1 = teclado.nextInt();
                         System.out.println("Ingrese Segundo Numero");
                         n2 = teclado.nextInt();

                         break;

                    default:
                         System.out.println("Operación no valida XD");
                         break;
               }

          }

     }
}
import java.util.Scanner;

/*
   Utility
*/

public class VectorOrdenado {
   public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      int nElementos, aux;

      System.out.print("Digite la longitud del vector: ");
      nElementos = leer.nextInt();

      int vector[] = new int[nElementos];

      System.out.println("\nIngrese los elementos del vector.");
      for (int k = 0; k < vector.length; k++) {
         System.out.print("Vector[" + (k+1) + "]: ");
         vector[k] = leer.nextInt();
      }

      /* Ordenamiento por método burbuja :: For Anidado*/
      for (int i = 0; i < (nElementos-1); i++) {
         for (int j = 0; j < (nElementos-1); j++) {
            if (vector[j] > vector[j+1]) {
               aux = vector[j];
               vector[j] = vector[j+1];
               vector[j+1] = aux;
            }
         }/* Finaliza el método de ordenamiento */
      }

      System.out.println("\nVector Ordenado en Forma Creciente:");
      for (int s = 0; s < nElementos; s++) {
         System.out.print("[" + vector[s] + "] ");
      }
      System.out.println("");

      System.out.println("Vector Ordenado en Forma Decreciente:");
      for (int f = (nElementos-1); f >= 0; f--) {
         System.out.print("[" + vector[f] + "] ");
      }
   }
}
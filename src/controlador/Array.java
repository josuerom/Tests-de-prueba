import java.util.Scanner;

/*
   Utility
*/
public class Array
{
	public static void main(String[] args)
	{ Scanner leer = new Scanner(System.in);
		int tLongitud, aux;
		

		System.out.print("Digite la longitud del array: ");
		tLongitud = leer.nextInt();

		int array[] = new int[tLongitud];

		System.out.println("\nRellene el array solo con numeros entre[0-10]:");

		do {
			
			boolean desordenada = false;
			
			for (int j = 0; j < tLongitud; j++) {
				System.out.print("Array[" + (j+1) + "]: ");
				array[j] = leer.nextInt();

				if (array[j] < 0 || array[j] > 10) {
					desordenada = true;
				}
			}

			if (desordenada == true) {
				System.err.println("\nERROR :: Haz ingresado un numero fuera del rango[0-10], por favor vuelva a digitar.\n");
			}

		} while(desordenada == true);
			
			System.out.println("\nSu Arrelo Original Es: ");
				for (int h = 0; h < tLongitud; h++) {
					System.out.print("[" + array[h] + "] ");							
				}

			for (int h = 0; h < tLongitud-1; h++) {
				for (int g = 0; g < tLongitud-1; g++) {
					if (array[g] > array[g+1]) {
						aux = array[g];
						array[g] = array[g+1];
						array[g+1] = aux;
					}
				}
			}

			System.out.println("\nPero su Arrelo Ordenado Es: ");
			for (int f = 0; f < tLongitud; f++) {
				System.out.print("[" + array[f] + "] ");
			}
	}
}
import java.util.Scanner;

/*
   Utility
*/
public class Arreglo
{
	public Arreglo()
	{ Scanner leer = new Scanner(System.in);
		int arr[] = new int[100];
		int sumaTotal = 0;
		float mediaArr = 0;

		System.out.println("\nLos Numeros[1-100] del Arreglo Son:");
		for (int i = 0, j = 1; i < 100; i++, j++) {
			arr[i] = j;
			sumaTotal += j;

			if (i == 10 || i == 20 || i == 30 || i == 40 || i == 50 || i == 60 || i == 70 || i == 80 || i == 90) {
				System.out.println("");
			}
			System.out.print("[" + arr[i] + "]");
		}
		System.out.println("\n");
		mediaArr = (float)sumaTotal /arr.length;

		System.out.println("La suma total = " + sumaTotal);
		System.out.println("La media total = " + mediaArr);
	}

	public static void main(String[] args)
	{ Arreglo vector = new Arreglo();
	}
}
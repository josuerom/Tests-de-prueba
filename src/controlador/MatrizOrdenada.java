/*Importo la primitiva de entrada de datos*/
import java.util.Scanner;

public class MatrizOrdenada
{
	public static void main(String[] args)
	{ Scanner leer = new Scanner(System.in);
		int nFilas, nCol, aux;

		System.out.print("Digite la cantidad de filas: ");
		nFilas = leer.nextInt();
		System.out.print("Digite la cantidad de columnas: ");
		nCol = leer.nextInt();

		int matriz[][] = new int[nFilas][nCol];

		System.out.println("\nIngrese los elementos de la matriz.");
		for (int i = 0; i < nFilas; i++) {
			for (int j = 0; j < nCol ; j++) {
				System.out.print("Matriz[" + i + "][" + j + "]: ");
				matriz[i][j] = leer.nextInt();
			}
		}

		/* Método de Ordenamiento Burbuja */
		for (int i = 0; i < nFilas; i++) {
			for (int j = 0; j < nCol; j++) {
				for (int h = 0; h < nFilas; h++) {
					for (int s = 0; s < nCol; s++) {
						if (matriz[i][j] > matriz[h][s]) {
							aux = matriz[i][j];
							matriz[i][j] = matriz[h][s];
							matriz[h][s] = aux;
						}
					}
				}
			}
		}/* Finaliza el método de ordenamiento burbuja para la matriz con 4 for anidados */

		/* Imprimo la matriz Ordenada en Orden Creciente */
		System.out.println("\nMatriz Ordenada Crecientemente.");
		for (int i = nFilas-1; i >= 0; i--) {
			for (int j = nCol-1; j >= 0 ; j--) {
				System.out.print("[" + matriz[i][j] + "]");
			}
			System.out.println("");
		}

		/* Imprimo la matriz Ordenada en Orden Decreciente */
		System.out.println("\nMatriz Ordenada Decrecientemente.");
		for (int i = 0; i < nFilas; i++) {
			for (int j = 0; j < nCol; j++) {
				System.out.print("[" + matriz[i][j] + "]");
			}
			System.out.println("");
		}
	}
}
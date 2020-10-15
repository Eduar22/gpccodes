import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	// Para buscar espacio entre elementos
	static int getNextGap(int gap) {
		gap = (gap * 10) / 13;
		if (gap < 1) {
			return 1;
		}
		return gap;
	}

	static void sort(int arr[]) {
		int n = arr.length;
		// Inicializa espacio
		int gap = n;
		boolean swapped = true;
		/*
		 * Mantiene ejecutando mientras gap es más que 1 y la ultima iteración causa un
		 * intercambio
		 */
		while (gap != 1 || swapped == true) {
			gap = getNextGap(gap);
			/*
			 * Inicializa swapped como falso, aso podemos verificar si el intercambio paso o
			 * no
			 */
			swapped = false;
			// Compara todos los elementos con el espacio actual
			for (int i = 0; i < n - gap; i++) {
				if (arr[i] > arr[i + gap]) {
					// Intercambia arr[i] y arr[i+gap]

					int temp = arr[i];
					arr[i] = arr[i + gap];
					arr[i + gap] = temp;
					// Se intercambió
					swapped = true;

				}
			}
		}

	}

	public static void main(String args[]) {
		int arr[] = { 8, 4, 1, 56, 3, -44, 23, -6, 28, 0 };
		sort(arr);
		System.out.println("Array ordenado");
		for (int i = 0; i < arr.length; ++i) {
			System.out.print(arr[i] + " ");
		}
	}
}

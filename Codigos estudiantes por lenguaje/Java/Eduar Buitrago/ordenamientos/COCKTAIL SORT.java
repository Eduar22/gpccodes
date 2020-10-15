import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
	static void cocktailSort(int a[]) {
		boolean swapped = true;
		int start = 0;
		int end = a.length;
		while (swapped == true) {
			// Resetea la bandera intercambiada al entrar
			// en el ciclo, porque puede ser true de la
			// anterior iteración
			swapped = false;
			// Ciclo del fondo a encima igual
			// que bubble sort
			for (int i = start; i < end - 1; ++i) {
				if (a[i] > a[i + 1]) {//para ordenar al contrari se cambia <
					int temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					swapped = true;
				}
			}
			// Si nada fue movido, array esta ordenado
			if (swapped == false) {
				break;
			}
			// de otra forma, resetea la bandera intercambiada
			// de tal forma que pueda ser usada en el
			// siguiente proceso
			swapped = false;
			// Mueve el punto final atras en uno, porque
			// el item al final esta en la derecha completa
			end = end - 1;
			// from top to bottom, doing the
			// same comparison as in the previous stage
			for (int i = end - 1; i >= start; i--) {
				if (a[i] > a[i + 1]) {//para ordenar al contrari se cambia <
					int temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					swapped = true;
				}
			}
			// Incrementa el punto inicial, por que
			// la ultima fase pudo haber movido el siguiente
			// más pequeño número en la derecha completa
			start = start + 1;
		}
	}

	/* Imprime el array */
	static void printArray(int a[]) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int a[] = { 5, 1, 4, 2, 8, 0, 2 };
		printArray(a);
		cocktailSort(a);
		System.out.println("Arreglo ordenado");
		printArray(a);
	}
}

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Main {
	/*
	 * Nota: Este programa solo funciona si el tamaño de la entrada es una potencia
	 * de 2
	 */

	/*
	 * El parámetro dir indica la dirección de ordenamiento, ASCENDIENDO o
	 * DESCENDIENDO; si (a [i]> a [j]) está de acuerdo con la dirección, entonces
	 * a[i] y a[j] son intercambiados
	 */
	static void compAndSwap(int a[], int i, int j, int dir) {
		if ((a[i] > a[j] && dir == 1) || (a[i] < a[j] && dir == 0)) {
			// intercambiando elementos
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
	}

	static void bitonicMerge(int a[], int low, int cnt, int dir) {
		if (cnt > 1) {
			int k = cnt / 2;
			for (int i = low; i < low + k; i++) {
				compAndSwap(a, i, i + k, dir);
			}
			bitonicMerge(a, low, k, dir);
			bitonicMerge(a, low + k, k, dir);
		}
	}

	static void bitonicSort(int a[], int low, int cnt, int dir) {
		if (cnt > 1) {
			int k = cnt / 2;
			// Ordena en orden ascendente, dir es 1
			bitonicSort(a, low, k, 1);
			// ordena en orden descendente, dir es 0
			bitonicSort(a, low + k, k, 0);
			// une toda la secuencia en orden ascendente
			bitonicMerge(a, low, cnt, dir);
		}
	}

	static void sort(int a[], int N, int up) {
		bitonicSort(a, 0, N, up);//ordene a[] desde pos0 hasta n.leng hacia arriba//(up)
	}

	/* Imprimir array */
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int a[] = { 3, 7, 4, 8, 6, 2, 1, 5 };
		int up = 1;//si cambiamos el 1 por 0 seria de mayour a menor
		printArray(a);//como esta dado el vector
		sort(a, a.length, up);
		System.out.println("\nArray ordenado");
		printArray(a);//ordenado
	}
}

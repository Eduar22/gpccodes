import java.util.Arrays;
import java.util.Scanner;

public class Main { // merge sort

	static void merge(int arr[], int l, int m, int r) {
		// Encuentra tamaños de dos subarrays a ser unidos
		int n1 = m - l + 1;
		int n2 = r - m;
		/* Crear arrays temporales */
		int L[] = new int[n1];
		int R[] = new int[n2];
		/* Copia datos en los arrays temporales */
		for (int i = 0; i < n1; ++i) {
			L[i] = arr[l + i];
		}
		for (int j = 0; j < n2; ++j) {
			R[j] = arr[m + 1 + j];
		}
		/* Une los arreglos temporales */
		// Indices iniciales del los dos subarrays
		int i = 0, j = 0;
		// indice inicial de array unido
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		/* Copia los elementos restanes de L[] si hay */
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		// Copia los elementos restanes de R[] si hay
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	static void sort(int arr[], int l, int r) {
		if (l < r) {
			// Encuentra el punto medio
			int m = (l + r) / 2;
			// Ordena los dos subarrays
			sort(arr, l, m);
			sort(arr, m + 1, r);
			// Une los subarrays
			merge(arr, l, m, r);
		}
	}

	// Imprimir array
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		int arr[] = { 12, 11, 13, 5, 6, 7 };
		System.out.println("Array dado");
		printArray(arr);
		sort(arr, 0, arr.length - 1);
		System.out.println("\nArray ordenado");
		printArray(arr);

	}
}

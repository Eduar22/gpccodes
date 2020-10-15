import java.util.Arrays;
import java.util.Scanner;

public class Main { // BinaryInsertionSort

	static void BinaryInsertionSort(int array[]) {
		for (int i = 1; i < array.length; i++) {
			int x = array[i];
			// Encontrar ubicación para insertar usando
			// Binary Search
			int j = Math.abs(Arrays.binarySearch(array, 0, i, x) + 1);
			System.arraycopy(array, j, array, j + 1, i - j);
			// Colocar elemento en su correcta localización
			array[j] = x;
		}
	}

	public static void main(String[] args) {

		int[] arr = { 37, 23, 0, 17, 12, 72, 31, 46, 100, 88, 54 };
		BinaryInsertionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

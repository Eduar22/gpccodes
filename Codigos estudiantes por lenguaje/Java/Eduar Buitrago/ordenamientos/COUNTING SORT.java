import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	static void sort(char arr[]) {
		int n = arr.length;
		// El array de caracteres que sera el array
		// ordenado de salida
		char output[] = new char[n];
		// Crea un array de conteo para almacenar
		// conteo individual de caracteres e inicializar
		// array de conteo en 0
		int count[] = new int[256];
		for (int i = 0; i < 256; ++i) {
			count[i] = 0;
		}
		// Almacena el conteo de cada caracter
		for (int i = 0; i < n; ++i) {
			++count[arr[i]];
		}
		// Cambian count[i] de forma que ahora contenga la
		// posición actual de este caracter en el array de saliday
		for (int i = 1; i <= 255; ++i) {
			count[i] += count[i - 1];
		}
		// Construye el array de caracteres de salida
		// Para hacerlo estable lo hacemos en orden inverso
		for (int i = n - 1; i >= 0; i--) {
			output[count[arr[i]] - 1] = arr[i];
			--count[arr[i]];
		}
		// Copia el array de salida a arr, asi arr ahora
		// contiene los caracteres ordenados
		for (int i = 0; i < n; ++i) {
			arr[i] = output[i];
		}
	}

	public static void main(String args[]) {
		char arr[] = { 'g', 'e', 'e', 'k', 's', 'f', 'o', 'r', 'g', 'e', 'e', 'k', 's' };
		sort(arr);
		System.out.print("array de caracteres ordenado: ");
		for (int i = 0; i < arr.length; ++i) {
			System.out.print(arr[i] + " ");
		}
	}
}

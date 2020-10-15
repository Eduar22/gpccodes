import java.util.Arrays;
import java.util.Scanner;

public class Main {

	// Clase conteniendo hijo izquierdo
	// y derecho del nodo actual, y
	// el valor del nodo (Key)
	static class Node {
		int key;
		Node left, right;

		public Node(int item) {
			key = item;
			left = right = null;
		}
	}

	// Raiz del arbol de busqueda
	// binaria
	static Node root;

	static void init() {
		root = null;
	}

	static void insert(int key) {
		root = insertRec(root, key);
	}

	/*
	 * Una función recursiva que inserta nuevos valores al arbol de busqueda binaria
	 */
	static Node insertRec(Node root, int key) {
		/*
		 * Si el arbol esta vacio
		 * 
		 * Guia del programador competitivo 139 Algoritmos de Ordenamiento Retorne un
		 * nuevo nodo
		 */
		if (root == null) {
			root = new Node(key);
			return root;
		}
		/* De otra forma, baja por el arbol */
		if (key < root.key) {
			root.left = insertRec(root.left, key);
		} else if (key > root.key) {
			root.right = insertRec(root.right, key);
		}
		/* Retorna la raiz */
		return root;
	}

	/*
	 * Una función que realiza recorrido inorden atraves del arbol
	 */
	static void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.print(root.key + " ");
			inorderRec(root.right);
		}
	}

	//---------para imprimir al reves
/*
	static void posorRec(Node root) {
		if (root != null) {
			inorderRec(root.right);
			System.out.print(root.key + " ");
			inorderRec(root.left);
		}
	}
	*/
	
	static void treeins(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			insert(arr[i]);
		}
	}

	public static void main(String[] args) {

		int arr[] = { 5, 4, 7, 2, 11 };
		treeins(arr);
		inorderRec(root);
	System.out.println();
	//posorRec(root);
	}

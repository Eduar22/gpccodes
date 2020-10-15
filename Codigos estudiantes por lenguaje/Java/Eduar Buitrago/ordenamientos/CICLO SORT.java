import java.util.*;
public class Main {
	public static int escritura = 0;
	    static void cyclesort(int vec[], int n) {
	        
	        for (int inicio_ciclo = 0; inicio_ciclo <= n - 2; inicio_ciclo++) {
	            int item = vec[inicio_ciclo];
	            int posicion = inicio_ciclo;
	            for (int i = inicio_ciclo + 1; i < n; i++) {
	                if (vec[i] < item) {
	                    posicion++;
	                }
	            }
	            if (posicion == inicio_ciclo) {
	                continue;
	            }
	            while (item == vec[posicion]) {
	                posicion++;
	                ;
	            }
	            if (posicion != inicio_ciclo) {
	                int aux = item;
	                item = vec[posicion];
	                vec[posicion] = aux;
	                escritura++;
	            }
	            while (posicion != inicio_ciclo) {
	                posicion = inicio_ciclo;
	                for (int i = inicio_ciclo + 1; i < n; i++) {
	                    if (vec[i] < item) {
	                        posicion++;
	                    }
	                }
	                while (item == vec[posicion]) {
	                    posicion++;
	                }
	                if (item != vec[posicion]) {
	                    int aux = item;
	                    item = vec[posicion];
	                    vec[posicion] = aux;
	                    escritura++;
	                }
	            }
	        }
	    }

	    static void soutvec(int vec[]) {
	        for (int i = 0; i < vec.length; i++) {
	            System.out.print(vec[i] + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	    	int arr[] = {1, 8, 3, 9, 10, 10, 2, 4};
	    	int n = arr.length;
	    	cyclesort(arr, n);
	    	System.out.println("Luego de ordenar : ");
	    	for (int i = 0; i < n; i++) {
	    	System.out.print(arr[i] + " ");
	    	}
	    	//System.out.println(escritura); cantidad de saltos
	    	}
	    	}
	        //Scanner sc = new Scanner(System.in);
	        //Random r = new Random();
	        //int vec[] = new int[200];
	        //for (int i = 0; i < vec.length; i++) {
	          //  vec[i] = r.nextInt(1000);
	       // }
	        //cyclesort(vec, vec.length);
	        //System.out.println("el arreglo ordenado");
	        //soutvec(vec);

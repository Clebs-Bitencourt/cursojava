package algoritmos.oo;

public class BubleSortApp {
	public static void main(String[] args) {
		int[] array = { 7, 6, 5, 4, 3, 2, 1, 0 };
		BubleSort2 bublesort = new BubleSort2(array);
		bublesort.ordenar();

	}
}

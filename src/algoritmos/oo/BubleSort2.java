package algoritmos.oo;

public class BubleSort2 {
	public int[] array;

	public BubleSort2(int[] array) {
		this.array = array;
	}

	public void ordenar() {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					int valorPosicao1 = array[j];
					array[j] = array[j + 1];
					array[j + 1] = valorPosicao1;
				}
			}
		}

		for (int w = 0; w < array.length; w++) {
			System.out.print(array[w]);
		}
	}

}

package algoritmos.estruturado;
public class BubleSort {
//	public static void main(String[] args) {
//
//		int esforco = 0;
//		int[] array = { 4, 3, 2, 1, 5,6, 7 };
//		//int[] array = { 7, 6, 2, 4, 3, 5, 1, 0};
//		boolean teveAlteracao = true;
//		while (teveAlteracao == true) {
//			teveAlteracao = false;
//			for (int i = 0; i < array.length - 1; i++) {
//				esforco++;
//				int b = i + 1;
//				int valorPosicao1 = array[i];
//				if (array[i] > array[b]) {
//					array[i] = array[b];
//					array[b] = valorPosicao1;
//					teveAlteracao = true;
//				}
//			}
//		}
//		for (int w = 0; w < array.length; w++) {
//			System.out.print(array[w]);
//		}
//		
//		System.out.println("\n esforço: " + esforco);
//	}
	
	
		
	public static void main(String[] args) {
		int esforco = 0;
		//int[] array = { 7, 6, 5, 4, 3, 2, 1, 0 };
		int[] array = { 7, 6, 2, 4, 3, 5, 1,0};
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				esforco++;
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

		System.out.println("\nesforço: " + esforco);
	}
}
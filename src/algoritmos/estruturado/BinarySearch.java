package algoritmos.estruturado;

public class BinarySearch {

	public static void main(String[] args) {
	
		char[] array = new char[]{'a', 'b', 'c', 'd', 'e', 'k', 'n', 'p', 'q', 'r', 's', 'u'};
		
		char buscado = 'k';
		
		int pos = -1;
	
		int ini = 0;
		int fim = array.length;
		int i = 0;
		while(true) {
			if (array[i] == buscado){
				pos = i;
				break;
			} else if (buscado > array[i]) {
				ini++;
				ini = ini + (fim - ini)/2;
				i = ini;
			} else if (buscado < array[i]) {
				fim--;
				ini = ini + (fim - ini)/2;
				i = ini;
			}
		}
		
	}

	
	
	
}

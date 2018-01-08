package algoritmos.estruturado;

import java.util.Arrays;

public class Algoritmos {
	public static void main(String[] args) {
		Integer[] numeros = new Integer[] { 5, 3, 8, 0, 4, 8 };
		minimoMaximo(numeros);

		char[] letras = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J' };
		procurar(letras, 'E');

		char[] letrasSubstituir = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J' };
		substituir(letrasSubstituir, 'E', 'X');

		char[] letrasInverter = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J' };
		inverter(letrasInverter);

		trianguloVazado('F', 6);
	}

	public static void minimoMaximo(Integer[] dados) {
		System.out.println("Minimo e máximo");
		System.out.println("--------------------------------------------");
		System.out.println("dados: " + Arrays.asList(dados));

		int menor = dados[0];
		int maior = dados[0];

		for (int i = 0; i < dados.length; i++) {

			if (dados[i] > maior) {
				maior = dados[i];
			}
			if (dados[i] < menor) {
				menor = dados[i];
			}
		}

		System.out.println("menor: " + menor);
		System.out.println("maior: " + maior);
	}

	public static void procurar(char[] dados, char procurado) {
		System.out.println("\n \n ");
		System.out.println("Procurar");
		System.out.println("----------------------------------------");
		System.out.print("dados: ");
		System.out.println(dados);
		int index = -1;

		for (int i = 0; i < dados.length; i++) {
			if (dados[i] == procurado) {
				index = i;
			}
		}

		System.out.println("procurado: " + procurado);
		System.out.println("index: " + index);
	}

	public static void substituir(char[] dados, char procurado, char troca) {
		System.out.println("\n \n ");
		System.out.println("Substituir");
		System.out.println("----------------------------------------");
		System.out.print("dados: ");
		System.out.println(dados);

		for (int i = 0; i < dados.length; i++) {
			if (dados[i] == procurado) {
				dados[i] = troca;
			}
		}

		System.out.println("procurado: " + procurado);
		System.out.println("troca: " + troca);
		System.out.print("Dados: ");
		System.out.println(dados);
	}

	public static void inverter(char[] dados) {
		System.out.println("\n \n ");
		System.out.println("Inverter");
		System.out.println("----------------------------------------");
		System.out.print("dados: ");
		System.out.println(dados);

		char[] inverso = new char[dados.length];
		int x = dados.length - 1;
		
		for (int i = 0; i < inverso.length; i++) {

			inverso[i] = dados[x - i];

		}
		System.out.print("inverso: ");
		System.out.println(inverso);
	}

	public static void trianguloVazado(char caracter, int tamanho) {
		int f=tamanho-1;
		for (int c = 0; c < tamanho; c++) {

			for (int d = 0; d <= c; d++) {
				
				if( d==0 || d==c || c==f ){
					
				System.out.print(caracter);
				}
				else{
					System.out.print(" ");
				}
				
			}
			System.out.print("\n");
		}

	}
}

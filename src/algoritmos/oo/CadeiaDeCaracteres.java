package algoritmos.oo;

public class CadeiaDeCaracteres {

	char[] caracteres = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J' };
	int[] numeros = { 2, 3, 4, 5, 1, 2, 9, 5 };

	public void procurar(char procurado) {
		System.out.println("\n ");
		System.out.println("Procurar");
		System.out.println("----------------------------------------");
		System.out.print("dados: ");
		System.out.println(caracteres);

		int index = -1;
		for (int i = 0; i < caracteres.length; i++) {
			if (caracteres[i] == procurado) {
				index = i;
			}
		}
		System.out.println("procurado: " + procurado);
		System.out.println("index: " + index);
	}

	public void minimoMaximo() {
		System.out.println("Minimo e máximo");
		System.out.println("--------------------------------------------");
		System.out.print("dados: ");
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + ", ");
		}
		int menor = numeros[0];
		int maior = numeros[0];
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > maior) {
				maior = numeros[i];
			}
			if (numeros[i] < menor) {
				menor = numeros[i];
			}
		}
		
		System.out.println("\n" + "menor: " + menor);
		System.out.println("maior: " + maior);
	}

	public void substituir(char procurado, char troca) {
		System.out.println("\n \n ");
		System.out.println("Substituir");
		System.out.println("----------------------------------------");
		System.out.print("dados: ");
		System.out.println(caracteres);

		for (int i = 0; i < caracteres.length; i++) {
			if (caracteres[i] == procurado) {
				caracteres[i] = troca;
			}
		}

		System.out.print("procurado: " + procurado);
		System.out.println("\n" + "troca: " + troca);
		System.out.print("Dados: ");
		System.out.println(caracteres);
	}

	public void inverter() {
		System.out.println("\n \n ");
		System.out.println("Inverter");
		System.out.println("----------------------------------------");
		System.out.print("dados: ");
		System.out.print(caracteres);

		char[] inverso = new char[caracteres.length];
		int x = caracteres.length - 1;
		for (int i = 0; i < inverso.length; i++) {
			inverso[i] = caracteres[x - i];
		}
		
		System.out.print("\n" + "inverso: ");
		System.out.print(inverso);

	}
}

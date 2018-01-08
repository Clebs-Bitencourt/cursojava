package algoritmos.oo;

public class TrianguloVazado {
	int tamanho;
	char caracter;

	public TrianguloVazado(int tamanho, char caracter) {
		this.tamanho = tamanho;
		this.caracter = caracter;
	}

	public void desenhar() {
		for (int c = 0; c < this.tamanho; c++) {
			for (int d = 0; d <= c; d++) {
				if (d == 0 || d == c || c == this.tamanho - 1) {
					System.out.print(this.caracter);
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}

	public static void main(String[] args) {

		TrianguloVazado tri = new TrianguloVazado(8, 'h');
		tri.desenhar();
	}
}
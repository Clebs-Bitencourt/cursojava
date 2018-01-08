package algoritmos.oo;

public class MeuInteiro extends Object {
	int valor;
	
	// contrutor obrigando declarar valor
	MeuInteiro(int valor) {
		this.valor = valor;
	}
	// objeto soma = valor + outro valor, retorna soma
	MeuInteiro mais(MeuInteiro outro) {
		MeuInteiro soma = new MeuInteiro(this.valor + outro.valor );
		return soma;
	}

	@Override
	public String toString() {
		return String.valueOf(this.valor);
	}

	public static void main(String[] args) {
		MeuInteiro numero1 = new MeuInteiro(10);
		MeuInteiro numero2 = new MeuInteiro(13);

		MeuInteiro resultado = numero1.mais(numero2);

		System.out.println("numero1: " + numero1);
		System.out.println("numero2: " + numero2);
		System.out.println("numero1 + numero2: " + resultado);

	}
}

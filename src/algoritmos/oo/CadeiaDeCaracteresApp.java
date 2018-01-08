package algoritmos.oo;

public class CadeiaDeCaracteresApp {
	public static void main(String[] args) {

		CadeiaDeCaracteres cadeiadecaracteres = new CadeiaDeCaracteres();
		
		char procurado = 'C';
		char troca = 'W';
		cadeiadecaracteres.minimoMaximo();
		cadeiadecaracteres.procurar(procurado);
		cadeiadecaracteres.substituir(procurado, troca);
		cadeiadecaracteres.inverter();

	}
}
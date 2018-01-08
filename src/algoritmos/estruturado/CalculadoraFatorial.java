package algoritmos.estruturado;
public class CalculadoraFatorial {
	public static void main(String[] args) {
		int y = 0;
		int result;
		int x = Integer.valueOf(args[0]);

		result = x;

		if (x != 0) {
			for (y = x - 1; y >= 1; y--) {
				result = result * y;
			}
		} else {
			result = 1;

		}
		System.out.println(result);
	}
}

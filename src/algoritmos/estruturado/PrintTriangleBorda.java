package algoritmos.estruturado;
public class PrintTriangleBorda {
	public static void main(String[] args) {
		int num = Integer.valueOf(args[0]);
		for (int c = 0; c < num; c++) {

			for (int d = 0; d <= c; d++) {
				System.out.print(" ");

				if (d == 0 || d == c) {
					System.out.print(args[1]);
				}
			}
			System.out.print("\n");
		}
	}
}
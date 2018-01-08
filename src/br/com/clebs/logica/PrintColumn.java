package br.com.clebs.logica;

public class PrintColumn {
	public static void main(String[] args) {
		int num = Integer.valueOf(args[0]);
		for (int c = 0; c < num; c++) {
			System.out.print(args[1]);
			System.out.print("\n");
		}
	}
}
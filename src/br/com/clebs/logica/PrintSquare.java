package br.com.clebs.logica;
public class PrintSquare{
	public static void main(String[] args){
		int num = Integer.valueOf(args[0]);
		for(int c=0; c < num; c++){
			for(int d= 0; d < num; d++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
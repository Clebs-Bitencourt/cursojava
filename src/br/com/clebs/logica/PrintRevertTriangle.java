package br.com.clebs.logica;

public class PrintRevertTriangle{
	
	public static void main(String[] args){
		int num = Integer.valueOf(args[0]);
		for(int c=0; c < num; c++){
			for(int d= 0; d < num-c; d++){	
				System.out.print(args[1]);
			}
			System.out.print("\n");  
		}
	}
}
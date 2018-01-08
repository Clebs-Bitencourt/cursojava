package algoritmos.estruturado;
public class Fibonacci {
	public static void main(String[] args) {

		int c;
		int a;
		int b;
		int x = Integer.valueOf(args[0]);
		
		a=1;
		b=2;
		c= a + b;
		System.out.println(a);
		System.out.println(b);
		
		while(c <= x){
			System.out.println(c);
			
			a=b;
			b=c;
			c=a+b;
		}
	}
}

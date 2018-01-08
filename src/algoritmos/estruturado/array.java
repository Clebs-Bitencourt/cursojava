package algoritmos.estruturado;
public class array {
	public static void main(String[] args) {

		int array [] = {1 , 2, 3, 4, 5, 6, 15};
		
		//int x = array[6];
		int qualovalor =15;
		
		System.out.println();
		for(int i = 0; i < array.length; i ++){
			
			if(array[i] >= qualovalor){
				
				qualovalor = array[i];
			}
		}
		System.out.println(qualovalor);

	}

}

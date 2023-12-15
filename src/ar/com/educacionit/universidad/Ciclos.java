package ar.com.educacionit.universidad;

public class Ciclos {

	public static void main(String[] args) {
		
		//for
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
		
		//While
		int j=0;
		while(j<10) {
			System.out.println(j);
			j++;
		}
		
		//do-while
		int l=0;
		do {
			System.out.println(l++);
		}while(l<10);
		
		
		//for each
		
		
		//arrays
		//const edades2 = [2,2,2,2,2,2];
		int[] edades = {0,1,2,3,4,5,6,7,8};
		int[] edades3 = new int[6];
		int[] edades4 = new int[]{0,1,2,3,4,5,6,7,8,9,10};
		
		//no existe el edades.push;
		
		
		for(int h = 0; h< edades.length ; h++) {
			edades3[h] = edades[h];
		}
		
		
		
	}
}

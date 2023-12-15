package ar.com.educacionit.universidad;

import java.util.Scanner;

public class Ejercicios {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de pedidos:");
		
		
		int cantidadPedidos= teclado.nextInt();
		float[] pedidos = new float[cantidadPedidos];
		
		
		for(int i = 0 ; i <cantidadPedidos ; i++) {
			System.out.println("Ingrese el valor del pedido " + (i+1) + ":");
			float valorPedido = teclado.nextFloat();
			pedidos[i]=valorPedido;
		}
		
		//Cierro el teclado
		teclado.close();
		
		float total=0;
		for(float valor : pedidos) {
			total= total +valor;
		}
		
		System.out.println("Valor promedio de los pedidos (pesos arg):");
		System.out.println("$" +  (total/cantidadPedidos));
		
	}

}

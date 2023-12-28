package ar.com.educacionit.universidad.maps.ordenables;

import java.util.Collection;
import java.util.Scanner;

import ar.com.educacionit.universidad.maps.Buscador;
import ar.com.educacionit.universidad.oop.ecommerce.Resultado;

public class MainBuscador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Request desde el front
		String orden = "MAS_VENDIDOS";
		String claveBuscadoPorElUsuario="Sailor Moon";
		int cantidadXPaginas = 20;
		
		
		
		//el objeto
		Buscador buscador = new Buscador( 
				ComparadorBuilder.getComparador(orden)
				);
		
		
		//Scanner teclado = new Scanner(System.in);//
		
		System.out.println("Buscar....");
		//String claveBuscadoPorElUsuario = teclado.next();
		//teclado.close();
		
		
		buscador.setClave(claveBuscadoPorElUsuario);
		buscador.setCantidadXPagina(cantidadXPaginas);
		buscador.buscar(); //???
		
		buscador.ordenar();
		
		System.out.println("Hemos encontrado " + buscador.getCantidad());
		
		Collection<Resultado> res=buscador.getResultado();
		
		for(Resultado resultado : res) {
			System.out.println(resultado);
		}
	}

}

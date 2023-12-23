package ar.com.educacionit.universidad.maps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

import ar.com.educacionit.universidad.oop.ecommerce.Libro;
import ar.com.educacionit.universidad.oop.ecommerce.Musica;
import ar.com.educacionit.universidad.oop.ecommerce.Pelicula;
import ar.com.educacionit.universidad.oop.ecommerce.Resultado;

public class Buscador {

	//Atributos
	private String clave;
	private Collection<Resultado> resultados;
	private Comparator<Resultado> orden;
	private int cantidadXPagina;
	
	
	
	//constructor
	public Buscador() {
		this.resultados = new ArrayList<>();
		this.clave="";
		orden = 
	}
	
	
	public Buscador(String clave, Resultado[] resultados) {
		
	}
	
	public void buscar() {
		//cuando usamos String
		if(claveVacia()) {
			System.out.println("La clave está vacía....");
			return;
		}
		//aca se llama al metodo getResultado(lista)
		Resultado res1 = new Libro("Sailor moon IV, Sailor Jupiter","https://cuspide.com/producto/4-sailor-moon/",500,"Naoko Takeuchi","12333",400,"Bla Bla BLa");
		Resultado res2 = new Musica("Sailor moon cd ","https://cuspide.com/producto/5-sailor-moon/",750,"Naoko Takeuchi","Sony",new String[] {"uno","dos","tre"});
		Resultado res3 = new Pelicula("Sailor moon The movie","https://cuspide.com/producto/12-sailor-moon/",1500,"Naoko Takeuchi","Warner","Blu-ray");

		//agregar los resultados al array resultados
		this.resultados.add(res3);
		this.agregarResultado(res1);
		this.agregarResultado(res2);
		this.agregarResultado(res3);
	
	
	
	}
	
	public String getClave() {
		return this.clave;
	}
	
	public boolean claveVacia() {
		return "".equals(this.clave.trim());
	}
	
	public void agregarResultado(Resultado res) {
		this.resultados.add(res);
	}
	
	/*
	private void setResultados(Collection<Resultado> res) {
		this.resultados = res;
	}
	*/
	
	public Collection<Resultado> getResultado() {
		
		return this.resultados;
	}
	
	
	
	public int getCantidad() {
		return this.resultados.size();
	}
	
	public void setClave(String clave) {
	
		this.clave = clave;
	}
	
	
}

package ar.com.educacionit.universidad.interfaces;

import java.util.Arrays;
import java.util.Iterator;

public class Persona {

	private String nombre;
	private IIdioma idiomaNativo;
	private IIdioma[] otrosIdiomas;
	
	
	//Constructor
	
	public Persona(String nombre, IIdioma idiomaNativo) {
		
		this.setNombre(nombre);
		this.setIdiomaNativo(idiomaNativo);
		setOtrosIdiomas(new IIdioma[0]);
		
	}
	
	private void setOtrosIdiomas(IIdioma[] idiomas) {
		// TODO Auto-generated method stub
		
		this.otrosIdiomas= idiomas;
	}

	private void setIdiomaNativo(IIdioma idiomaNativo) {
		// TODO Auto-generated method stub
		if(idiomaNativo == null) {
			System.out.println("Debe tener un idioma");
		}
		this.idiomaNativo= idiomaNativo;
		
		
	}

	public String getNombre() {
		return nombre;
	}

	public IIdioma getIdiomaNativo() {
		return idiomaNativo;
	}

	public IIdioma[] getOtrosIdiomas() {
		return otrosIdiomas;
	}

	public void setNombre(String nombre) {
		if(nombre==null) {
			System.out.println("Debe tener un nombre");
		}
		
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", idiomaNativo=" + idiomaNativo + ", otrosIdiomas="
				+ Arrays.toString(otrosIdiomas) + "]";
	}

	public void decir(String palabra) {
		
	
		this.idiomaNativo.decir(palabra);
	}
	
	public void decir(String palabra , IIdioma idioma) {
		if(idioma ==null || !sabeHablarIdioma(idioma)) {
			
			if(idioma instanceof IdiomaBase aux) 
						System.err.println(this.nombre + "No sabe hablar ...en  "+ aux.getDescripcion() );
			else
				System.err.println(this.nombre + "No sabe hablar ...en  "+ idioma.getClass().getSimpleName() );
			return;
		}
	
		idioma.decir(palabra);
		
	}
	
	public boolean sabeHablarIdioma(IIdioma idioma) {
		
		
				
		if(this.idiomaNativo.getClass().isAssignableFrom(idioma.getClass())) return true;
		
		boolean habla = false;
		
		//quiero recorrer el vector hasta 
		//que llege al final del array
		//habla = false
		for(IIdioma aux : this.otrosIdiomas) {
			
			for (int  i = 0; !habla &&  i < this.otrosIdiomas.length;  i++) {
				habla = this.otrosIdiomas[i].getClass().isAssignableFrom(idioma.getClass());
			}
			habla = aux.getClass().isAssignableFrom(idioma.getClass());
				break;
			
		}
		
		return habla;
	}

	public void aprender(IIdioma idioma) {
		// TODO Auto-generated method stub
		
		if(idioma == null) {
			System.err.println("Idioma nulo");
			return;
		}
		
		
		//esta clase es instancia de la otra??
		idioma.getClass().isAssignableFrom(this.idiomaNativo.getClass());
		
		if(this.idiomaNativo.getClass().isAssignableFrom(idioma.getClass())) {
			System.out.println("Ya habla: " + idioma.getClass());
			return;
		}
		
		for(IIdioma aux : this.otrosIdiomas) {
			if(aux.getClass().isAssignableFrom(idioma.getClass()));{
				System.out.println("Ya habla " + idioma.getClass());
				return;
			}
		}
		
		IIdioma[] aux = new IIdioma[this.otrosIdiomas.length + 1];
		for(int i =0 ; i< this.otrosIdiomas.length ; i ++ ) {
			aux[i] = this.otrosIdiomas[i];
		}
		
		aux[this.otrosIdiomas.length] = idioma;
	this.setOtrosIdiomas(aux);
	}
	


}

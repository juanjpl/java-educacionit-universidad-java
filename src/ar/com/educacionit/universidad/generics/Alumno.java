package ar.com.educacionit.universidad.generics;

import java.util.Objects;

public class Alumno implements Comparable<Alumno> {

	
	private String dni;
	private String nombre;
	private String apellido;
	private String curso;
	public Alumno(String dni, String nombre, String apellido, String curso) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.curso = curso;
	}
	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", curso=" + curso + "]";
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(apellido, curso, dni, nombre);
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		Alumno other = (Alumno) obj;
		
		return Objects.equals(apellido, other.apellido) && Objects.equals(curso, other.curso)
				&& Objects.equals(dni, other.dni) && Objects.equals(nombre, other.nombre);
	}
	
	
	@Override
	public int compareTo(Alumno o) {
		
		
		/*
		 *  1 a-b >0 => a es > b
		 *  2 a-b <0 => a es < b 
		 *  3 a-b =0 => a es igual a b
		 * 
		
		
		this.dni es un atributo de Alumno
		this.dni es un String ---> ya tiene implementado .compareTo(String)
		 * */
		
		//return this.dni.compareTo(o.getDni());
		
		//return o.getDni().compareTo(this.dni);
		
		int cmp = o.getDni().compareTo(this.dni);
		
		if(cmp == 0) {
			cmp = o.getApellido().compareTo(this.apellido);		}
		
		return cmp;
		
	
	}
	
}

package ar.com.educacionit.universidad.generics;

import java.util.Objects;

public class Alumno {

	
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
	
	
	
}

package ar.com.educacionit.universidad.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class CollectionListMethodsMain {

	
	public static void main(String[] args) {
		

		
		Collection<Alumno> alumnos = new ArrayList<>();
		
		
		alumnos.add(new Alumno("123456798","Apellido","nombre","curso"));
		alumnos.add(new Alumno("123456798","Apellido","nombre","curso"));
		alumnos.add(new Alumno("123456798","Apellido","nombre","curso"));
		alumnos.add(new Alumno("123456798","Apellido","nombre","curso"));
		
		System.out.println(alumnos);
		
		
		
Collection<Alumno> alumnos2 = new HashSet<>();
		
		
		alumnos2.add(new Alumno("123456798","Apellido","nombre","curso"));
		alumnos2.add(new Alumno("123456798","Apellido","nombre","curso"));
		alumnos2.add(new Alumno("123456798","Apellido","nombre","curso"));
		alumnos2.add(new Alumno("123456798","Apellido","nombre","curso"));
		
		System.out.println(alumnos);
		
	
		
		
		
		
	}
}

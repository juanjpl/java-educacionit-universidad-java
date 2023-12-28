package ar.com.educacionit.universidad.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class CollectionTreeSetListMethodsMain {

	
	public static void main(String[] args) {
		
	Collection<Alumno> alumnos = new HashSet<>();
		
	Alumno a = new Alumno("123456798","Apellido","nombre","curso");
	Alumno b = new Alumno("123456798","Apellido","nombre","curso");
	
		
	alumnos.add(a);
	alumnos.add(b);
	
	
		System.out.println(alumnos);
		
		
		

		
	}
}

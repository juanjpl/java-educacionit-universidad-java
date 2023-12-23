  package ar.com.educacionit.universidad.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class CollectionHashSetListMethodsMain {

	public static void main(String[] args) {
		
	Collection<Alumno> alumnos = new TreeSet<>(new AlumnoCursoAsc());
		
	Alumno a = new Alumno("12345600","Lopez","Carlos","java");
	Alumno b = new Alumno("12345601","Lima","Juan","Bootcamp java");
	Alumno c = new Alumno("12345602","Perazzo","Sebastian","Javascript");
	Alumno d = new Alumno("12345603","Perazzo","Hernan","Go");
		
	alumnos.add(a);
	alumnos.add(b);
	alumnos.add(c);
	alumnos.add(d);
	
	
	System.out.println(alumnos);
	
	
	for (Alumno alumno : alumnos) {
		System.out.println(alumno);
	}
		
	//Streams + lambdas
	alumnos.forEach(al -> System.out.println(al));
	
	
	//orden externo
	//usando el Comparator<T>
	
	System.out.println("................................................");
	
	alumnos = new ArrayList<>(alumnos);
	
	/*
	Collections.sort((List<Alumno>)alumnos, new Comparator<Alumno>(){
		
		public int compare(Alumno o1, Alumno o2) {
			return o1.getNombre().compareTo(o2.getNombre());		
			};
	});
	*/
	
	Collections.sort((List<Alumno>)alumnos, new ApellidoComparator(DireccionEnum.ASC));
	

	
	alumnos.forEach(al -> System.out.println(al));

		
	}
}

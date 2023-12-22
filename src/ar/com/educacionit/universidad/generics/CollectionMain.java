package ar.com.educacionit.universidad.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionMain {

	
	public static void main(String[] args) {
		
		//java collection framework
		int [] Alumno = new int[2];
		
		
		Iterable<Alumno> alumnoIterable = new ArrayList<>();
		
		Collection<Alumno> alumnos = new ArrayList<>();
		
		List<Alumno> alumnoList = new ArrayList<>();
		
		ArrayList<Alumno> alumnoArrayList = new ArrayList();
		
		var list = new ArrayList<Alumno>();
		//Ahora puedo agregar datos
		
		
		alumnos.add(new Alumno("123456798","Apellido","nombre","curso"));
		if(!alumnos.contains(alumnoArrayList)) {
			alumnos.add(new Alumno("123456798","Apellido","nombre","curso"));
			alumnos.add(new Alumno("123456798","Apellido","nombre","curso"));
		}
		
		
		System.out.println(alumnos);
		
		
		
	}
}

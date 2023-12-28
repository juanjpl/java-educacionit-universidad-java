package ar.com.educacionit.universidad.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionSetListMethodsMain {

	
	public static void main(String[] args) {
		
		//java collection framework
		int [] Alumno = new int[2];
		
		
		Iterable<Alumno> alumnoIterable = new ArrayList<>();
		
		Collection<Alumno> alumnos = new ArrayList<>();
		
		List<Alumno> alumnoList = new ArrayList<>();
		
		ArrayList<Alumno> alumnoArrayList = new ArrayList();
		
		var list = new ArrayList<Alumno>();
		//Ahora puedo agregar datos
		
		
		alumnos.add(new Alumno("12345679","Apellido","nombre","curso"));
			alumnos.add(new Alumno("12345680","Apellido","nombre","curso"));
			alumnos.add(new Alumno("12345690","Apellido","nombre","curso"));
		
		
		
		System.out.println(alumnos);
		
		//size
		System.out.println("Tamaño: " + alumnos.size());
		
		//tiene elementos?
		System.out.println("Vacio? " + alumnos.isEmpty());
		
		//limpiar
		//System.out.println(alumnos.clear());
		
		//elimnar elementos MAL
		
		/*
		
		for(var alumno : alumnos) {
			if(alumno.getDni().equals("12345680") || alumno.getDni().equals("1234569078")) {
				alumnos.remove(alumno);
			}
		}
		
		for(var alumno : alumnos) {
		
				alumnos.remove(alumno);
			
		}
		*/
		
		
		//usar el iterator
		
		Iterator<Alumno> itAlumno = alumnos.iterator();
		
		while(itAlumno.hasNext()) {
			var alumno = itAlumno.next();
			if(alumno.getDni().equals("12345680") || alumno.getDni().equals("1234569078")) {
				alumnos.remove(alumno);
			}
			System.out.println("Se elimino: " + alumno);
		}
		
		
		
		
	}
}

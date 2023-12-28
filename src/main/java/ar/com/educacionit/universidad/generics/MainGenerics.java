package ar.com.educacionit.universidad.generics;

public class MainGenerics {

	/*
	 * La idea es convertir en base a un parametro un vector de datos
	 * 
	 */

	public static void main(String[] args) {

		String tipoQueVieneDelFrontEnd = "CSV";

		// Crear un alumno
		Alumno alumno = new Alumno("31752450", "Perez", "Juan", "Java");

		// Creamos el parse
		IParser<String> parser = new CSVParser(alumno);

		//parseamos
		String dato = parser.parse();

		// Muestro
		System.out.println(dato);

	}
}
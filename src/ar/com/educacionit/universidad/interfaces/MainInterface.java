package ar.com.educacionit.universidad.interfaces;

public class MainInterface {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IIdioma idioma = new Ingles();
		var persona = new Persona("Carlos",idioma);
		
		String palabra = "Hola";
		persona.decir(palabra);
		
		
		//aprende un nuevo idioma
		idioma = new Espaniol();
		persona.aprender(idioma);
	}

}

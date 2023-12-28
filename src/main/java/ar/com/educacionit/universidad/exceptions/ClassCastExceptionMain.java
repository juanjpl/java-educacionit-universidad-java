package ar.com.educacionit.universidad.exceptions;

public class ClassCastExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//estos errores 
		String a = "hola";
		Object o= true;
		
		//error en tiempo de compilacion
		a=(String)o;
		
		System.out.println(a);
		/* RUNTIME EXCEPTION
	
		
		
		//No puede ser casteado.
		 * 
		IIdioma idioma = new Ingles();
		IKPI kpi = new Atendidos();
		
		Object aux = idioma;
		kpi = (IKPI)aux;
		*/
		
		
	}

}

package ar.com.educacionit.universidad.interfacesII;

public class Consola implements IMensaje {

	@Override
	public void enviar(Mensaje msj) {
System.out.println("Mensaje de Default.----- " + msj);

	}

}

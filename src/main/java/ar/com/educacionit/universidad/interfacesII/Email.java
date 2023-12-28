package ar.com.educacionit.universidad.interfacesII;

public class Email implements IMensaje {

	@Override
	public void enviar(Mensaje msj) {
		System.out.println("Enviando ..... Email" + msj);

	}

}

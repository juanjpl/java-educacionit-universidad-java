package ar.com.educacionit.universidad.interfacesII;

public class SMS implements IMensaje {

	//Aca puedo tener la cantidad de atrubutos que necesite
	@Override
	public void enviar(Mensaje msj) {
		System.out.println("enviando ...... SMS" + msj);
	}

}

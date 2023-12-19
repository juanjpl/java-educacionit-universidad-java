package ar.com.educacionit.universidad.interfacesII;

//aplicacion de consola
//mañana puede ser una API REST
public class MainMensajero {

	public static void main(String[] args) {
	
		String mensajeAEnviar = "Quiero comer pizza de jamon y morron";
		
		String origen ="origen";
		String destino = "Destino Bla";
		String path = "path bla";
		String asunto = "----------------------";
		
		//Validar mensaje
		
		DB db = new DB();
		String tipo = db.getTipo();
		
		IMensaje mensajeria = MensajeriaBuilder.buildMensajeria(tipo);		
		Mensaje mensaje = MensajeriaBuilder.buildMensaje(tipo, origen, destino, path, asunto,mensajeAEnviar);
		
		Mensajero mensajero = new Mensajero();
		mensajero.setMensajeria(mensajeria);
		mensajero.enviarMensaje(mensaje);

	}

}

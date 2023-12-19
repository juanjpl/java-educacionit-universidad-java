package ar.com.educacionit.universidad.interfacesII;

public class MensajeriaBuilder {

	public static IMensaje buildMensajeria (String tipo) {
		
		if(tipo == null) {
			System.err.println("No se ha encontrado tipo de mensaje");
			return null;
		}
		IMensaje mensajeria;
		
		switch (tipo) {
		case "SMS":  
			mensajeria = new SMS(); 
			break;
		case "Email":  
			mensajeria = new Email(); 
			break;
		case "FileSystem":  
			mensajeria = new FileSystem(); 
			break;
		default: 
			mensajeria = new Consola(); 
			break;
			
		
		
		}
		return mensajeria;
	}
	
	public static Mensaje buildMensaje (String tipo, String origen, String destino, String path,String asunto,String mensajeAEnviar) {
		
		
		Mensaje mensaje;
		
		switch (tipo) {
		case "SMS":  
			mensaje = new Network(path, destino, origen); 
			break;
		case "Email":  
			mensaje = new Network(path,destino,origen); 
			break;
		case "FileSystem":  
			mensaje = new FS(destino,path); 
			break;
		default: 
			mensaje = new Default(); 
			break;
			
		
		
		}
		mensaje.setContenido(mensajeAEnviar);
		return mensaje;
	}
}





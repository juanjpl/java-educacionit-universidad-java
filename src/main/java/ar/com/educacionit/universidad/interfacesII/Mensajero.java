package ar.com.educacionit.universidad.interfacesII;

public class Mensajero {

	private IMensaje mensajeria; //null
	
	/*
	//composicion
	public Mensajero(IMensaje mensajeria) {
		this.mensajeria = mensajeria;
	}
	
	public void enviarMensaje() {
		
	}
	*/
	
	// Agregacion
	 
	 public void enviarMensaje(Mensaje msj){
	 
		 if(msj == null) {
			 System.err.println("No hay mensjaseria disponible!");
		 }
		 
		 this.mensajeria.enviar(msj);
	 
	 
	 }
	 
	 public void setMensajeria(IMensaje mensajeria){
 this.mensajeria = mensajeria;
	 }
	 
	  
	 
}

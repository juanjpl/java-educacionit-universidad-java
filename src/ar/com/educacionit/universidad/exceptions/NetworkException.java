package ar.com.educacionit.universidad.exceptions;

public class NetworkException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1003237484212756669L;
	
	//atributos propios
	private String estado;
	
	public NetworkException(String msj) {
		super(msj);
	}
	
	
	public void setEstado(String estado) {
		
	}


	public String getEstado() {
		return estado;
	}
}

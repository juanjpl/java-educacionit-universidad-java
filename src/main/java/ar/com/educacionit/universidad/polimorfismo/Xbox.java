package ar.com.educacionit.universidad.polimorfismo;

public final class Xbox extends Consola {

	
	//Atributos propios
	private boolean tieneConexionAInternet;
	private int memoria;
	private boolean digital;
	private DiscoExterno discoExterno;
	
	/*
	 * La play debe tener su propio constructor 
	 * debe llamar al padre con ----- extends
	 */
	
	public Xbox(String serie, String color, boolean tieneConexion,int memoria, boolean digital) {
		/*
		 * super: hace referencia al padre
		 * super() ----invocar al constructor de ese padre
		 */
		//atributos del padre
		super(serie,"Microsoft","Xbox360",color);
		
		
		//atributos propios
	
		this.digital = digital;
		this.tieneConexionAInternet= tieneConexion;
	}

	public DiscoExterno getDiscoExterno() {
		return discoExterno;
	}

	public void setDiscoExterno(DiscoExterno discoExterno) {
		this.discoExterno = discoExterno;
	}

	public boolean isTieneConexionAInternet() {
		return tieneConexionAInternet;
	}

	

	public int getMemoria() {
		return memoria;
	}

	public boolean isDigital() {
		return digital;
	}

	

	
	
}

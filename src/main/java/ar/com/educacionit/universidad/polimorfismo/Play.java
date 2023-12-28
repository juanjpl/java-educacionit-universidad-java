package ar.com.educacionit.universidad.polimorfismo;

public class Play extends Consola {

	
	//Atributos propios
	private boolean tieneConexionAInternet;
	private int memoria;
	private boolean digital;
	private int version;
	private DiscoExterno discoExterno;
	
	/*
	 * La play debe tener su propio constructor 
	 * debe llamar al padre con ----- extends
	 */
	
	public Play(String serie, String color, int version,boolean tieneConexion,int memoria, boolean digital) {
		/*
		 * super: hace referencia al padre
		 * super() ----invocar al constructor de ese padre
		 */
		//atributos del padre
		super(serie,"Sony","Playstation"+version,color);
		
		
		//atributos propios
		this.version = version;
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

	public int getVersion() {
		return version;
	}

	@Override
	public void play() {
		super.play();
		System.out.println("Jugando con la Play");
	}
	
	
}
